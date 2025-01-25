import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = input.nextInt();
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        for (int i = m; i <= n; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("Factorial of " + i + " is: " + factorial);
        }

    }
}
