package com.it_academy.calculator;

public class MathFunction {

    static double result;


    public static double addition(double[] arguments) {
        try {
            result = arguments[0] + arguments[1];
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
        return result;
    }

    public static double subtraction(double[] arguments) {
        try {
            result = arguments[0] - arguments[1];
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
        return result;
    }

    public static double multiplication(double[] arguments) {
        try {
            result = arguments[0] * arguments[1];
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
        return result;
    }

    public static double division(double[] arguments) {

        try {
            result = arguments[0] / arguments[1];
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
        return result;
    }

    public static double exponentiation(double[] arguments) {
        try {
            result = Math.pow(arguments[0], arguments[1]);
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
        return result;
    }
}
