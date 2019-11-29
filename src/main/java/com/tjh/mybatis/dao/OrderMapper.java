package com.tjh.mybatis.dao;

import com.tjh.mybatis.pojo.OrderUser;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    OrderUser queryOrderUserByOrderNumber(@Param("number") String number);
}
