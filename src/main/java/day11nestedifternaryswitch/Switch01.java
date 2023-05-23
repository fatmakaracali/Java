package day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {


        /* Gun isimlerini kullanicidan aliniz, o gunun kacinci gun oldugunu ekrana yazdiriniz


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day name");
        String dayName = input.next();

       if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Sunday is the first day");
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println("Monday is the second day");
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("Tuesday is the third day");
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("Wednesday is the fourth day");
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println("Thursday is the fifth day");
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Friday is the sixth day");
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("Saturday is the seventh day");
        } else System.out.println("iNVALID DAY NAME");

        //2.Way
        switch (dayName.toLowerCase()) {

            case "sunday":
                System.out.println("Sunday is the first day");
                break;
            case "monday":
                System.out.println("Monday is the second day");
                break;
            case "tuesday":
                System.out.println("Tuesday is the thirdday");
                break;
            case "wednesday":
                System.out.println("Wednesday is the fourth day");
                break;
            case "thursday":
                System.out.println("Thursday is the fifth day");
                break;
            case "friday":
                System.out.println("Friday is the sixth day");
                break;
            case "saturday":
                System.out.println("Saturday is the seventh day");
                break;
            default:
                System.out.println("Invalid day name");


                char ch = 'a';
                switch (ch){
                    case 'a' :
                    case 'A' :
                        System.out.print(ch);
                        break;
                    case 'b' :
                    case 'B' :
                        System.out.print(ch);
                        break;
                    case 'c' :
                    case 'C' :
                        System.out.print(ch);
                        break;
                    case 'd' :
                    case 'D' :
                        System.out.print(ch);

        }
        }




            }
        }

