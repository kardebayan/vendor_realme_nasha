import java.util.Scanner;

public class Q4H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("For input, N = ");
        int N = input.nextInt();
        int odd = 1, even = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd *= i;
            }
        }
        System.out.println("Sum of all even numbers = " + even);
        System.out.print("Product of all odd numbers = " + odd);
    }
}
