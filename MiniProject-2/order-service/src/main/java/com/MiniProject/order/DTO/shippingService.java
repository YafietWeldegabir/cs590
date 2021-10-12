package com.MiniProject.order.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class shippingService {
    @Autowired
    private RestTemplate restTemplate;

    public Shipping getShipping() {

        Shipping shipping =
                restTemplate.getForObject("http://SHIPPING-SERVICE/shipping/add",Shipping.class);
        return  shipping;
    }
}
