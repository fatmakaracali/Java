package day13incrementdicrement;

public class ForLoopAksam1 {

    public static void main(String[] args) {

        // Verilen bir String'de kicuk harfleri console'a yazmayiniz
        //"Pwd12?Ab"

        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;
            }                //continue bosveeerrrrr
            else {
                System.out.print(ch);
            }
        }
        System.out.println();
        //"break" ile "continue" arasindaki fark nedir?
        //"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
        //"continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.

        //Bir String'i ters ceviren kodu yazdiriniz
        String n = "Java";
        String ters = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            ters = ters + n.substring(i, i + 1);

        }
        {
            System.out.println(ters);
        }
        String m = "Java";
        String ters2 = "";                                 //onemli soru
        for (int i = n.length() - 1; i >= 0; i--) {
            ters2 = ters2 + m.charAt(i);
            //ters2= ters + m.substring(i,i+1);
        }
        {
            System.out.println(ters);
        }
        System.out.println();
        //bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578==>5+7+8
        int sum = 0;                              // int n=-578    n= Maths.abs(n) negatifi pozitife cevirebilirsin

        for (int i = 578; i > 0;  i /= 10) {

           sum =sum+ i%10;

        }
        System.out.println(sum);
    }
}