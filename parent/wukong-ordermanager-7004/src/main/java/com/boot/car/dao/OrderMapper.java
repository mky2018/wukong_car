package com.boot.car.dao;



import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    /**
     * 查询订单列表
     * @return
     */
    public List selectClueList();
}
