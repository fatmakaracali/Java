package day32maps;

import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<String,Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);  //{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}
        stdAges.put("Tom",83);//ikinci kez yeni degerle girince sonrakini yazdirir yani oncekini gunceller
                               // key'i tekrarli kullandigimizda hata vermez
                               // bu yontem value guncellemede kullanilabilir
                               // buna "overwrite" denir

        System.out.println(stdAges);  //{Tom=76, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        //HashMap'ler entry'leri rastgele siralar, bu yuzden cok hizli calisir
        //Map'ler entry'leri siralarken "key"lere bakarak siralama yapar
        System.out.println(stdAges);   //{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        stdAges.replace("Ezel",39);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}
        // replace() methodu "value"leri key'leri kullanarak update etmeye yarar.
        // put() yerine, replace() kullanin guncellemek icin



        stdAges.replace("Angelina",58,61);
        //Angelina 58 Mapta varsa 61 yap, yoksa eskisini aynen yazdirir
        System.out.println(stdAges); //{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        stdAges.putIfAbsent("Brad",60);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        stdAges.putIfAbsent("Ali",60);// methodu Map'te "Ali" key olarak yoksa "ALI=60" EKLER, varsa eklemez

        System.out.println(stdAges.get("Tom")); //83
        System.out.println(stdAges.getOrDefault("Tom", 0)); //83



        System.out.println(stdAges.get("Ayse")); //null
        System.out.println(stdAges.getOrDefault("Tom", 0)); // 0

        //getOrDefault() methodu Map'ta varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir
        //getOrDefault() methodu Map'ta varolmayan "key"ler icin ikinci parametreye koydugunuz degeri,
        // get() methodu ise null verir

        System.out.println(stdAges.containsValue(77));//true
        System.out.println(stdAges.containsValue(99));//false
        // containsValue(77) methodu value'lerin icinde 77'nin olup olmadigini kontrol eder

        System.out.println(stdAges.containsKey("Ali")); //true
        //containsKey() methodu key'lerin icinde Ali'nin olup olmadigini kontrol eder

        stdAges.remove("Ali");
        System.out.println(stdAges); //{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}
        //remove(Ali) methodu key kullanarak "entry"i silmeye yarar

        stdAges.remove("Tom",83);
        System.out.println(stdAges);
        //remove("Tom", 81) methodu Map'de key'si"Tom" . value'si 81 olan bir entry varsa onu siler, yoksa silmez
        //{Angelina=61, Ajda=77, Brad=58, Ezel=39}

        HashMap<String,Integer> kidsAge = new HashMap<>();
        kidsAge.put("John",12);
        kidsAge.put("Jim",22);
        kidsAge.put("Jack",32);

        stdAges.putAll(kidsAge);
        System.out.println(stdAges); //{Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
                                     //Rastgele siralama yapti cunku HashMap
        // stdAges.putAll(kidsAge) methodu stdAges'e kidsAge'i ekler. Dolayisiyla stdAges degismis olur

    }
}
