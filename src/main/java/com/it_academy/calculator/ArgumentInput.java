package com.it_academy.calculator;

import java.util.Scanner;

public class ArgumentInput {
    private static final String FIRST_ARGUMENT = "Please input first argument:";
    private static final String SECOND_ARGUMENT = "Please input second argument:";
    private static final String NUMBER = "Enter a number to exponential:";
    private static final String DEGREE = "Enter a degree:";
    private static final Scanner scanner = new Scanner(System.in);

    private static final double[] argArray = new double[2];

    public static double[] argument(MathOperations.Operations operations) {

        if (operations == MathOperations.Operations.ADD || operations == MathOperations.Operations.DIVISION || operations == MathOperations.Operations.MULTIPLY
                || operations == MathOperations.Operations.SUBTRACT) {

            System.out.println(FIRST_ARGUMENT);
            while (!scanner.hasNextDouble()) {
                String input = scanner.next();
                System.out.println("Invalid: " + input);
                System.out.println(FIRST_ARGUMENT);
            }
            argArray[0] = scanner.nextDouble();
            System.out.println(SECOND_ARGUMENT);
            while (!scanner.hasNextDouble()) {
                String input = scanner.next();
                System.out.println("Invalid: " + input);
                System.out.println(SECOND_ARGUMENT);
            }
            argArray[1] = scanner.nextDouble();
        } else if (operations == MathOperations.Operations.EXPONENTIATION) {
            System.out.println(NUMBER);
            while (!scanner.hasNextDouble()) {
                String input = scanner.next();
                System.out.println("Invalid: " + input);
                System.out.println(NUMBER);
            }
            argArray[0] = scanner.nextDouble();
            System.out.println(DEGREE);
            while (!scanner.hasNextDouble()) {
                String input = scanner.next();
                System.out.println("Invalid: " + input);
                System.out.println(DEGREE);
            }
            argArray[1] = scanner.nextDouble();
        }
        return argArray;
    }

}
