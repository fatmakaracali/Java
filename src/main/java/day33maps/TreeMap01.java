package day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
    1)TreeMap, thread-safe ve synchronized degildir
    note: Map'lerde Multi-thread kullanmaniz gerektiginde sadece HashTable kullanabilirsiniz
    2) TreeMap'ler value'lerde null kullanilmasina musaade eder, key'lerde etmez
    3)TreeMap entry'leri key'lerine gore natural ordera göre siraya koyar. bu yuzden cooook yavastir
     */
    public static void main(String[] args) {

        long t1= System.nanoTime();

        TreeMap<String,Integer> countryPopulations = new TreeMap<>();

        countryPopulations.put("USA",400000000);
        countryPopulations.put("Netherland",16000000);
        countryPopulations.put("Turkiye",80000000);
        countryPopulations.put("Belgium",12000000);
        countryPopulations.put("Mexico",125000000);
        countryPopulations.put("Brazil",400000000);
        countryPopulations.put("France",75000000);
        countryPopulations.put("Finland",6000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Madagaskar",30000000);

        System.out.println(countryPopulations);
        long t2 = System.nanoTime();

        HashMap<String, Integer> countryPop = new HashMap<>();

        countryPop.put("USA", 400000000);
        countryPop.put("Netherland", 18000000);
        countryPop.put("Turkiye", 83000000);
        countryPop.put("Belgium", 12000000);
        countryPop.put("Mexico", 125000000);
        countryPop.put("Brasil", 215000000);
        countryPop.put("France", 75000000);
        countryPop.put("Finland", 8000000);
        countryPop.put("Germany", 85000000);
        countryPop.put("Madagaskar", 30000000);

        TreeMap<String, Integer> countryPop2 = new TreeMap<>(countryPop);

        System.out.println(countryPop2);

        long t3 = System.nanoTime();

        System.out.println(t2 - t1);
        System.out.println(t3 - t2);
    }
}
