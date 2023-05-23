package day02printmethodcreation;

public class MethodCreation {

    public static void main(String[] args) {

        // static: protokol tribunu ya da vip class

        // karenin alanini veren kodu yazini

        kareninAlani(7);

        System.out.println("dikdortgenAlani:"+(dikdortgenAlani(10,20)+2));
    }

    private static void kareninAlani(int a) {
        System.out.println("Karenin Alani :" + (a*a));


        // dikdortgenin alanini veren kodu yaziniz


    }
    private static int dikdortgenAlani(int a, int b) {return a*b; // carpmanin sonucunu kullaniciya verdim



    }
}
