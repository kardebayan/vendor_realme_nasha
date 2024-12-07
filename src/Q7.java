import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("No. of units consumed: ");
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
        System.out.print("Do you want to pay online(y/n): ");
        char choice = input.next().toLowerCase().charAt(0);
        System.out.printf("Total amount: %.1f%n", bill);
        if (choice == 'y') {
            double discount = bill * 0.03;
            double amountPayable = bill - discount;
            System.out.printf("Discount: %.3f%n", discount);
            System.out.printf("Amount payable: %.3f%n", amountPayable);
        } else {
            System.out.printf("Discount: %.3f%n", 0.00);
            System.out.printf("Amount payable: %.3f%n", bill);
        }
    }
}
