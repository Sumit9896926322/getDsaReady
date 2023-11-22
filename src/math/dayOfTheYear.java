package math;

//https://leetcode.com/problems/day-of-the-year/
public class dayOfTheYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String date = "2003-03-01";
        String[] dateArr = date.split("-");

        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);

        int[] numOfDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        for (int i = 1; i < month; i++) {
            if (i == 2 && isLeapYear(year)) {
                totalDays += 29;
                continue;
            }
            totalDays += numOfDaysInMonth[i-1];
        }

        System.out.println(totalDays+day);
    }
}


