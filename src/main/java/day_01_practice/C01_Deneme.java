package day_01_practice;

public class C01_Deneme {

    public static void main(String[] args) {

        //12345 sayisinin rakamlari toplamini bulunuz.

        int sayi=12345;

        int birler=sayi%10; //5
        int onlar =(sayi/10)%10; //4
        int yuzler =(sayi/100)%10;
        int binler=(sayi/1000)%10;
        int onbinler=sayi/10000;

        System.out.println(birler+onlar+yuzler+binler+onbinler);
    }
}
