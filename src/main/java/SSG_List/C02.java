package SSG_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02 {
    public static void main(String[] args) {

        /*
        bir list olusturun ve bu listteki elemanlari alfabetik siraya gore siralayin
         */

        List<String> sehirler= new ArrayList<>();

        sehirler.add("Mersin");
        sehirler.add("Izmir");
        sehirler.add("Adiyaman");
        sehirler.add("Osmaniye");

        System.out.println(sehirler); //[Mersin, Izmir, Adiyaman, Osmaniye]

        Collections.sort(sehirler);
        System.out.println(sehirler); //[Adiyaman, Izmir, Mersin, Osmaniye]
    }
}
