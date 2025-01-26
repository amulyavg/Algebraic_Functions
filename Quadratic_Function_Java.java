import java.util.Scanner;

public class Quadratic_Equation {
    public static void solveQuadratic(double a, double b, double c) {
        double discriminant = (b*b) - (4*a*c);

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("The solutions are x1 = " + x1 + ", x2 = " + x2);
        }
        else if (discriminant == 0) {
            double x = -b/(2*a);
            System.out.println("The solution is x = " + x);
        }
        else {
            double real = -b/(2*a);
            double imaginary = Math.sqrt(-discriminant)/(2*a);
            System.out.println("The complex solutions are x1 = " + real + " + " + imaginary + "i" + ", x2 = " + real + " - " + imaginary + "i");
        }
    }

    public static double validInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            else {
                System.out.println("Invalid input. Please enter a valid number");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Input a quadratic equation to solve!");
        double a = validInput("First enter a (coefficient of x^2): ");
        while (a == 0) {
            System.out.println("Coefficient 'a' cannot be 0. Please enter a valid value");
            a = validInput("First enter a (coefficient of x^2): ");
        }
        double b = validInput("Now enter b (coefficient of x): ");
        double c = validInput("Finally enter c (constant term): ");

        solveQuadratic(a, b, c);
}
}
