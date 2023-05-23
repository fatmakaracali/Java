package day04memorykullanimiwrapperclass;

//import java.util.Scanner;

public class Araba {


    public String model ="v60";
    public String renk = "Beyaz";
    public int fiyat = 1500000;


    public static void main(String[] args) {

        //Class : Variable( pasif ozellikler, methodlar(aktif ozellikler)
        // Class ismi  Objenin ismi  = new   Class ismi();
      //  Scanner           input =      new    Scanner(System.in);
        Araba volvo = new Araba();

        hareket();
        dur();
        yakit();
        System.out.println(volvo.fiyat);
        System.out.println(volvo.renk);
        System.out.println(volvo.model);

    }

     static void yakit() {
    }


    private static void dur() {
        System.out.println("Volvo guvenle durur.");
    }

    private static void hareket() {      //aktif ozellikler
        System.out.println("Volvo hizli gider");
    }
}




