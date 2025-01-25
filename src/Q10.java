import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n (n > 3): ");
        int n = input.nextInt();
        if (n <= 3) {
            System.out.println("Please enter a value greater than 3.");
            return;
        }
        int a = 0, b = 1, c = 1;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 4; i <= n; i++) {
            int next = a + b + c;
            System.out.print(next + " ");
            a = b;
            b = c;
            c = next;
        }
    }
}
