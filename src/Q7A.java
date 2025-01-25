public class Q7A {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            char alphabet = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet++ + "   ");
            }
            System.out.println();
        }
    }
}
