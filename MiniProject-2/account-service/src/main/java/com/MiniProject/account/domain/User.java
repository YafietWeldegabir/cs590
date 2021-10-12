package com.MiniProject.account.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int accountId;
    public String firstName;
    public String lastName;
    public String email;
//    @OneToOne
    public String address;
    public String password;
    public String username;


}
