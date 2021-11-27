package com.FactoryApp.FactoryApp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarServiceTest {

    private CarService carService = new CarService(null);

    @Test
    void shouldAddExtraWheel(){
        //GIVEN
        Car car = new Car("random brand", "random model", 4, 2000, "123546879", "colorless");
        //WHEN
        carService.addSpareWheel(car);
        //THEN
        assertThat(car.getWheels()).isEqualTo(5);
    }


}
