package com.FactoryApp.FactoryApp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")

public class CarRestController {

    @GetMapping
    public void printHello() {
        System.out.println("Hello World");
    }

    @GetMapping
    public ResponseEntity<Car> printCar() {
        return ResponseEntity.ok(carService.buildCar("Subaru", "Outback", 4, 500, "BBD56431232", "Black"));
    }

    private final CarService carService;

    private final DriverService driverService;

    public CarRestController(CarService carService, DriverService driverService){

        this.carService = carService;

        this.driverService = driverService;
    }

    @GetMapping("/build")
    public ResponseEntity<Car> getCar(){
        return ResponseEntity.ok(carService.buildCar("Mazda", "3", 4, 800, "VIN: 876575", "Grey"));
    }

    @GetMapping("/find")
    public ResponseEntity<Car> findCar(){
        return ResponseEntity.ok(carService.findById(10L));
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Car> findCar(@PathVariable Long id) {
        return ResponseEntity.ok(carService.findById(id));
    }






}
