package day_11_practice;

public class C02_static {


    static String okulIsmi="Yildiz Koleji";
    static int okulNo;

    static boolean okulAcikMi;

            /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/
            public static void main(String[] args) {

     //static variable'lara class icerisindeki tum method'lardan direkt ulasabiliriz

                System.out.println(okulIsmi);     //Yildiz Koleji
                System.out.println(okulNo);       //0
                System.out.println(okulAcikMi);   //false

                //////////////////////////////////////////

     //static variale'lar gokteki ay gibidir.
     //static variable'lar class'a baglidir
     //static variable'larin degeri bir kisi tarafindan degistirilirse herkes icin degisiklige ugrar

               okulNo=102;
                System.out.println(okulNo);

                staticMethod();
                System.out.println(okulNo);  //200

            }//main

    private static void staticMethod() {

                okulNo=200;

        System.out.println(okulNo); //200
    }
}
