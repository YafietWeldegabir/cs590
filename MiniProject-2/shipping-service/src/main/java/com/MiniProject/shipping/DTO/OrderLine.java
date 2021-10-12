package com.MiniProject.shipping.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
public class OrderLine {

    public int orderId;
    public int product;
    public int amount;
    public String address;
    public int user;
    public String payment;
}
