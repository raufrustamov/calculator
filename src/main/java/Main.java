import java.util.Scanner;

public class Main {
    private static final String FIRST_ARGUMENT = "Please input first argument:";
    private static final String SECOND_ARGUMENT = "Please input second argument:";
    private static final String RESULT = "Result: ";
    private static final String COMMAND = "Please enter a mathematical operation (ADD,SUBTRACT,MULTIPLY,DIVIDE)";
    private static final String COMMAND_EXAMPLES = "\t" + "ADD" + "\n" +
            "\tSUBTRACT\n\tMULTIPLY\n\tDIVIDE";
    private static final String COMMAND_ERROR = "Wrong command! Available command examples: \n" +
            COMMAND_EXAMPLES;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            //Checking the validity of the entered data

            System.out.println(FIRST_ARGUMENT);
            while (!scanner.hasNextDouble()) {
                String input = scanner.next();
                System.out.println("Invalid: " + input);
                System.out.println(FIRST_ARGUMENT);
            }

            //first argument
            double firstArgument = scanner.nextDouble();

            System.out.println(SECOND_ARGUMENT);
            while (!scanner.hasNextDouble()) {
                String input = scanner.next();
                System.out.println("Invalid: " + input);
                System.out.println(SECOND_ARGUMENT);
            }

            //second argument
            double secondArgument = scanner.nextDouble();

            //Math command
            System.out.println(COMMAND);
            String command = scanner.next();
            String[] tokens = command.split("\\s+", 2);

            switch (tokens[0]) {
                case ("ADD"):
                    try {
                        System.out.println(RESULT + MathFunction.toAdd(firstArgument, secondArgument));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case ("SUBTRACT"):
                    try {
                        System.out.println(RESULT + MathFunction.toSubtract(firstArgument, secondArgument));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case ("MULTIPLY"):
                    try {
                        System.out.println(RESULT + MathFunction.toMultiply(firstArgument, secondArgument));
                    } catch (NullPointerException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case ("DIVIDE"):
                    try {
                        if (firstArgument == 0 || secondArgument == 0) {
                            System.out.println("Division by zero is not allowed");
                            break;
                        }
                        System.out.println(RESULT + MathFunction.toDivide(firstArgument, secondArgument));
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



