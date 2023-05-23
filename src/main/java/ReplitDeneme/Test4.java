package ReplitDeneme;

public class Test4 {

    public static void main(String[] args) {


       /* Konsolda Alfabeyi Yazdıran programi yaziniz.

                OUTPUT  :

        a b c .. .. .. .. y z*/
       char i;


      for(i='a'; i<='z'; i++){

          System.out.print(i + " ");



        }
      /*  Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.


        Input :

        6

        Output:

        6 Mukemmel Sayidir.

======================

        Input

        7

        Output:

        7 Mukemmel Sayidir.*/

        System.out.println();
        int sayi =7;
        int toplam =0;
        for (int j = 1; j <sayi ; j++) {

            if (sayi % j == 0) {
                toplam = toplam + j;
            }
        }
                if (toplam==sayi){
                    System.out.println(sayi + " Mukemmel Sayidir.");

                } else{ System.out.println(sayi +" Mukemmel Sayi degildir ");
            }



      /*  'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.

                Ascii value of a = 97
        Ascii value of b = 98
        Ascii value of c = 99
        Ascii value of d = 100
        Ascii value of e = 101
        Ascii value of f = 102
        Ascii value of g = 103
        Ascii value of h = 104
        Ascii value of i = 105
        Ascii value of j = 106
        Ascii value of k = 107
        Ascii value of l = 108
        Ascii value of m = 109
        Ascii value of n = 110
        Ascii value of o = 111
        Ascii value of p = 112
        Ascii value of q = 113
        Ascii value of r = 114
        Ascii value of s = 115
        Ascii value of t = 116
        Ascii value of u = 117
        Ascii value of v = 118
        Ascii value of w = 119
        Ascii value of x = 120
        Ascii value of y = 121
        Ascii value of z = 122*/


    }
}
