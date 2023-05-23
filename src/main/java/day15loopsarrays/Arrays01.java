package day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    //Arrays, Java'nin "ayni data tipinde coklu data" depolamak icin olusturdugu bir yapidir
    //Array'ler "primitive data type"leri ya da "reference " lar ile calisir
    //Array'ler "super fast" dir ve memory'de cok az yer kaplar

    public static void main(String[] args) {


        //Array nasil olusturulur?
        String stdNames[] = new String[5];

        //Array nasil yazdirilir?

        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]null String'in default degeridir

        //Array'e nasil eleman eklenir?
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));

        //Array'deki specific bir elemani nasil alabiliriz?

        System.out.println(stdNames[3]);  //Cuneyt

        // stdNames array'indaki her ismin sonuna yildiz yazarak konsola yazdiriniz

        for (int i = 0; i < stdNames.length; i++) {   // lenght String'lerde parantezli, array'de parantezsiz kullanilir
            System.out.println(stdNames[i] + "*");
        }   // parantezli ise method, degilse method degil

        //2.way : for-each loop ==> Enhanced(Zenginlestirilmis) Loop. Mumkunse hep for each loop kullanin

        for (String w : stdNames) {
            System.out.println(w + "*");

        }


        // Bir integer array olusturunuz, 5 eleman ekleyiniz, elemanlarin toplamini bulup konsola yazdiriniz

        int ages[] = new int[5];
        System.out.println(Arrays.toString(ages)); //[0,0,0,0,0]
        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 9;
        ages[3] = 38;
        ages[4] = 27;
        System.out.println(Arrays.toString(ages));   //[12, 23, 9, 38, 27]

        int sum = 0;
        for (int w : ages) {
            sum = sum + w;
        }
        System.out.println(sum);   // 109

        //Bir char Array olusturunuz, 3 eleman ekleyiniz, elemanlarin carpimini bulup console'a yazdiriniz

        char initials[] = new char[3];
        initials[0] = 'J';
        initials[1] = 'P';
        initials[2] = 'A';

        int carpim = 1;

        for (char w : initials) {
            carpim = carpim * w;

        }
        System.out.println(carpim);


        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "&");  //benim ornek


        }

        char initial2[] = new char[2];             //benim ornek
        initial2[0] = 'v';
        initial2[1] = 'n';

        int carpim1 = 1;
        for (char p : initial2) {
            carpim1 = carpim1 * p;

        }
        System.out.println(carpim1);







    }
}