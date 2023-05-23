package day21datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class SoruCozumu {

    public static void main(String[] args) {

        LocalDate birthDateOfFatma= LocalDate.of(1983,1,11);
        LocalDate currentDate= LocalDate.now();
        long numberOfDaysFatmaLived= ChronoUnit.MONTHS.between(birthDateOfFatma,currentDate);
        System.out.println("The number of days Fatma lived so far is: "+ numberOfDaysFatmaLived);


        LocalDate birthDateOfAli = LocalDate.of(1997,6,4);
        LocalDate exactDate =birthDateOfAli.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println("Exact date is :" + exactDate);

        LocalDate currentDate1= LocalDate.now();
        LocalDate next = currentDate1.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(next);



        LocalDate dobAli =LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dobVeli = LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dobAli.equals(dobVeli));


        LocalDate birthAli= LocalDate.of(2012,11,24);
        LocalDate birthVeli= birthAli.plusYears(3).plusDays(11);
        System.out.println(birthVeli);

        LocalDate crntDay= LocalDate.of(1983,1,11);
         int lastTwoDigits= crntDay.getYear()%100;
        System.out.println(lastTwoDigits);


        LocalDate date= LocalDate.of(1996,8,23);
        boolean isLeap = date.isLeapYear();
        System.out.println(isLeap);

        LocalDate birthDateOfFatmaa= LocalDate.of(1983,1,11);
        LocalDate birthAlii= LocalDate.of(2012,11,24);

       /* long differenceHours= ChronoUnit.HOURS.between(birthDateOfFatmaa,birthAlii);
        System.out.println(differenceHours);*/









    }
}
