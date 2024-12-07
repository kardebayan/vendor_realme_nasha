import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x-coordinate: ");
        double x = input.nextDouble();

        System.out.print("Enter the y-coordinate: ");
        double y = input.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("(0.0, 0.0) is at the origin.");
        } else if (x == 0) {
            System.out.println("(" + x + ", " + y + ") is on the y-axis.");
        } else if (y == 0) {
            System.out.println("(" + x + ", " + y + ") is on the x-axis.");
        } else if (x > 0 && y > 0) {
            System.out.println("(" + x + ", " + y + ") is in quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("(" + x + ", " + y + ") is in quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("(" + x + ", " + y + ") is in quadrant III.");
        } else {
            System.out.println("(" + x + ", " + y + ") is in quadrant IV.");
        }
    }
}