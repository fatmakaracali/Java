package day37exceptionenums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {

    public static void main(String[] args) throws IllegalGradeException {

        /*
       1)try kullandigimizda her senaryo icin calismasini istedigimiz kodlari "finally block" icine koyariz
       2) "final", "finally", "finalize" aciklar misiniz

       finalize:" Garbage Collector " memory'i temiz tutmak icin surekli memory'i tarar ve silinmesi gerekeni siler
        Garbage Collector, silmeden once silecegi data'lari finalize eder sonra siler
         */

      //  System.out.println(getGrades());
        try{
        printAge(-45);}
        catch(IllegalAgeException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("I always work");
        }


    }
    //Example 1: Ogrenci notlarini bir List'e ekleyen method'u olusturunuz
    public static List<String> getGrades() throws IllegalGradeException {

        List<String> grades = new ArrayList<>();
        String grade = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter the grade. To stop entering press q.");
            grade = input.next();

            int intGrade = 0;

            if(!grade.equals("q")) {
                intGrade = Integer.valueOf(grade);
            }

            if(grade.equals("q")){
                break;
            } else if(intGrade>=0 && intGrade<=100){
                grades.add(grade);
            }else{
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
            }

        }while(!grade.equals("q"));

        return grades;
    }

    //Kullanicinin yasini konsola yazdiran methodu olusturunuz

    public static void printAge(int age){

        if(age<0){
            throw new IllegalAgeException("Age cannot be nagative");
        }
        System.out.println(age);
    }


    }