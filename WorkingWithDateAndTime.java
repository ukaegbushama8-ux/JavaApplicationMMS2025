import java.time.LocalDate;

public class WorkingWithDateAndTime {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        LocalDate myDate       = LocalDate.of(2014, 5, 17);
        LocalDate resumptionDate = LocalDate.parse("2026-06-17");

        System.out.printf("Today's date is %s%n", currentDate);
        System.out.printf("The resumption date is %s%n", resumptionDate);
        System.out.printf("The year is %d%n", currentDate.getYear());
        System.out.printf("The month is %d%n", currentDate.getMonthValue());   
        System.out.printf("The day is %d%n", currentDate.getDayOfMonth());
        System.out.printf("My exams will be on the %s%n", currentDate.plusDays(7));


       
    


    }
}