package com.MiniProject.shipping.Controller;


import com.MiniProject.shipping.DTO.OrderLine;
import com.MiniProject.shipping.DTO.OrderService;
import com.MiniProject.shipping.Domain.Shipping;
 import com.MiniProject.shipping.Service.ShippingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipping")
@Slf4j
public class ShippingController {

    @Autowired
    ShippingService shippingService;

    @Autowired
    OrderService orderService;

    @GetMapping(value="/all")
    public List<Shipping> getAll(){

        return shippingService.getAllShipping();
    }

    @GetMapping("/add")
    public Shipping createShipping(){
        OrderLine order=orderService.getLastOrder();
        Shipping newShipment = new Shipping();
        newShipment.setOrderId(order.getOrderId());
        newShipment.setStatus("SHIPPED");

        shippingService.saveShipping(newShipment);
        return shippingService.getLast();
    }

    @GetMapping("/{id}")
    public Shipping findOrderItemById(@PathVariable("id") Long shippingId){
        log.info("I am Inside findUser of UserController");
        return shippingService.findShippingById(shippingId);
    }

}
