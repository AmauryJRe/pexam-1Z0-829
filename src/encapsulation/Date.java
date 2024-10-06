package encapsulation;

public final class Date {
    private int day;
    private int month;
    private int year;

    private int[] date;

    public Date(int[] date) {
        if (isValid(date[0], date[1], date[2])) {
            this.date = date.clone();
        } else throw new IllegalArgumentException("Bad values for a date");
    }

    public void setDay(int day) {
        if (isValid(day, date[1], date[2])) {
            date[0] = day;
        } else throw new IllegalArgumentException("Bad values for a date");
    }

    public int getDay() {
        return date[0];
    }

    public int[] getDateValues() {
        return date.clone(); // or Collections.unmodifiableList or similar, in case of returning a list
    }
    //    public Date(int day, int month, int year) {
//        if (isValid(day, month, year)) {
//            this.day = day;
//            this.month = month;
//            this.year = year;
//        } else throw new IllegalArgumentException("Bad values for a date");
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        if (isValid(this.day, this.month, year)) {
//            this.year = year;
//        } else throw new IllegalArgumentException("Bad values for a date");
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        if (isValid(this.day, month, this.year)) {
//            this.month = month;
//        } else throw new IllegalArgumentException("Bad values for a date");
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        if (isValid(day, this.month, this.year)) {
//            this.day = day;
//        } else throw new IllegalArgumentException("Bad values for a date");
//    }

    private boolean isValid(int day, int month, int year) {
        if (year < 0 || month < 1 || month > 12 || day < 1) return false;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return day <= daysInMonth[month - 1];
    }

    private boolean isLeapYear(int year) {
        double ym4 = year % 4;
        double ym100 = year % 100;
        double ym400 = year % 400;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

//class BadDate extends Date {
//    int day;
//
//    public BadDate(int[] date) {
//        super(date);
//        day = date[0];
//    }
//
//    @Override
//    public void setDay(int day) {
//        this.day = day;
//    }
//
//    @Override
//    public int getDay() {
//        return day;
//    }
//}

class DemoDate {
    public static void main(String[] args) {
//        Date d = new Date(29, 2, 2024);
        int[] tdate = new int[]{29, 2, 2024};
        Date d = new Date(tdate);
        System.out.println("day is " + d.getDay());
        tdate[0] = -1;
        System.out.println("day is " + d.getDay());
        d.getDateValues()[0] = -99;
        System.out.println("day is " + d.getDay());

//        Date d2 = new BadDate(new int[]{1, 1, 2022});
//        System.out.println("day is " + d2.getDay());
//        d2.setDay(-99);
//        System.out.println("day is " + d2.getDay());
    }
}
