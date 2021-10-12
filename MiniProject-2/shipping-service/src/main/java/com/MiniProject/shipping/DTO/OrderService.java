package com.MiniProject.shipping.DTO;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public OrderLine getLastOrder() {

        OrderLine orderLine =
                restTemplate.getForObject("http://ORDER-SERVICE/stock/order/last", OrderLine.class);
        return  orderLine;
    }

}
