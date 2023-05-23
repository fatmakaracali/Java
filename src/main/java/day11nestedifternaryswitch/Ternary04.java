package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {

    public static void main(String[] args) {

        //Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz
        //1) Ternary'de true false durumlari icin size verilen data type lari farkli ise olusturdugunuz container'in
        //data type'ini "Object" yapin
        // "Object" Java'da bir class'tir
        // "0bject" Java'daki butun class'larin  "Parent"idir. Yani babasidir. Hz.Adem gibi
        //"Object" class'in "Parent"i yoktur
        // Java'da parent'i olmayan tek class "Object Class"tir.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num = input.nextInt();

        Object result = num%2==0 ? num/2 : "Bu sayi ikiye bolunmez";

        System.out.println(result);


            }
        }

