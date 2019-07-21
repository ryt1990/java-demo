package com.ryt.demo.config.gungnir;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author renyutao
 * @date 2019/6/26 17:11
 */
@Configuration
@EnableConfigurationProperties({com.ryt.demo.config.gungnir.MssqlGungnirDataSourceProperties.class})
@MapperScan(value = {"com.ryt.demo.dal.mssql.entity", "com.ryt.demo.dal.mssql.mapper"}, sqlSessionFactoryRef = "gungnirSqlSessionFactory")
@ConditionalOnProperty(name = "mssql.gungnir.druid.datasource.url", matchIfMissing = false)
public class MssqlGungnirDataSource {
    static final String MAPPER_LOCATION = "classpath*:sqlmap/mapper/*Mapper.xml";

    @Autowired
    private com.ryt.demo.config.gungnir.MssqlGungnirDataSourceProperties druidDataSourceProperties;

    @Bean(name = "gungnirDruidDataSource", initMethod = "init", destroyMethod = "close")
    @ConditionalOnMissingBean(name = "gungnirDruidDataSource")
    @Primary
    public DruidDataSource dashboardDruidDataSource() throws Exception {
        DruidDataSource result = new DruidDataSource();
        result.setName(druidDataSourceProperties.getName());
        result.setUrl(druidDataSourceProperties.getUrl());
        result.setUsername(druidDataSourceProperties.getUsername());
        result.setPassword(druidDataSourceProperties.getPassword());
        result.setConnectionProperties(
                "config.decrypt=true;config.decrypt.key=" + druidDataSourceProperties.getPwdPublicKey());
        result.setFilters("config");
        result.setMaxActive(druidDataSourceProperties.getMaxActive());
        result.setInitialSize(druidDataSourceProperties.getInitialSize());
        result.setMaxWait(druidDataSourceProperties.getMaxWait());
        result.setMinIdle(druidDataSourceProperties.getMinIdle());
        result.setTimeBetweenEvictionRunsMillis(druidDataSourceProperties.getTimeBetweenEvictionRunsMillis());
        result.setMinEvictableIdleTimeMillis(druidDataSourceProperties.getMinEvictableIdleTimeMillis());
        result.setValidationQuery(druidDataSourceProperties.getValidationQuery());
        result.setTestWhileIdle(druidDataSourceProperties.isTestWhileIdle());
        result.setTestOnBorrow(druidDataSourceProperties.isTestOnBorrow());
        result.setTestOnReturn(druidDataSourceProperties.isTestOnReturn());
        result.setPoolPreparedStatements(druidDataSourceProperties.isPoolPreparedStatements());
        result.setMaxOpenPreparedStatements(druidDataSourceProperties.getMaxOpenPreparedStatements());

        if (druidDataSourceProperties.isEnableMonitor()) {
            StatFilter filter = new StatFilter();
            filter.setLogSlowSql(druidDataSourceProperties.isLogSlowSql());
            filter.setMergeSql(druidDataSourceProperties.isMergeSql());
            filter.setSlowSqlMillis(druidDataSourceProperties.getSlowSqlMillis());
            List<Filter> list = new ArrayList<Filter>();
            list.add(filter);
            result.setProxyFilters(list);
        }
        return result;

    }

    @Bean(name = "gungnirTransactionManager")
    @ConditionalOnMissingBean(name = "gungnirTransactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager(@Qualifier("gungnirDruidDataSource") DruidDataSource druidDataSource) {
        return new DataSourceTransactionManager(druidDataSource);
    }

    @Bean(name = "gungnirTransactionTemplate")
    @ConditionalOnMissingBean(name = "gungnirTransactionTemplate")
    @Primary
    public TransactionTemplate transactionTemplate(@Qualifier("gungnirTransactionManager") PlatformTransactionManager platformTransactionManager) {
        return new TransactionTemplate(platformTransactionManager);
    }

    @Bean(name = "gungnirSqlSessionFactory")
    @ConditionalOnMissingBean(name = "gungnirSqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("gungnirDruidDataSource") DruidDataSource druidDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(druidDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        SqlSessionFactory sqlSessionFactory = sessionFactory.getObject();
        sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
        return sqlSessionFactory;

    }
}
