public class Q2H {
    public static void main(String[] args) {
        int limit = 1000; // Upper limit (not inclusive)
        int sum = 0;

        // Iterate through numbers below the limit
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) { // Check if the number is a multiple of 3 or 5
                sum += i; // Add it to the sum
            }
        }

        // Print the result
        System.out.println("The sum of all the multiples of 3 or 5 below " + limit + " is: " + sum);
    }
}
