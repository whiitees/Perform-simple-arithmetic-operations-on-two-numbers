public class Main {
    public static void performOperations(int a, int b) {
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = (double) a / b;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        performOperations(num1, num2);
    }
}
