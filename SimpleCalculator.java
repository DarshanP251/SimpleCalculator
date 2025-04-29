package Calcu;

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 25;
        double num2 = 40;

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double base = 4;
        double exponent = 3;

        double power = Math.pow(base, exponent);
        double squareRoot = Math.sqrt(base);
        double cubeRoot = Math.cbrt(base);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division: Cannot divide by zero.");

        }

        System.out.println("Power (base^exponent): " + power);
        System.out.println("Square Root of base: " + squareRoot);
        System.out.println("Cube Root of base: " + cubeRoot);
    }
}
