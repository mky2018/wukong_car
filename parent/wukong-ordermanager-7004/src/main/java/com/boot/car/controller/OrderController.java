package com.boot.car.controller;

import com.boot.car.pojo.Order;
import com.boot.car.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {
    @Resource
    private OrderService orderService;

    /**
     * 查询订单列表
     * @param model
     * @return
     */
    @RequestMapping("/orderClueList")
    public String selectOrderList(Model model){
        List<Order> clueList = orderService.selectClueList();
        model.addAttribute("clueList",clueList);
        System.out.println("lsit======="+clueList);
        return "clueOrderList";
    }

}
