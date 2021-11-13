package com.FactoryApp.FactoryApp;

import org.springframework.stereotype.Service;

@Service
public class DriverService {

    public void printCar(Driver driver){
        System.out.println(driver);
    }
}
