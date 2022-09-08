import java.util.Scanner;

public class ArgumentInput {
    private static final String FIRST_ARGUMENT = "Please input first argument:";
    private static final String SECOND_ARGUMENT = "Please input second argument:";
    private static final String NUMBER = "Enter a number to exponential:";
    private static final String DEGREE = "Enter a degree:";
    private static final Scanner scanner = new Scanner(System.in);

    public static double firstArguments() {
        System.out.println(FIRST_ARGUMENT);
        while (!scanner.hasNextDouble()) {
            String input = scanner.next();
            System.out.println("Invalid: " + input);
            System.out.println(FIRST_ARGUMENT);
        }
        return scanner.nextDouble();
    }

    public static double secondArgument() {
        System.out.println(SECOND_ARGUMENT);
        while (!scanner.hasNextDouble()) {
            String input = scanner.next();
            System.out.println("Invalid: " + input);
            System.out.println(SECOND_ARGUMENT);
        }
        return scanner.nextDouble();
    }

    public static double number(){
        System.out.println(NUMBER);
        while (!scanner.hasNextDouble()) {
            String input = scanner.next();
            System.out.println("Invalid: " + input);
            System.out.println(NUMBER);
        }
        return scanner.nextDouble();

    }

    public static double degree(){
        System.out.println(DEGREE);
        while (!scanner.hasNextDouble()) {
            String input = scanner.next();
            System.out.println("Invalid: " + input);
            System.out.println(DEGREE);
        }
        return scanner.nextDouble();

    }
}
