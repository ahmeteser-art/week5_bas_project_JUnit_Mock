package se.chasacademy.ahmeteser.week5.task2;

import org.junit.Assert;
import org.junit.Test;


public class CalculateTest {

    Calculater calculater = new Calculater();



    //1- normal fall
    @Test
    public void testAddMethod() {
        int a=200;
        int b= 100;
        int expectedAdd = 300;


        int actuallAdd= calculater.add(a, b);

        Assert.assertEquals("add method is not working as expected",expectedAdd,actuallAdd);
    }
 //2- grännsfall
        @Test
        public void testAddMethodWithZero () {
            int a=0;
            int b= 0;
            int expectedAdd = 0;

            int actuallAdd= calculater.add(a, b);

            Assert.assertEquals("zero plus zero has to be zero!",expectedAdd,actuallAdd);
        }



    //1- normal fall
    @Test
    public void testSubstractMethod() {
        int a=200;
        int b= 100;
        int expectedAdd = 100;


        int actuallAdd= calculater.substract(a, b);

        Assert.assertEquals("substract method is not working as expected",expectedAdd,actuallAdd);
    }
    //2- grännsfall
    @Test
    public void testSubstractMethodWithZero () {
        int a=0;
        int b= 0;
        int expectedAdd = 0;

        int actuallAdd= calculater.substract(a, b);

        Assert.assertEquals("zero substract zero has to be zero!",expectedAdd,actuallAdd);
    }
    }

