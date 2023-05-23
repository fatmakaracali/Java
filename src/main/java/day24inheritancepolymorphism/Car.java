package day24inheritancepolymorphism;

/*
   1) Inheritance'da object olustururken constructor'lar yukaridan (parent) asagiya(child) dogru calisir
   2) Parent ve Super es anlamlidir. Child ve Sub es anlamlidir
   3) Super() her constructor'in ilk satirinda gorunmez olarak bulunur
   isterseniz gorunur sekilde yazabilirsiniz
   4) Super() sizi parent class'daki constructor'a tasir
   5) this() sizi ayni class icindeki constructorlar arasinda gezdirir.
   6)"this" , icinde bulundugunuz class'daki variable'lari cagirmaya yarar.
     " super" , parent class'daki variable'lari cagirmaya yarar


     Eger data type'lari arasinda IS-A ve HAS-A iliskisi varsa bu data type.larina "COVARIANT" denir*/

     /* 1)Polymorphism ==> Coklu sekil
     Yani bir method'un farkli sekillerde karsimiza cikmasi demektir
     Polymorphism = Overloading + Overriding
        2) Overriding, parent class'taki method'u child class'in ihtiyaclarina gore kullanmaktir
        3) Overriding'de method'un body'si degistirilir
        4)Overriding'de  "method signature"a  move() dokunulmaz. Dukunursaniz Java kizar

 */

public class Car {

    public void move() {

        System.out.println("Cars move...");
    }

    public void getBreak() {
        System.out.println("Cars move...");

    }
    public void engine() {
        System.out.println("Cars have engine...");


    }
    public String model = "Car";
    public int price =0;

    public Car(){
        System.out.println("Car constructor 1");
    }

    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }
}