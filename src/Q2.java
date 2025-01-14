import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int inital = number;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number/10;
        }
        if (sum % 9 == 0) {
            System.out.println("The number " + inital + " is divisible by 9");
        } else {
            System.out.println("The number " + inital + " is not divisible by 9");
        }
    }
}
