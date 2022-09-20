public class MathFunction {


    public static double addition(double[] arguments) {
        return arguments[0]+arguments[1];
    }

    public static double subtraction(double[] arguments) {
        return arguments[0] - arguments[1];
    }

    public static double multiplication(double[] arguments) {
        return arguments[0] * arguments[1];
    }

    public static double division(double[] arguments) {
        if(arguments[1]==0){
            System.out.println("Division by zero is not allowed");

        }
        return arguments[0] / arguments[1];
    }

    public static double exponentiation(double[] arguments) {
        return Math.pow(arguments[0], arguments[1]);
    }
}
