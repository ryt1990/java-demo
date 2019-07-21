package com.ryt.demo.dal.mssql.mapper;

import com.ryt.demo.dal.mssql.entity.OrderList;
import com.ryt.demo.dal.mssql.entity.OrderListExample;
import com.ryt.demo.dal.mssql.entity.OrderListWithBLOBs;

import java.util.List;

public interface OrderListMapper {
    int insertSelective(OrderListWithBLOBs record);

    List<OrderListWithBLOBs> selectByExampleWithBLOBs(OrderListExample example);

    List<OrderList> selectByExample(OrderListExample example);

    OrderListWithBLOBs selectByPrimaryKey(Integer PKID);

    int updateByPrimaryKeySelective(OrderListWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrderListWithBLOBs record);

    int updateByPrimaryKey(OrderList record);
}