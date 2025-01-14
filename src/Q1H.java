public class Q1H {
    public static void main(String[] args) {
        int n = 10; // The first n natural numbers
        int sumOfSquares = 0;
        int sum = 0;

        // Calculate the sum of squares and the sum of numbers
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i; // Sum of squares
            sum += i;             // Sum of numbers
        }

        // Calculate the square of the sum
        int squareOfSum = sum * sum;

        // Calculate the difference
        int difference = squareOfSum - sumOfSquares;

        // Print the results
        System.out.println("The sum of the squares of the first " + n + " natural numbers is: " + sumOfSquares);
        System.out.println("The square of the sum of the first " + n + " natural numbers is: " + squareOfSum);
        System.out.println("The difference is: " + difference);
    }
}
