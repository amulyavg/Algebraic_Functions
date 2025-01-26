import java.util.Scanner;

public class Parabola_Vertex {
    public static void findVertex(double a, double b, double c) {
        double h = -b/(2*a);
        double k = (a*(h*h)) + (b*h) + c;
        System.out.println("The vertex of the parabola is at: " + h + ", " + k);
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
        System.out.println("Find the vertex of a parabola: y = ax^2 + bx + c");
        double a = validInput("First enter a (coefficient of x^2): ");
        while (a == 0) {
            System.out.println("Coefficient 'a' cannot be 0. Please enter a valid value");
            a = validInput("First enter a (coefficient of x^2): ");
        }
        double b = validInput("Now enter b (coefficient of x): ");
        double c = validInput("Finally enter c (constant term): ");

        findVertex(a, b, c);
}
}
