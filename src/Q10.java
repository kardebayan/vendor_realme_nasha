import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = input.nextInt();
        int power = 1;
        while (power * 3 <= N) {
            power *= 3;
        }
        System.out.println("The largest power of 3 less than or equal to " + N + " is " + power + ".");
    }
}
