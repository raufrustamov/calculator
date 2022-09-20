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
                    try {
                        System.out.println(RESULT + MathFunction.addition(ArgumentInput.argument(MathOperations.Operations.ADD)));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case ("SUBTRACT"):
                    try {
                        System.out.println(RESULT + MathFunction.subtraction(ArgumentInput.argument(MathOperations.Operations.SUBTRACT)));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case ("MULTIPLY"):
                    try {
                        System.out.println(RESULT + MathFunction.multiplication(ArgumentInput.argument(MathOperations.Operations.MULTIPLY)));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case ("DIVIDE"):
                    try {
                        System.out.println(RESULT + MathFunction.division(ArgumentInput.argument(MathOperations.Operations.DIVISION)));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;

                case ("EXPON"):
                    try {
                        System.out.println(RESULT + MathFunction.exponentiation(ArgumentInput.argument(MathOperations.Operations.EXPONENTIATION)));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;
                default:
                    System.out.println(COMMAND_ERROR);
            }
        }
    }

}



