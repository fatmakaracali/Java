package day_13_practice;

public class C03_Varargs {

    //kac tane kelime verilirse verilsin iclerinden en uzun olani yazdiran bir method olusturun
    // bu methodun access modifier'ini default yapip ayni package'deki farkli bir class'dan calistiriniz
    //bu method'un access modifier'ini protected yapip farkli bir package'deki farkli bir class'dan calistiriniz
    //bu method'un access modifier'ini public yapip farkli bir package'deki farkli bir class'dan calistiriniz
    public static void main(String[] args) {


        String str1 = "Ali";
        String str2 = "Alim";
        String str3 = "Alican";
        String str4 = "Aliveli";

        enUzunKelime(str1,str2,str3,str4);

    }

     public static String enUzunKelime(String...str) {

         String enUzunKelime = "";

         for (String each : str) {
             if (each.length() > enUzunKelime.length()) {
                 enUzunKelime = each;
             }
         }
        return enUzunKelime;   // return enUzunKelime  yaparsak void String olmali
     }

}
