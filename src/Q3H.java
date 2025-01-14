public class Q3H {
    public static void main(String[] args) {
        // Iterate from 1000 to 2000
        for (int i = 1000; i <= 2000; i++) {
            System.out.print(i + " "); // Print the number with a space

            // Check if it's the 5th number in the current line
            if ((i - 1000 + 1) % 5 == 0) {
                System.out.println(); // Move to the next line
            }
        }
    }
}
