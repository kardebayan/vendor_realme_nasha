import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int i = 0;
        int sum = 0;
        do {
            int rand = (int)(Math.random() * number) + 1;
            System.out.print(rand + " ");
            sum += rand;
            i++;
        } while (i < number);
        System.out.println();
        System.out.println("Average of " + number + "numbers are " + sum/number);
    }
}
