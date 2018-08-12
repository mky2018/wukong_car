package com.boot.car.serviceImpl;

import com.boot.car.dao.OrderMapper;
import com.boot.car.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    @Override
    public List selectClueList() {
        return orderMapper.selectClueList();
    }
}
