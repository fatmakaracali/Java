package introduction;

import java.util.Scanner;

public class Scanner02 {

    // Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda yazdiriniz.

    public static void main(String[] args) {

        // 1.adim obje olustur.

        Scanner input = new Scanner(System.in);

        //2. adim Kullaniciya ne istedigine dair mesaj ver

       String firstName= input.next();
        System.out.println("ilk isminizi girin");
      String lastName = input.next();
        System.out.println("soy isminizi girin");

        System.out.println(firstName + lastName);
    }


}
