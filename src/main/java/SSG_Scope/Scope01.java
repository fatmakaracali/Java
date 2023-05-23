package SSG_Scope;

public class Scope01 {

    //instance variable
    //static variable
    //local variable

    int x = 8;

    static String isim = "Ali";

    static int y =15;


    public static void main(String[] args) {

        Scope01 obj = new Scope01();
        System.out.println(obj.x);

        System.out.println(isim);

        obj.yazdir();

        int y = 2;           //local variable
        System.out.println(y);
    }
    public void yazdir(){

        System.out.println(isim);  //static variable'i her yerden cagirabiliriz
        System.out.println(x);

        int y=15;
        System.out.println(y);

    }
}
