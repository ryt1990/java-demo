package com.ryt.demo.controllers;

import com.alibaba.fastjson.JSON;
import com.ryt.demo.dal.mssql.entity.Order;
import com.ryt.demo.dal.mssql.entity.OrderExample;
import com.ryt.demo.dal.mssql.mapper.OrderMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author renyutao
 * @date 2019/6/2615:42
 */
@Api("测试")
@RestController
public class DemoController {
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Value("${welcome}")
    private String welcome;

    @ApiOperation("HelloWorld")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return welcome;
    }


    @Resource
    private OrderMapper orderMapper;

    @ApiOperation("QueryOrder")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Order> selectOrderByCondition() {
        OrderExample example = new OrderExample();
        example.createCriteria()
                .andOrderNoEqualTo("TH666041472");

        List<Order> resp = orderMapper.selectByExample(example);
        logger.info("{}", JSON.toJSONString(resp));
        return resp;
    }
}
