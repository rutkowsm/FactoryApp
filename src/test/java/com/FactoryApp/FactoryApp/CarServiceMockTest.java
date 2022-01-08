package com.FactoryApp.FactoryApp;

import org.mockito.InjectMocks;
import org.mockito.Mock;

public class CarServiceMockTest {

    @Mock
    private CarRepository carRepository;

    @InjectMocks
    private CarService carService;
}
