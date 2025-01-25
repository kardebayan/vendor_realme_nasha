import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int original = num;

        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (!isPrime) {
            System.out.println(original + " is not a twisted prime.");
            return;
        }

        int reverse = 0;
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        boolean isReversePrime = true;
        if (reverse < 2) {
            isReversePrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(reverse); i++) {
                if (reverse % i == 0) {
                    isReversePrime = false;
                    break;
                }
            }
        }

        if (isPrime && isReversePrime) {
            System.out.println(original + " is a twisted prime.");
        } else {
            System.out.println(original + " is not a twisted prime.");
        }
    }
}
