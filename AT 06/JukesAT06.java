//Ryan Jukes
//HW AT06
//10-29-24

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;

    public class JukesAT06 {
        public static void main(String[] args) {
            
        LocalDate today = LocalDate.now(); 
        LocalDate FirstDayofMonth = today.minusDays(today.getDayOfMonth()-1);
        Month month = today.getMonth();
        DayOfWeek dayOfweek;
        dayOfweek = FirstDayofMonth.getDayOfWeek();
        int daysInMonth = month.length(today.isLeapYear());

        System.out.println("          "+month);
        System.out.println("MON TUE WED THU FRI SAT SUN");

        int DayofWeekVal = dayOfweek.getValue();

       for (int numb = 1; numb < DayofWeekVal; numb++) {
        System.out.print("    ");
       }

       for (int curday =1; curday <= daysInMonth; curday++) {
        if (curday == today.getDayOfMonth()) {
            System.out.printf("%4d*", curday);
        
        } else if (curday == today.getDayOfMonth()+1) {
            System.out.printf("% 3d", curday);
        } else {
            System.out.printf("%4d", curday);
        }
        if ((curday+DayofWeekVal-1)%7 == 0) {
            System.out.println();
        }
       }
        if ((daysInMonth+DayofWeekVal-1)%7 != 0) {
        System.out.println();
    }
    
    } 
}


    
   