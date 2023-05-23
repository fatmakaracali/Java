package day_15_practice;

public class Personel {

    // bir fabrikada gerekli olan departmanları;
    // Personel, Muhasebe, Memur, Isci, Surekliİsci, Ustabasi olarak farklı classlara ayırınız
    // Muhasebe departmanı, Personel departmanına baglı olacak
    // Memur ve Isci departmanları, Muhasebe departmanına baglı olacak
    // Surekliİsci ve UstaBasi departmanları, İsci departmanına baglı olacak

    // Memur, Surekliİsci ve UstaBası departmanlarından obje olusturarak,
    // variable'lara kendi departmanlarına gore deger atayınız ve yazdırınız


    /*
    Personel class'i en ustteki class oldugu icin herkes icin var olan datalari burada olusturabiliriz.
     */

    protected int personelNo;
    protected String isim;
    protected String soyisim;
    protected String adres="Adres girilmedi";
    protected String tel="Tlf girilmedi";
}
