package com.MiniProject.order.configuration;

import lombok.Getter;

@Getter
public class AuthenticationResponse {

    public final String jwt;

    public AuthenticationResponse(String jwt){
        this.jwt = jwt;
    }
}
