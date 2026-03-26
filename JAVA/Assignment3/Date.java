package Date;
public class Date {

    private int day;
    private int month;
    private int year;

    //Set Date Validation
    public void setDate(int d, int m, int y) {
        if (isValidDate(d, m, y)) {
            day = d;
            month = m;
            year = y;
            System.out.println("Date set successfully");
        } else {
            System.out.println("Invalid Date");
        }
    }
    // Display
    public void display() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    // Getters 
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    // Validation
    private boolean isValidDate(int d, int m, int y) {
        if (y < 0) {
            return false;
        }
        if (m < 1 || m > 12) {
            return false;
        }
        int maxDays = getDaysInMonth(m, y);

        if (d < 1 || d > maxDays) {
            return false;
        }
        return true;
    }

    // Leap Year
    private boolean isLeapYear(int y) {
        if (y % 400 == 0) {
            return true;
        } else if (y % 100 == 0) {
            return false;
        } else if (y % 4 == 0) {
            return true;
        } else {
            return false;  
        }
    }

    // Days in Month
    private int getDaysInMonth(int m, int y) {

        if (m == 1 || m == 3 || m == 5 || m == 7 ||
            m == 8 || m == 10 || m == 12) {
            return 31;
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }
        else if (m == 2) {
            if (isLeapYear(y)) {
                return 29;
            } else {
                return 28;
            }
        }
        else {
            return 0;
        }
    }
    // Add Days
    public void addDays(int d) {
        day = day + d;

        while (true) {
            int maxDays = getDaysInMonth(month, year);

            if (day > maxDays) {
                day = day - maxDays;
                addMonths(1);
            } else {
                break;
            }
        }
    }

    // Add Months
    public void addMonths(int m) {
        month = month + m;

        while (true) {
            if (month > 12) {
                month = month - 12;
                addYears(1);
            } else {
                break;
            }
        }

        int maxDays = getDaysInMonth(month, year);
        if (day > maxDays) {
            day = maxDays;
        }
    }

    // Add Years
    public void addYears(int y) {
        year = year + y;

        if (month == 2 && day == 29) {
            if (!isLeapYear(year)) {
                day = 28;
            }
        }
    }

    // Compare Dates 
    public static void compareDates(Date d1, Date d2) {

        if (d1.getDay() == d2.getDay() &&
            d1.getMonth() == d2.getMonth() &&
            d1.getYear() == d2.getYear()) {

            System.out.println("Dates are Equal");
        }
        else if (d1.getYear() > d2.getYear() ||
                (d1.getYear() == d2.getYear() && d1.getMonth() > d2.getMonth()) ||
                (d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth() && d1.getDay() > d2.getDay())) {

            System.out.println("Date1 is Greater");
        }
        else {
            System.out.println("Date2 is Greater");
        }
    }
}