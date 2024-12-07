import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();
        System.out.println("Largest number: " + Math.max(a, Math.max(b,c)));
        int secondlargest = a + b + c - Math.max(a, Math.max(b,c)) - Math.min(a,Math.min(b,c));
        System.out.println("2nd largest number: " + secondlargest);
    }
}
