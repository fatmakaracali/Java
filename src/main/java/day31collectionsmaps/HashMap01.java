package day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

          /*
        MY NOTES:
            Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
            "key" kismi tekrarsiz, "value" tekrarli olabilir.
            Map'ler "key" ve "value" structure'ini kullanir.
            Map'lerdeki elemanlara "Entry" denir.
            Elemanlarin tamamina ise "EntrySet" denilir.
            "Entry"ler tekrarsiz oldugu icin "EntrySet"denilir.
            "Key" ve "Value" lar ayri ayri data type'larinda olabilirler.
            "Map"'ler Collection degildir, farkli bir yapidir.

            HashMap'ler "entry"leri rastgele siralar, bu yuzden en hizli map'dir.
     */


        //Map nasil olusturulur?
        HashMap<String,Integer> countryPopulation = new HashMap<>();

        //Map nasil yazdirilir?
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",30000000);
        countryPopulation.put("USA",450000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Holland",18000000);

        System.out.println(countryPopulation);
        //{Turkiye=83000000, USA=450000000, Germany=83000000, Albania=30000000, Holland=18000000}

        // get() methodu "key" ile calisir ve "value" kismini verir
        int usaPopulation= countryPopulation.get("USA");
        System.out.println(usaPopulation); //450000000

        //Butun key'leri nasil aliriz?
         Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);


        //Butun value'leri nasil aliriz?

        Collection<Integer>  values =countryPopulation.values();
        System.out.println(values);

        //countryPopulation map'indeki ulkelerin nufuslarinin ortalamasi nedir?


        Collection<Integer>  value =countryPopulation.values();

        int sum=0;

        for (Integer w : value) {
            sum = sum + w ;
        }
        System.out.println(sum/ value.size()); //132800000

        //*******************
        // entrySet() "entry"leri kalip halinde alip bize "Set"in icine koyarak verir
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz

        Set<Map.Entry<String,Integer>> entries =  countryPopulation.entrySet();
        System.out.println(entries);

        //countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz
        int toplam=0;

        for (Map.Entry<String,Integer> w : entries){

            toplam = toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam); //664000031






    }
}
