package com.it_academy.calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    public double[] dataForTest = new double[2];
    @ParameterizedTest
    @CsvSource({"234,431,665","234,-431,-197","-234,-431,-665"})
    public void testAddOperation(double argOne,double argTwo, double expResult ){
        dataForTest[0]=argOne;
        dataForTest[1]=argTwo;
        assertEquals(expResult,MathFunction.addition(dataForTest),0);
    }

    @ParameterizedTest
    @CsvSource({"234,431,-197","-234,-431,197"})
    public void testSubstractionOperation(double argOne,double argTwo, double expResult ){
        dataForTest[0]=argOne;
        dataForTest[1]=argTwo;
        assertEquals(expResult,MathFunction.subtraction(dataForTest),0);
    }

    @ParameterizedTest
    @CsvSource({"-234,-431,100854","2,-431,-862","321,0,0"})
    public void testMultiplicationOperation(double argOne,double argTwo, double expResult ){
        dataForTest[0]=argOne;
        dataForTest[1]=argTwo;
        assertEquals(expResult,MathFunction.multiplication(dataForTest),0);
    }

    @ParameterizedTest
    @CsvSource({"234,431,0.54292343387471","0,-431,-0.0","342,0,Infinity"})
    public void testDivideOperation(double argOne,double argTwo, double expResult ){
        dataForTest[0]=argOne;
        dataForTest[1]=argTwo;
        assertEquals(expResult,MathFunction.division(dataForTest),0);
    }

}
