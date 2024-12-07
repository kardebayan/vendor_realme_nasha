import java.util.Scanner;

public class Q5H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your gender (M or F): ");
        char gender = input.next().toUpperCase().charAt(0);
        System.out.print("First Name: ");
        String firstName = input.next();
        System.out.print("Last Name: ");
        String lastName = input.next();
        System.out.print("Age: ");
        int age = input.nextInt();
        if (gender == 'F' && age >= 20) {
            System.out.print("Are you married, " + firstName + " (y or n) ? ");
            char choice = input.next().toLowerCase().charAt(0);
            if (choice == 'y') {
                System.out.println("Then I shall call you Mrs. " + firstName + " " + lastName + ".");
            } else {
                System.out.println("Then I shall call you Ms. " + firstName + ".");
            }
        } else if (gender == 'F' && age < 20) {
            System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
        } else if (gender == 'M' && age >= 20) {
            System.out.println("Then I shall call you Mr. " + firstName + ".");
        } else {
            System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
        }
    }
}
