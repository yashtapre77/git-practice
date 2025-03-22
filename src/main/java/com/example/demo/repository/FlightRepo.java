package com.example.demo.repository;

import com.example.demo.dto.Flight;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class FlightRepo {
    Map<String, Flight> flightsTable;

    public  FlightRepo(){
        flightsTable = new HashMap<>();
        Flight fl = new Flight("f1");
        flightsTable.put("1",fl);
    }

    public List<Flight> getAllFlights(){

        List<Flight> flights = new ArrayList<>(flightsTable.values());
        return flights;
    }

}

