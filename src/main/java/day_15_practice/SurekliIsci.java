package day_15_practice;

public class SurekliIsci extends Isci {




    public static void main(String[] args) {


        SurekliIsci surekliIsci1 = new SurekliIsci();

        surekliIsci1.personelNo=5001;  //personelden
        surekliIsci1.isim="Ali";       //personelden
        surekliIsci1.soyisim="Öz";     //personelden
        surekliIsci1.statu="Isci";     //muhasebeden
        surekliIsci1.saatUcreti=11;    //muhasebeden
        surekliIsci1.maas= surekliIsci1.maasHesapla(); //muhasebeden

        System.out.println(surekliIsci1.personelNo);  //5001
        System.out.println(surekliIsci1.isim);        //Ali




    }
}