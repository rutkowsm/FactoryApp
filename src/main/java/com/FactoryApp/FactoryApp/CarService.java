package com.FactoryApp.FactoryApp;

import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public void truckWheels(Car car){
        car.setWheels(18);
    }

    public void toSiePomaluje(Car car){
        car.setColour("white");
    }

    public String renameModel(Car car, String model){
        if (car.getModel() == null || car.getModel().isBlank()){
            car.setModel(model);
        }
        return car.getModel();
    }

    public String renameBrand(Car car, String brand){
        if (car.getBrand() == null || car.getBrand().isBlank()){
            car.setBrand(brand);
        }
        return car.getBrand();
    }

    public Car buildCar(String brand, String model, int wheels, int capacity, String vin, String colour){
        Car car = new Car(brand, model, wheels, capacity, vin, colour);
        return carRepository.save(car);
    }

    public Car findById (Long id){
        Optional<Car> byId = carRepository.findById(id);
        if (byId.isPresent()){
            return byId.get();
        }
        else {
            return null;
        }

    }


}
