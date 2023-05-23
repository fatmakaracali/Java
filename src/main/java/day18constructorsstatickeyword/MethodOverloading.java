package day18constructorsstatickeyword;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(add(3, 5));

    }
    public static int add(int a, int b){
        return a+b;

    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(double a, int b){
        return a+b;

    }
    public static double add(int a,double b){
        return a+b;

    }
    //Ayni method'u (add), farkli parametrelerle kullanmaya overloading denir.
    /*
    1) Bir method ayni isim ve farkli parametrelerle olusturulursa buna "Method Overloading" denir
    2) "Method Overloading" Java'da iyi organizasyon icin onemlidir
    3)Method Overloading yapilirken parametre 3 sekilde degistirilebilir
    i)Parametrelerin sayilari degistirilebilir
    ii)Parametrelerin data type'lerini degistirebiliriz
    iii)Parametrelerin data type'leri farkli ise yerleri degistirilebilir
    4)"Method Overloading" bir class'in icinde olusur ve bu yuzden "privite" method'lar da overload edilebilir
    (mulakat sorusu:privite da olur.cunku cunku bir class'in icinde olusturulur
    "Method Overloading" butun access modifier'larda kullanilabilir
    5)"Static" methodlar "overload" edilebilir

     */


}
