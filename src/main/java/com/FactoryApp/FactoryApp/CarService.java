package com.FactoryApp.FactoryApp;

import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void printCar(Car car){
        System.out.println(car);
    }

    public void addSpareWheel(Car car) {

        if (car.getWheels() < 5){
            car.setWheels(car.getWheels() + 1);
        }
    }

    public Car buildCar(String brand, String model, int wheels, int capacity, String vin, String colour){
        Car car = new Car(brand, model, wheels, capacity, vin, colour);
        return car;
    }



}
