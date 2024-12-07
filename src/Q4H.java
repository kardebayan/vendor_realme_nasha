import java.util.Scanner;

public class Q4H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        boolean divisibleBy5And6 = integer % 5 == 0 && integer % 6 == 0;
        boolean divisibleBy5Or6 = integer % 5 == 0 || integer % 6 == 0;
        boolean divisibleBy5Or6ButNotBoth = (integer % 5 == 0 && integer % 6 != 0) || (integer % 5 != 0 && integer % 6 == 0);
        System.out.println("Is " + integer + " divisible by 5 and 6 ? " + divisibleBy5And6);
        System.out.println("Is " + integer + " divisible by 5 or 6 ? " + divisibleBy5Or6);
        System.out.println("Is " + integer + " divisible by 5 or 6, but not both ? " + divisibleBy5Or6ButNotBoth);
    }
}
