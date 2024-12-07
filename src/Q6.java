import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = input.nextInt();
        double bill = 0;
        if (units <= 50) {
            bill = units * 3.0;
        } else if (units <= 200) {
            bill = (50 * 3.0) + (units - 50) * 4.8;
        } else if (units <= 400) {
            bill = (50 * 3.0) + (150 * 4.8) + (units - 200) * 5.8;
        } else {
            bill = (50 * 3.0) + (150 * 4.8) + (200 * 5.8) + (units - 400) * 6.2;
        }
        System.out.printf("The total electricity bill is: Rs. %.2f%n", bill);
    }
}
