package day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    //Application'larda "data" ile bu data'lari isleyen kod'lar(logic) birbirinden ayrilir
    //Yani; logic data'ya bagimli olmamalidir
    //Data'ya bagimli olarak yazilan kod'lara "hard code" denir, ona da hatali code denir

    //  Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
    //  "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
    //  kullanirsaniz hep dogru sonucu alirsiniz

    public static void main(String[] args) {

        //Array'leri kisa yoldan nasil olustururuz?
        int grades[] = {67, 98, 100, 34, 76};  //[67, 98, 100, 34, 76]
        System.out.println(Arrays.toString(grades));

        //grades array'indeki en kucuk ve en buyk grade'in toplamini ekrana yazdirian kodu yaziniz
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades)); ////[34, 67, 76, 98, 100]
        System.out.println(grades[0] + grades[grades.length - 1]); //134

        //Verilen bir String Array'deki isimlerden 5 karakterden az karakter icerenleri konsola yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w : stdNames) {

            if (w.length() < 5) {
                System.out.print(w);  //Ajda, Tom
            }
        }
        System.out.println();

        //Verilen bir String Array'deki isimleri alfabetik siraya koyduktan sonra  F ile baslayan
        // isimlerden onceki isimleri console'a yazdiriniz

        Arrays.sort(stdNames);


        for (String w : stdNames) {

            if (w.startsWith("F")) {
                break;
            }
            System.out.print(w); //Ajda, Ayhan, Cuneyt gerisine bakmaz Java


        }

        //Verilen bir String Array'deki isimleri alfabetik siraya koyduktan sonra  F ile baslayan
        // isimlerden onceki isimleri  ve F ile baslayanlari console'a yazdiriniz

        Arrays.sort(stdNames);


        for (String w : stdNames) {
            System.out.print(w);


            if (w.startsWith("F")) {
                break;



        }
        //Verilen bir String Array'deki isimleri alfabetik siraya koyduktan sonra  F ile baslayan
        // isimler haric diger  isimleri  console'a yazdiriniz
        Arrays.sort(stdNames);
        for (String w1 : stdNames) {

            if (w1.startsWith("F")) {
                continue;

            } else {
                System.out.println(w1);
            }

        }
        Arrays.sort(stdNames);//short() method'u numeric data'lari kucukten buyuge(ascending) dizer
        //Stringleri ise alfabetik(alphabetically) sirada dizer
        // ascending + alphabetically==> Naturel Order
    }
}}