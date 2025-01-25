import java.util.Scanner;

public class Q3H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x (in radians): ");
        double x = input.nextDouble();

        double term = x;
        double sinX = term;
        int n = 1;
        double error = 1e-6;

        while (Math.abs(term) > error) {
            term = -term * x * x / ((2 * n) * (2 * n + 1));
            sinX += term;
            n++;
        }

        System.out.println("sin(" + x + ") = " + sinX);
        input.close();
    }
}
