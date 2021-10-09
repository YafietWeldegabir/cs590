package com.miniproject1.miniproject1.models;

import lombok.*;

import java.util.Calendar;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private String lastName;
    private String firstName;
    private Double gpa;
    private Calendar dob;

    private int age;

    public Student(String firstName, String lastName, Double gpa, Calendar dob) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.gpa=gpa;
        this.dob=dob;
    }


//    @Transient
//    private Date dob;



//    public Person(String firstName, String lastName, int gpa) {
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.gpa=gpa;
//    }
}