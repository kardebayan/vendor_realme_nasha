import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total marks of student: ");
        int marks = input.nextInt();
        String grade;
        switch (marks / 10) {
            case 10:
            case 9:
                grade = "O";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            default:
                grade = "F";
        }
        System.out.println("The student's grade is: " + grade);
    }
}
