import java.util.Scanner;  // Import the Scanner class

public class CircleCalculator {
    public static void main(String[] args) {

        // Step 1: Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");

        // Step 3: Read the radius input
        double radius = input.nextDouble();

        // Step 4: Calculate the area using the formula Area = π * r^2
        double area = Math.PI * Math.pow(radius, 2);

        // Step 5: Calculate the circumference using the formula Circumference = 2 * π * r
        double circumference = 2 * Math.PI * radius;

        // Step 6: Output the results with formatted output
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        // Step 7: Close the Scanner object to release resources
        input.close();
    }
}
