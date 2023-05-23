package day18constructorsstatickeyword;

public class StaticNonStaticBloccks2 {

    public StaticNonStaticBloccks2() {

        System.out.println("Constructor 1");
    }

    public StaticNonStaticBloccks2(int price) {

        System.out.println("Constructor 2");

    }

    public StaticNonStaticBloccks2(String name) {

        System.out.println("Constructor 3");

    }

    public StaticNonStaticBloccks2(boolean isOld) {

        System.out.println("Constructor 4");
    }

    {
        System.out.println("I am constructor");
    }

    public static void main(String[] args) {

        StaticNonStaticBloccks2 obj1=new StaticNonStaticBloccks2();
        StaticNonStaticBloccks2 obj2=new StaticNonStaticBloccks2(12);
        StaticNonStaticBloccks2 obj3=new StaticNonStaticBloccks2("Shirt");
        StaticNonStaticBloccks2 obj4=new StaticNonStaticBloccks2(false);
    }

    /*
    non-static block ,constructor'larda calistirilmasi gereken ortak kodlari icerir
    non-static block icine yazilan kod'lar her constructor icin calisir
    bir'den fazla non-static block varsa ustteki önce calisir

     */
}
