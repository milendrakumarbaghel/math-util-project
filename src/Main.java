import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Math Utility Functions:");
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "1. Addition\n" +
            "2. Substraction\n" +
            "3. Multiplication\n" +
            "4. Division\n"
        );

        System.out.print("Enter a number to call utility function: ");
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + Addition.add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + Substraction.sub(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + Multiplication.mul(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + Division.div(num1, num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }
    }
}
