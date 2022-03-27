package com.huangxijun;

//import static org.junit.Assert.*;


import org.junit.Test;
import org.testng.Assert;

public class CalculatorTest {
    @Test
    public void shouldReturn2When1Plus1(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, '+');
        int expectResult = 2;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void shouldReturn2When1Sub1(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, '-');
        int expectResult = 0;
        Assert.assertEquals(expectResult, actualResult);
    }

}