package day22stringbuilder;

public class sb02 {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);  //Java is easy

        sb1.reverse();
        System.out.println(sb1);  //ysae si avaJ

        // interview da Stringi ters cevirmemizi isterlerse reverse ile mi yoksa loop ile mi istediklerini sor

        sb1.deleteCharAt(6); // verilen indeksteki karakteri siler
        System.out.println(sb1);   //ysae s avaJ

        sb1.delete(4,7); //baslangic indeksinden bitis(haric) indeksine kadar siler
        System.out.println(sb1);   //ysaeavaJ

        sb1.replace(2,5,"X" ); //indeks 2,3,4 yerine X koyar
        System.out.println(sb1);   //ysXvaJ

        sb1.insert(3,"2023");
        System.out.println(sb1);  //ysX2023vaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1); // 0- alfabetik olarak ayni siradalar demektir

        StringBuilder sb4 = new StringBuilder("Java");
        StringBuilder sb5 = new StringBuilder("Kava"); //-1
        // sonuc mesela -3 ise sb4 , sb5'ten alfabetik olarak 3 onde demektir
        //3 ise sb4 , sb5'ten alfabetik olarak 3 sonra demektir

        sb2.toString();  //StringBuilder'i String'e cevirir

        String str = sb1.toString().toUpperCase();
        System.out.println(str);

        StringBuilder newSb1 = new StringBuilder(str); // String StringBuilder'a cevirir
        System.out.println(newSb1);





    }
}
