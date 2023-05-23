package introduction;

import java.util.Scanner;
// javanin util kutuphanesinden class import edildi demektir.
public class Scanner01 {

    public static void main(String[] args) {
        // 1. adim Scanner class tan bir obje olustur.
        Scanner input = new Scanner(System.in);

        // obje ismini input yaptik. cunku bu obje kullanicidan alinan datayi benim kodlarimin icine koyacak

        // 2. adim Kullaniciya ne istediginize dair mesaj ver.
        System.out.println("Lutfen yasinizi girin...");
        //3.adim Uygun methodu kullanarak  kullanicinin verdigi datayi memory e yerlestiriniz
      byte age =  input.nextByte();
        System.out.println(age);


    }
}
