import java.util.Scanner;

public class Q5H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n (n >= 1): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. n must be >= 1.");
            return;
        }

        System.out.print("Fibonacci Series is: ");

        if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0, 1");
        } else {
            int a = 0, b = 1;
            System.out.print(a + ", " + b);

            for (int i = 3; i <= n; i++) {
                int c = a + b;
                System.out.print(", " + c);
                a = b;
                b = c;
            }
            System.out.println();
        }
        input.close();
    }
}
