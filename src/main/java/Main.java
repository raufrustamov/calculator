import java.util.Scanner;

public class Main {
    private static final String FIRST_ARGUMENT = "Please input first argument:";
    private static final String SECOND_ARGUMENT = "Please input second argument:";
    private static final String RESULT = "Result: ";
    private static final String COMMAND = "Please enter a mathematical operation (ADD,SUBTRACT,MULTIPLY,DIVIDE,EXPON)";
    private static final String COMMAND_EXAMPLES = "ADD\n\tSUBTRACT\n\tMULTIPLY\n\tDIVIDE\n\tEXPON";
    private static final String COMMAND_ERROR = "Wrong command! Available command examples: \n" +
            COMMAND_EXAMPLES;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {

            //Math command
            System.out.println(COMMAND);
            String command = scanner.next();
            String[] tokens = command.split("\\s+", 2);

            switch (tokens[0]) {
                case ("ADD"):
                    try {
                        System.out.println(RESULT + MathFunction.toAdd(ArgumentInput.firstArguments(), ArgumentInput.secondArgument()));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case ("SUBTRACT"):
                    try {
                        System.out.println(RESULT + MathFunction.toSubtract(ArgumentInput.firstArguments(), ArgumentInput.secondArgument()));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case ("MULTIPLY"):
                    try {
                        System.out.println(RESULT + MathFunction.toMultiply(ArgumentInput.firstArguments(), ArgumentInput.secondArgument()));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case ("DIVIDE"):
                    try {
                        double firstArgument = ArgumentInput.firstArguments();
                        double secondArgument = ArgumentInput.secondArgument();
                        if (firstArgument == 0 || secondArgument == 0) {
                            System.out.println("Division by zero is not allowed");
                            break;
                        }
                        System.out.println(RESULT + MathFunction.toDivide(firstArgument, secondArgument));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;

                case ("EXPON"):
                    try {
                        System.out.println(RESULT + MathFunction.toExponentiate(ArgumentInput.number(), ArgumentInput.degree()));
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



