package day03methodcreationscanner;

public class C02_MethodCreation {

    public static void main(String[] args) {

        // dikdortgenin alanini hesaplatan bir method olusturunuz.

        dikdortgenAlani(10, 20);

        // Karenin alanini hesaplatan methodu yaziniz

        kareAlani(4);

        System.out.println( kareAlani(4)+2);
    }

    private static int kareAlani(int a) {return (a*a);
    }

    private static void dikdortgenAlani(int a, int b) {
        System.out.println(a * b);



}
    }