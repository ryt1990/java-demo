package com.ryt.demo.dal.mssql.mapper;

import com.ryt.demo.dal.mssql.entity.Order;
import com.ryt.demo.dal.mssql.entity.OrderExample;
import com.ryt.demo.dal.mssql.entity.OrderWithBLOBs;

import java.util.List;

public interface OrderMapper {
    int insertSelective(OrderWithBLOBs record);

    List<OrderWithBLOBs> selectByExampleWithBLOBs(OrderExample example);

    List<Order> selectByExample(OrderExample example);

    OrderWithBLOBs selectByPrimaryKey(Integer PKID);

    int updateByPrimaryKeySelective(OrderWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrderWithBLOBs record);

    int updateByPrimaryKey(Order record);
}