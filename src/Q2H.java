import java.util.Scanner;

public class Q2H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int day = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int dayelapsed = input.nextInt();

        int futureDay = (day + dayelapsed) % 7;

        String DayName;
        String futureDayName;

        switch (day) {
            case 0:
                DayName = "Sunday";
                break;
            case 1:
                DayName = "Monday";
                break;
            case 2:
                DayName = "Tuesday";
                break;
            case 3:
                DayName = "Wednesday";
                break;
            case 4:
                DayName = "Thursday";
                break;
            case 5:
                DayName = "Friday";
                break;
            default:
                DayName = "Saturday";
        }

        switch (futureDay) {
            case 0:
                futureDayName = "Sunday";
                break;
            case 1:
                futureDayName = "Monday";
                break;
            case 2:
                futureDayName = "Tuesday";
                break;
            case 3:
                futureDayName = "Wednesday";
                break;
            case 4:
                futureDayName = "Thursday";
                break;
            case 5:
                futureDayName = "Friday";
                break;
            default:
                futureDayName = "Saturday";
        }

        System.out.println("Today is " + DayName + " and the future day is " + futureDayName);
    }
}
