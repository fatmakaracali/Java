package ReplitDeneme;

import java.util.Arrays;

public class TestArray1 {
    public static void main(String[] args) {

        /*
        Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.

not: Test datadaki değerleri kullanınız.
Test Data:
[1232, 1134,2345,1022]
`[Java, Python, PHP, C#, C Programming, C++]
```
Beklenen Çıktı:
`[1022,1134,1232,2345]
`[C Programming, C#, C++, Java, PHP, Python]*/


        int arr1[] = new int[4];
       arr1[0]=1234;
       arr1[1]=1134;
       arr1[2]=2345;
       arr1[3]=1022;

      Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

       String b []= new String[6];
       b[0]="Java";
       b[1]="Pyton";
       b[2]="PHP";
       b[3]="C#";
       b[4]="C Programming";
       b[5]="C++";

       Arrays.sort(b);
        System.out.println(Arrays.toString(b));



    }
}
