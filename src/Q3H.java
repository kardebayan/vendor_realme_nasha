public class Q3H {
    public static void main(String[] args) {
        int month = (int) (Math.random() * 12) + 1;
        String MonthName;
        switch (month) {
            case 1:
                MonthName = "January";
                break;
            case 2:
                MonthName = "February";
                break;
            case 3:
                MonthName = "March";
                break;
            case 4:
                MonthName = "April";
                break;
            case 5:
                MonthName = "May";
                break;
            case 6:
                MonthName = "June";
                break;
            case 7:
                MonthName = "July";
                break;
            case 8:
                MonthName = "August";
                break;
            case 9:
                MonthName = "September";
                break;
            case 10:
                MonthName = "October";
                break;
            case 11:
                MonthName = "November";
                break;
            default:
                MonthName = "December";
        }

        System.out.println("Your random month is " +  MonthName);
    }
}
