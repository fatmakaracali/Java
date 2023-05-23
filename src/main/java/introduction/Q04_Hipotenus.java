package introduction;

public class Q04_Hipotenus {


    public static void main(String[] args) {

        System.out.println(hipotenusHesapla(7, 8));

    }

    public static double hipotenusHesapla(double dikKenar1, double dikKenar2) {

        return Math.sqrt(dikKenar1 * dikKenar1 + dikKenar2 * dikKenar2);
    }
}