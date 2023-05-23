package day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {

    public static void main(String[] args) {

        /*Numerik data typle'larin birbirine dönusturulmesine Type Casting denir.
          Numerik Data type'lari byte<short<int<long<float<double
          Kucuk Data type'larin buyuk Data type'larina donusturulmesine Auto Widening(Otomatik Genisletme) denir
          Yani kucuk kutunun buyuk kutu icerisine yerlestirilmesi

          *Buyuk kutunun kucuk kutuya donusturulmesinde Java sorumluluk kabul etmez.Data kaybi olabilecegi icin code'u
          yazanlara birakir.Buna " Explicit Narrowing"(Aciktan Daraltma ) denir*/


         byte age = 13;
         int ageInt = age;// bu yaptigimiza AutoWidening (Otomatik Genisletme) denir

        long nufus = 123498;
        short nufus3 = (short) nufus;// Explicit Narrowing( Aciktan Daraltma)

        int weight = 88;
        float weightFloat= weight;// AutoWidening


    }
}
