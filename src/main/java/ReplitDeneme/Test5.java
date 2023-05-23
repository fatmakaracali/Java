package ReplitDeneme;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int i;
        for (i = 97; i <= 122; i++) {
            System.out.println("Ascii value of " + (char) i + " = " + i);

        }

        /*100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

                OUTPUT  :
        100 98 96 94 92 … … … … 2 0*/
        for (int j = 100; j >= 0; j = j - 1) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

      /*  Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)


        Input  :1238

        Output :Girilen Numananin Tersi: 8321*/


        int n, ters=0, r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number That You Want Reverse : \n\n");
        n = sc.nextInt();

        while(n!=0)
        {
            r=n%10;
            ters=ters*10+r;
            n/=10;
        }

        System.out.print("Reversed Number = "+ters);

        /*
        1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
OutPut:

Sayilarin Toplami : 5050
         */

        int c = 1;
        int toplam = 0;
        while( c<=100){
            toplam =toplam+c;
            c++;
        }
        System.out.println("Sayilarin Toplami : "+toplam);







    }
}