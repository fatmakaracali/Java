package day19arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist01 {

    /*
    1) Ayni data type'indaki coklu data'lari depolamak icin Array kullaniriz
    2)Array'in bir negatif yonu vardir. Icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz
    3)Array'ler eleman sayisinda esnek degildir. bu yuzden java Arraylist adli bir yapi olusturdu. bu yapi
    eleman sayisinda esnektir. hic eleman koymazsaniz, eleman sayisini sifir olarak ayarlar. 1000 eleman koyarsaniz
    eleman sayisini 1000 koyar
    4) Arraylist yerine sadece "List" de diyebiliriz
    5)Java, "ArrayList" leri olusturduktan sonra, Array'leri iptal etmez.
       i)cunku Array'ler super hizlidir
       ii) Array'ler memory'de cook az yer kaplar
    6) Array'ler primitive data type'lari ve reference'lari depolayabilir ama Arraylist'ler non-primitive data
    type'larini depolar. bu yuzden Arraylistler, Array'lerden daha cok yer kaplar.
     */

    public static void main(String[] args) {
        //ArrayList nasil olusturulur

        ArrayList<Integer> ages = new ArrayList<>();

        //ArrayList console'a nasil yazdirilir?
        System.out.println(ages); //[]

        //ArrayList'e eleman nasil eklenir?
        //1.yol
        ages.add(12);
        ages.add(24);
        ages.add(9); //add methodu elemanlari "giris sirasina"(insertion order) gore List'e yerlestirir
        System.out.println(ages); //[12,24]   [12, 24, 9]

        //2.yol
        ages.add(1,99);
        System.out.println(ages);
        // add() methodu verdiginiz degeri sizin verdiginiz siraya gore yerlestirir
      //  ages.add(888); // en sona ekler


        ArrayList<Integer>price = new ArrayList<>();
        price.add(23);
        price.add(33);

        //3.yol addAll() methodu bir list'i, diger list'in icine koyar
        ages.addAll(price);
        System.out.println(ages); //[12, 99, 24, 9, 23, 33]

        //4.yol
        ages.addAll(3,price);
        System.out.println(ages); //[12, 99, 24, 23, 33, 9, 23, 33]

        //ArrayList'te eleman sayisi nasil bulunur?

       int numOfElement = ages.size();  //size() bir listteki eleman sayisini verir
        System.out.println(numOfElement);

        //ArrayList'te specifik bir eleman nasil alinir?

        int el1= ages.get(3); //get methodu index kullanarak istedigimiz elemani almaya yarar.
        System.out.println(el1);

        //
         ages.set(6,111);
        System.out.println(ages);   //[12, 99, 24, 23, 33, 9, 111, 33]

        //
         boolean r1=ages.contains(99);
        System.out.println(r1);     //true

        //Bir ArrayList'in bos olup olmadigini nasil kontrol ederiz. Arraylist bos ise true, bos degilse false dondurur
         boolean r2= ages.isEmpty(); //false
        System.out.println(r2);

        ///Bir ArrayList'teki tum elemanlari nasil sileriz?

        ages.clear();
        System.out.println(ages); //  []

        //Example 1: Bir List'in bos olup olmadigini kontrol eden kodu yazini<
        ArrayList<String> names =new ArrayList<>();

        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");

        //1.yol
        if(names.size()==0){
            System.out.println("List bostur");
        }else {
            System.out.println("List'te en az bir eleman vardir");
        }

        //2.yol   tavsiye edilir ==Recomended
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");
        }

        //Verilen iki Integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz
        ArrayList<Integer>num1 = new ArrayList<>();
        num1.add(8);
        num1.add(10);
        num1.add(9);

        ArrayList<Integer>num2= new ArrayList<>();
        num2.add(8);
        num2.add(9);
        num2.add(10);

        Collections.sort(num1);
        Collections.sort(num2);

        System.out.println(num1.equals(num2));  //true










        }
}
