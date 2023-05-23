package day_15_practice;

public class UstaBasi extends Isci {

    public static void main(String[] args) {


        UstaBasi ustaBasi = new UstaBasi();

        ustaBasi.isim ="Murat";
        ustaBasi.soyisim= "Gökcek";
        ustaBasi.saatUcreti=15;
        ustaBasi.maas= ustaBasi.maasHesapla();
        ustaBasi.statu="Isci";
        ustaBasi.isciStatu="Ustabasi";

        System.out.println(ustaBasi.isim); //Murat
        System.out.println(ustaBasi.soyisim);  //Gökcek

        ustaBasi.mesai();  //Isciler gunde 8 saat ve haftada 5 gun calisir
    }
}