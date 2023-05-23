package day_15_practice;

public class Memur extends Muhasebe {

    public static void main(String[] args) {


        Memur memur1 = new Memur();

    /*
    memur1 objesi, memur class'inin objesi olmasina ragmen inherit ettigi muhasebe ve onun da parent'i olan personel
    class'indaki tum datalari alabilir
     */
        //personel class'indan bulduk
        memur1.personelNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepe";
        memur1.adres="Ankara";
        memur1.tel="123456";


        //Muhasebe class'indan
        memur1.saatUcreti=10;
        memur1.statu="Memur";
        memur1.maas= memur1.maasHesapla();

        System.out.println(memur1.personelNo);  //1001
        System.out.println(memur1.maas);        //2400

        System.out.println(memur1.toString());
        //toString() methodu objelerin tum ozelliklerini yazdirmak icin pratik bir yontemdir

        ///////////////////////////////

        Memur memur2 = new Memur();

        memur2.personelNo= 1002;  //personel
        memur2.saatUcreti=10;     //muhasebe
        memur2.maas= memur2.maasHesapla();  //muhasebe

        System.out.println(memur2.personelNo);  //1002
        System.out.println(memur2.maas);        //2400

        System.out.println(memur2.toString());


    }
}
