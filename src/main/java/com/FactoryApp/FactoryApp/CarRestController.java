package com.FactoryApp.FactoryApp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")

public class CarRestController {

    @GetMapping
    public ResponseEntity<Car> printCar() {
        return ResponseEntity.ok(carService.buildCar("Subaru", "Outback", 4, 500, "BBD56431232", "Black"));
    }

    private final CarService carService;

    public CarRestController(CarService carService, DriverService driverService){

        this.carService = carService;

        this.driverService = driverService;
    }

    @GetMapping("/build")
    public ResponseEntity<Car> getCar(){
        return ResponseEntity.ok(carService.buildCar("Subaru", "Forester", 4, 800, "VIN: 74826874", "Blue"));
    }

    private final DriverService driverService;




}
