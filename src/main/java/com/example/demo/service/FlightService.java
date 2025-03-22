package com.example.demo.service;

import com.example.demo.dto.Flight;
import com.example.demo.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepo flightRepository;

    public List<Flight> getAllFlights(){
        return flightRepository.getAllFlights();
    }
}
