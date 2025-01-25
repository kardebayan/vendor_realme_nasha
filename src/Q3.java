import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        for (int i = a; i <= b; i++) {
            if (i > 1) {
                int divisorCount = 0;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        divisorCount++;
                        break;
                    }
                }
                if (divisorCount == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
