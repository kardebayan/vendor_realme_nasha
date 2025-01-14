import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        int value = 1;

        for (int i = 1; i <= power; i++) {
            value *= base;
        }

        System.out.println(base + " to the power " + power + " is: " + value);
    }
}
