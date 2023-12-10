package com.example.gpsapplicationbe.controllers;

import com.example.gpsapplicationbe.Models.carDetailsModel;
import com.example.gpsapplicationbe.services.carDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class carDetailsController {
    @Autowired
    private carDetailsService carDetailsService;

    @MessageMapping(value = "/carDetails")
    public List<carDetailsModel> displayCarDetails() {
        return carDetailsService.displayCarDetails();
    }

    @MessageMapping(value = "/carDetails/{userId}")
    public carDetailsModel displayCarDetails(@DestinationVariable Integer userId) {
        return carDetailsService.displayCarDetails(userId);
    }
}
