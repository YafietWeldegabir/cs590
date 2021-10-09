package com.miniproject1.miniproject1.models;

import lombok.Getter;

@Getter
public class AuthenticationResponse {

    public final String jwt;

    public AuthenticationResponse(String jwt){
        this.jwt = jwt;
    }
}
