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

    @Test
    void shouldAddSpareWheel(){
        //GIVEN
        Car car = new Car("random brand", "random model", 4, 2000, "123546879", "colorless");
        //WHEN
        int wheelsBefore = car.getWheels();
        carService.addSpareWheel(car);
        int wheelsAfter = car.getWheels();
        //THEN
        assertThat(wheelsAfter == wheelsBefore);
    }

    @Test
    void shouldChangeCarBrand(){
        //GIVEN
        Car car = new Car(null, "random model", 4, 2000, "123546879", "colorless");
        //WHEN
        String carBrand = carService.renameBrand(car, "test brand");
        //THEN
        assertThat(carBrand).isEqualTo("test brand");
    }

    @Test
    void shouldChangeCarEmpty(){
        //GIVEN
        Car car = new Car("", "random model", 4, 2000, "123546879", "colorless");
        //WHEN
        String carBrand = carService.renameBrand(car, "test brand");
        //THEN
        assertThat(carBrand).isEqualTo("test brand");
    }

    @Test
    void shouldChangeCarFord(){
        //GIVEN
        Car car = new Car("Ford", "random model", 4, 2000, "123546879", "colorless");
        //WHEN
        String carBrand = carService.renameBrand(car, "test brand");
        //THEN
        assertThat(carBrand).isEqualTo("Ford");
    }

    @Test
    void shouldChangeModelNull(){
        //GIVEN
        Car car = new Car("random", null, 4, 2000, "123546879", "colorless");
        //WHEN
        String carModel = carService.renameModel(car, "test model");
        //THEN
        assertThat(carModel).isEqualTo("test model");
    }

    @Test
    void shouldChangeModelEmpty(){
        //GIVEN
        Car car = new Car("random", "", 4, 2000, "123546879", "colorless");
        //WHEN
        String carModel = carService.renameModel(car, "test model");
        //THEN
        assertThat(carModel).isEqualTo("test model");
    }

    @Test
    void shouldChangeModelFocus(){
        //GIVEN
        Car car = new Car("random", "Focus", 4, 2000, "123546879", "colorless");
        //WHEN
        String carModel = carService.renameModel(car, "test model");
        //THEN
        assertThat(carModel).isEqualTo("Focus");
    }
}
