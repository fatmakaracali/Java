package introduction;

public class Variables01 {
    //javada kac cesit data type vardir?
    // iki tip data vardir.
    //1) primitive: char,boolean,byte,short,int,long,float,double
    //primitive data typelarin sayisi belli.
    //2) non primitive:String


    //not 1: primitive data type lari Java olusturmustur.biz olusturamayiz.
    //2) primitive datalar larin isimlerinde sadece kucuk harfler kullanilir.
    //3) memoryde farkli yer kaplarlar.
    //4)primitive datalar iclerinde sadece sizin atadiginiz degerler vardir.

    //non-primitive data types: ornegin String
    // not 1) uretilen herbir class ayni zamanda bir "non-primitive type" tir.
    // bu yuzden non primitive data type lar sinirsiz sayidadir.
    //2) non primitive data type larin isimleri buyuk harfle baslar
    //3) non primitive data type larin tamami icin java memory de ayni miktarda yer ayirir.
    //
    public static void main(String[] args) {
        // ornek 1 : sehir ismi icin bir variable olusturun ve bir deger atayip ekrana yazdir
        String sehirIsmi = "Ankara" ;
        System.out.println(sehirIsmi);

        // interview sorusu : primitive ve non- primitive data type larin arasindaki fark nedir?
        // 1)primitive de sadece atadigimiz deger vardir. ama
        //non-primitive ler, bizim atadigimiz deger ve methodlar icerir.
        // primitive ler ,kucuk harfle baslar ama non-primitive ler, buyuk harfle baslar.
        //3)primitiveleri java uretmistir 8 tane.
        // non-primitiveleri java ve developerlar uretebilir.bu yuzden sinirsiz sayidadir.
        //4) primitive ler memoryde data type ina gore yer kaplar.
        // non-primitiveler icin java memoryde hep ayni buyuklukte yer ayirir.


    }



}
