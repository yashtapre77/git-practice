package com.example.demo.dto;

import lombok.Data;

@Data
public class Flight {
    private String flightid ;
    public Flight(String flightid){
        this.flightid = flightid;
    }
}
