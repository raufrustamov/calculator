package com.it_academy.calculator;

import java.util.Scanner;

public class Main {

    private static final String RESULT = "Result: ";
    private static final String COMMAND = "Please enter a mathematical operation (ADD,SUBTRACT,MULTIPLY,DIVIDE,EXPON)";
    private static final String COMMAND_EXAMPLES = "ADD\n\tSUBTRACT\n\tMULTIPLY\n\tDIVIDE\n\tEXPON";
    private static final String COMMAND_ERROR = "Wrong command! Available command examples: \n" +
            COMMAND_EXAMPLES;


    public static void main(String[] args) {

        final Scanner SCANNER = new Scanner(System.in);
        while (true) {

            //Math command
            System.out.println(COMMAND);
            String command = SCANNER.next();
            String[] tokens = command.split("\\s+", 2);

            switch (tokens[0]) {
                case ("ADD"):
                    System.out.println(RESULT + MathFunction.addition(ArgumentInput.argument(MathOperations.Operations.ADD)));
                    break;
                case ("SUBTRACT"):
                    System.out.println(RESULT + MathFunction.subtraction(ArgumentInput.argument(MathOperations.Operations.SUBTRACT)));
                    break;
                case ("MULTIPLY"):
                    System.out.println(RESULT + MathFunction.multiplication(ArgumentInput.argument(MathOperations.Operations.MULTIPLY)));
                    break;
                case ("DIVIDE"):
                    System.out.println(RESULT + MathFunction.division(ArgumentInput.argument(MathOperations.Operations.DIVISION)));
                    break;
                case ("EXPON"):
                    System.out.println(RESULT + MathFunction.exponentiation(ArgumentInput.argument(MathOperations.Operations.EXPONENTIATION)));
                    break;
                default:
                    System.out.println(COMMAND_ERROR);
            }
        }
    }

}



