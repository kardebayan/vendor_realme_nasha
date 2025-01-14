import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess = (int) (Math.random() * 10) + 1;
        System.out.println("Computer guess: " + guess);
        System.out.print("User guess: ");
        int user = input.nextInt();
        while (user != guess) {
            if (user == guess) {
                System.out.println("Good guess");
            } else if (user > guess) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Too low, try again");
            }
            System.out.print("User guess: ");
            user = input.nextInt();
        }
    }
}
