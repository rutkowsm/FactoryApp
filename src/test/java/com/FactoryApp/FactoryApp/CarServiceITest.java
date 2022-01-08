package com.FactoryApp.FactoryApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CarServiceITest {

    @MockBean
    private CarRepository carRepository;

    @Autowired
    private CarService carService;

    @Test
    void shouldAddExtraWheel(){
        //GIVEN
        Car car = new Car("random", "random", 4, 200, "XYZ344556", "Red");
        //WHEN
        carService.addSpareWheel(car);
        //THEN
        assertThat(car.getWheels()).isNotEqualTo(5);

    }

}
