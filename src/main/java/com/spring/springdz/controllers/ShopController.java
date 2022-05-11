package com.spring.springdz.controllers;



import com.spring.springdz.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShopController {
    private final OrderService orderService;

    public ShopController(OrderService orderService) {
        this.orderService = orderService;

    }

    @GetMapping()
    public String store() {
        return "Добро пожаловать в корзину!";
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> ids) {
        return orderService.addItems(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();
    }
}
