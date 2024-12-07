import java.util.Scanner;

public class Q1H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computerChoice = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int userChoice = scanner.nextInt();

        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
            return;
        }

        System.out.print("The computer is ");
        if (computerChoice == 0) {
            System.out.print("scissor. ");
        } else if (computerChoice == 1) {
            System.out.print("rock. ");
        } else {
            System.out.print("paper. ");
        }

        System.out.print("You are ");
        if (userChoice == 0) {
            System.out.print("scissor. ");
        } else if (userChoice == 1) {
            System.out.print("rock. ");
        } else {
            System.out.print("paper. ");
        }

        if (computerChoice == userChoice) {
            System.out.println("It is a draw.");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}
