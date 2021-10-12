package com.MiniProject.order.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Long paymentID;
    public String paymentType;
    private int userID;
    private String cardId;
}
