package com.example.demo.controller;

import com.example.demo.dto.Flight;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping("/")
    List<Flight> getAllFlights(){
        return flightService.getAllFlights();
    }
}
