import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();
        int sum = 0;
        for (int i = a; i < b + 1; i+=c) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("The sum of number displayed is " + sum);
    }
}
