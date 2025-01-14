import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a no. for which you want to find the multiplication table: ");
        int number = input.nextInt();
        System.out.print("The multiplication table of " + number + " is:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("8 x " + i + " = " + 8*i);
        }
    }
}
