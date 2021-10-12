package com.MiniProject.order.controller;

import com.MiniProject.order.DTO.Payment;
import com.MiniProject.order.DTO.Shipping;
import com.MiniProject.order.DTO.paymentService;
import com.MiniProject.order.DTO.shippingService;
import com.MiniProject.order.domain.OrderLine;
import com.MiniProject.order.service.StockManager;
import com.MiniProject.order.repository.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/stock/order")
public class orderController {
    @Autowired
    orderRepository orderRepository;

    @Autowired
    com.MiniProject.order.repository.productRepository productRepository;

    @Autowired
    StockManager stockManager;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    paymentService paymentService;

    @Autowired
    shippingService shippingService;

    @GetMapping(value = "/all")
    public List<OrderLine> getAll(){

        return orderRepository.findAll();
    }
//List<OrderLine>

    @PostMapping(value = "{id}/add")
    public String persist(@RequestBody final OrderLine orderLine, @PathVariable("id") int userid){

        if(stockManager.manageStock(orderLine.product, orderLine.amount)){
            Payment payment=paymentService.getPayment(orderLine.getUser());

            if(payment.getPaymentType().equals(orderLine.getPayment())){
                orderRepository.save(orderLine);
                Shipping shipping = shippingService.getShipping();
                return "Payment Successfull. \n Order Successfully, Stock Updated, \n Shipment Status: "+shipping.getStatus();
            }else {
                return "Payment Not Registered!!";
            }
        };
        return "Not Enough Products is Available, Restock!";
    }
    @GetMapping("/{id}/order")
    public Optional<OrderLine> findUser(@PathVariable("id") int userid){

        return orderRepository.findByUser(userid);
    }

    @GetMapping(value = "/last")
    public OrderLine lastOrder(){
        return orderRepository.findTopByOrderByOrderIdDesc();
    }
}
