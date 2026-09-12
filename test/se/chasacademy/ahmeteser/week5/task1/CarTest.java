package se.chasacademy.ahmeteser.week5.task1;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    Car car = new Car("ABC123","Volvo");


    @Test
    public void registreringsnumber_control(){
//Arrange
        String expectedRegNumber="ABC123";

//act
        String actualRegnummer = car.getRegistreringsnummer();

//assert

        Assert.assertEquals("Car reg info is not correct!",expectedRegNumber,actualRegnummer);

    }

    @Test
    public void carBrandControl(){
        String expectedCarBrand = "Volvo";

        String actualCarBrand = car.getBrand();

        Assert.assertEquals("car brand is not matching!",expectedCarBrand,actualCarBrand);

    }
    @Test
    public void registreringsnumber_control_fail(){
//Arrange
        String expectedRegNumber="123456";

//act
        String actualRegnummer = car.getRegistreringsnummer();

//assert

        Assert.assertEquals("Car reg info is not correct!",expectedRegNumber,actualRegnummer);

    }
    @Test
    public void carBrandControlFail(){
        String expectedCarBrand = "Mazda";

        String actualCarBrand = car.getBrand();

        Assert.assertEquals("car brand is not matching!",expectedCarBrand,actualCarBrand);

    }
}
