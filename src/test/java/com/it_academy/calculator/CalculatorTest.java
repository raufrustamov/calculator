package com.it_academy.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    public double[] dataForTest = new double[2];

    @Test
    public void testAdditionWithAllPositiveNumbers() {
        dataForTest[0] = 234;
        dataForTest[1] = 431;
        assertEquals("Test addition operation is failed,actual result is not 665",
                665, MathFunction.addition(dataForTest), 0);
    }

    @Test
    public void testAdditionWithOnePositiveNumber() {
        dataForTest[0] = 234;
        dataForTest[1] = -431;
        assertEquals("Test addition operation with one Positive number", -197, MathFunction.addition(dataForTest), 0);
    }

    @Test
    public void testAdditionWithAllNegativeNumbers() {
        dataForTest[0] = -234;
        dataForTest[1] = -431;
        assertEquals("Test addition operation with all negative numbers is failed,actual result is not -665",
                -665, MathFunction.addition(dataForTest), 0);
    }

    @Test
    public void testSubstractionAllPositiveNumbers() {
        dataForTest[0] = 234;
        dataForTest[1] = 431;
        assertEquals("Test subtraction operation with all Positive numbers is failed,actual result is not -197",
                -197, MathFunction.subtraction(dataForTest), 0);
    }

    @Test
    public void testSubstractionAllNegativeNumbers() {
        dataForTest[0] = -234;
        dataForTest[1] = -431;
        assertEquals("Test subtraction operation with all Negative numbers is failed,actual result is not 197",
                197, MathFunction.subtraction(dataForTest), 0);
    }

    @Test
    public void testMultiplicationAllNegativeNumbers() {
        dataForTest[0] = -234;
        dataForTest[1] = -431;
        assertEquals("Test multiplication operation with all Negative numbers is failed,actual result is not 100854 ",
                100854, MathFunction.multiplication(dataForTest), 0);
    }

    @Test
    public void testMultiplicationAllPositiveNumbers() {
        dataForTest[0] = 234;
        dataForTest[1] = 431;
        assertEquals("Test multiplication operation with all Positive numbers failed,actual result is not 100854",
                100854, MathFunction.multiplication(dataForTest), 0);
    }

    @Test
    public void testDivideOperation() {
        dataForTest[0] = 234;
        dataForTest[1] = 431;
        assertEquals("Test divide operation with all Positive numbers is failed,actual result  not 0.54292343387471 ",
                0.54292343387471, MathFunction.division(dataForTest), 0);
    }

    @Test
    public void testDivideOperationWithDividendZero() {
        dataForTest[0] = 0;
        dataForTest[1] = 431;
        assertEquals("Test divide operation  with divide zero is failed,actual result not  0",
                0, MathFunction.division(dataForTest), 0);
    }

    @Test
    public void testDivideOperationWithDividerZero() {
        dataForTest[0] = 324;
        dataForTest[1] = 0;
        Assert.assertTrue("Error dividing on zero, expected message.Result is not infinity",
                Double.isInfinite(MathFunction.division(dataForTest)));
    }

    @Test
    public void testExponentiationOperation() {
        dataForTest[0] = 3;
        dataForTest[1] = 3;
        assertEquals("Test exponentiation operation failed,actual result not 27",
                27, MathFunction.exponentiation(dataForTest), 0);
    }

}
