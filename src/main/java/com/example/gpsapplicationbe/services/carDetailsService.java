package com.example.gpsapplicationbe.services;

import com.example.gpsapplicationbe.Models.GpsCoordinatesModel;
import com.example.gpsapplicationbe.Models.carDetailsModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class carDetailsService {
    public carDetailsModel displayCarDetails(Integer userId) {
        return new carDetailsModel("Chevrolet", "Coupe", 2012, new GpsCoordinatesModel(userId, (long) 56758599.567, (long) 57590500.879, new Date()));
    }

    public List<carDetailsModel> displayCarDetails() {
        List<carDetailsModel> carDetailsModelList = new ArrayList<>();
        carDetailsModelList.add(new carDetailsModel("Chevrolet", "Coupe", 2012, new GpsCoordinatesModel(1, (long) 56758599.567, (long) 57590500.879, new Date())));
        return carDetailsModelList;
    }
}
