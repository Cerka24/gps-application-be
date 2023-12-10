package com.example.gpsapplicationbe.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class GpsCoordinatesModel {
    private Integer id;
    private Long longitude;
    private Long latitude;
    private Date date;
}
