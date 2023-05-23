package introduction;

public class Tekrar1 {

    public static void main(String[] args) {

        int sonuc = islemYap (2,3,5);
        System.out.println(sonuc);

        double sonucc = kupHesapla(8);
        System.out.println(sonucc);
    }

    public static int islemYap(int a, int b, int c){return a*b+c;}

    public static double kupHesapla(double a){return a*a*a;}
}
