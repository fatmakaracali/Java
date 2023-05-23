package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class  Set01 {

    /* 1) Set'ler tekrarsiz eleman(unoque) depolamak icin kullanilir
       2) 3tane Set Class vardir
       i)HashSet Class:
                        Hash Benzersiz id olusturma teknigidir. bu teknige "Hashing Technique" denir
                        HashSet elemanlari rastgele siralar
                        HashSet elemanlari  siralamadigindan cok hizli calisir
                        HashSet'ler, "null"i eleman olarak kabul eder
                        HashSet'ler tekrarsiz eleman depolamak icindir
       ii)LinkedHashSet Class:
                        LinkedHashSetler elemanlari sizin verdiginiz siraya gore dizdiklerinden(insertion order)
                        "HashSetlere gore  yavastir
                          LinkedHashSetler, tekrarsiz eleman depolamak icindir
      iii) TreeSet Class:
                        "TreeSet'ler elemanlari natural order'a gore dizerler
                        "TreeSet"ler elemanlari natural order'a gore dizdiklerinden coook yavastir
                        En yavas Set "TreeSet"tir
       3) TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz

     */
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");//Tekrarli eleman ekledigimizde hata vermez ama tekrarli elemani sadece bir kere ekler
        hs.add(null); //Java icin degeri sifir0 demektir. oyuzden en basa koyar
        hs.add(null);
        System.out.println(hs); //[null, Zeki, Ajda, Cuneyt, Esra, Ezel]

        System.out.println(hs.hashCode()); //2038751948



        // ******LinkedHashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);

        System.out.println(lhs);  //[234, 87, -32, 124, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        System.out.println(ls);

        lhs.retainAll(ls);
        System.out.println(lhs);//ilk LinkedHashSet'teki farkli elemanlar silindi  [87, 124]
        System.out.println(ls); //[451, 87, 231, 124]
        System.out.println("lhs " + lhs);





        //*******TreSet*****

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
        //ts.add(null); //TreeSetlere null eklenemez
        System.out.println(ts);  //[A, G, R, U, Z]

        System.out.println(ts.first());  // A
        System.out.println(ts.last());   //Z

        System.out.println(ts.lower('R')); //G ==>Verilen eleman olan R 'den bir onceki elemani verir
        System.out.println(ts.lower('D')); // A
        System.out.println(ts.lower('A')); //null

        System.out.println(ts.higher('K')); // R==> Verilen K'dan sonraki elemani verir

        System.out.println(ts.headSet('R')); //=>Parantez icindeki R dahil degildir.soyledigin harfe kadar
                                                        //en bastan alir [A,G]
        System.out.println(ts.headSet('R', true));  //[A, G, R]

        System.out.println(ts.headSet('G', true));//

        System.out.println(ts.tailSet('G')); //Parantez icindeki G dahildir //[G, R, U, Z]

        System.out.println(ts.tailSet('G', false)); //Parantez ici dahil degildir //[R, U, Z]

        System.out.println(ts.ceiling('R'));  //R eleman Setin icinde varsa elemanin kendisi return eder

        System.out.println(ts.ceiling('K'));//R  eleman Setin icinde yoksa sonraki elemani return eder

        System.out.println(ts.floor('G')); //G eleman Setin icinde varsa elemanin kendisi return eder

        System.out.println(ts.floor('J'));//G  eleman Setin icinde yoksa ONCEKI  elemani return eder

        System.out.println(ts.subSet('G', 'U')); //G,R ilk parametre dahil,ikinci parametre haric

        System.out.println(ts.subSet('G', false, 'Z', true));


    }
}
