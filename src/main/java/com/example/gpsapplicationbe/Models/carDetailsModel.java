package com.example.gpsapplicationbe.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class carDetailsModel {
    private String name;
    private String type;
    private Integer yearOfProduction;
    private GpsCoordinatesModel gpsModel;
}
