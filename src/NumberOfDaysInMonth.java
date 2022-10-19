import java.time.YearMonth;
public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){
        double resto = year % 100;
        System.out.println("resto1 " + resto);
         resto = year % 4;
        System.out.println("resto2 " + resto);
         resto = year % 400;
        System.out.println("resto3 " + resto);
        if (year <1 || year > 9999){
            return false;
        } else {
            if (year % 4 == 0 && year % 400 == 0) {
                System.out.println("1");
                if (resto == 0) {
                    System.out.println("2");
                    return false;
                }
                else return true;
            }
            else {
               return false;
            }

            }
        }


    public static int getDaysInMonth(int month, int year){

        if (month < 1 || month >12){
            return -1;
        }
        if (year <1 || year > 9999) {
            return -1;
        }
        boolean leapyear;
        leapyear = isLeapYear(year);
        if (leapyear) {
            YearMonth yearMonthObject = YearMonth.of(year, month);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            return daysInMonth;
        }
        else {
            YearMonth yearMonthObject = YearMonth.of(year, month);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            return daysInMonth;
        }
    }
}
