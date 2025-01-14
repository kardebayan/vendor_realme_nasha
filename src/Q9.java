import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();
        String numberString = Integer.toString(number);
        String result = numberString.replace("0","");
        System.out.println("After removing 0 from number " + number + ", the new number is " + result + ".");
    }
}
