package com.vcautotest.datacenter.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @ApiOperation(value = "获取已经新建的订单",notes = "获取已经新建的订单提供后续业务测试")
    @RequestMapping(value = "/getNewOrder",method = RequestMethod.POST)
    public ArrayList<String> getNewOrder(@RequestParam(value = "num",required = false) Integer num) {
        ArrayList<String>  list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        return list;

    }
}
