package day20arraylistdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);   //2023-03-15

        //Tarih'ten istedigimiz bileseni nasil aliriz
        int monthValue =myCurrentDate.getMonthValue();
        System.out.println(monthValue);      //3


        int yearValue=myCurrentDate.getYear();
        System.out.println(yearValue);   //2023


        int dayValue=  myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);    //15

        Month monthName = myCurrentDate.getMonth();  //MARCH
        System.out.println(monthName);    //Month bir Enum.dir. Sabit degerleri depolamak icin kullanilir
                                          // ay isimleri, gun isimleri, sehir isimleri...)

        DayOfWeek  dayName= myCurrentDate.getDayOfWeek();  //DayOfWeek bir Enum'dir
        System.out.println(dayName);     //WEDNESDAY

        //ileriki tarihe nasil gidilir
        System.out.println( myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));
        //2027-05-20

        //Specifik bir tarih objesi nasil olusturulur?

        System.out.println( myCurrentDate.minusYears(5).minusMonths(8).minusDays(7));

        LocalDate gokhanDg = LocalDate.of(1986,6,10);

        LocalDate fatih = LocalDate.of(1985,2,25);

         boolean r1 = gokhanDg.isAfter(fatih);
        System.out.println(r1);

         boolean r2 =  fatih.isBefore(gokhanDg);
        System.out.println(r2);

        boolean r3 =gokhanDg.isEqual(fatih);
        System.out.println(r3);


        //kullanicidan aldiginiz tarih gecmise ait ise "gecersiz tarih girdiniz" mesaji veriniz.
        // tarih gelecege ait ise zamani girebilirsiniz deyiniz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year,month and day numbers in order");
        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println( givenDate + " Invalid day ");
        }else {
            System.out.println("Enter time for the ticket");
        }

        int lenghtOfMonth= myCurrentDate.lengthOfMonth();
        System.out.println(lenghtOfMonth);

        //Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz

        System.out.println("Please enter year,month and day numbers in order");
        int y= input.nextInt();
        int m= input.nextInt();
        int d= input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);

        System.out.println( date.getDayOfWeek());











    }
}
