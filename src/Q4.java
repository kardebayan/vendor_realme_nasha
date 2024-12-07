import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rand = (int) (Math.random() * 9) + 1;
        System.out.print("Enter user number: ");
        int user = input.nextInt();
        System.out.println("Computer guesses: " + rand);
        if (Math.abs(user - rand) == 1) {
            System.out.println("Almost got it");
        } else if (rand == user) {
            System.out.println("You got it right");
        } else {
            System.out.println("You got it wrong");
        }
    }
}
