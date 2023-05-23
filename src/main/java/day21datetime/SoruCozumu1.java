package day21datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class SoruCozumu1 {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        if (hour>0 && hour<5){
            System.out.println("Sleeping time");

        }else if (hour>8 && hour<16){
            System.out.println("Working time");
        }else if (hour>19 && hour<22){
            System.out.println("Family time");
        }else{
            System.out.println("Personal time");
        }


        LocalDateTime timeJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeJapan);
        LocalDateTime timeGermany= LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeGermany);

        long difference= ChronoUnit.HOURS.between(timeGermany,timeJapan);
        System.out.println(difference);





    }
}
