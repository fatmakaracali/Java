package ReplitDeneme;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.print("Lutfen isminizi giriniz : ");
            String firstName = input.nextLine().toUpperCase();

            System.out.print("Lutfen soyisminizi giriniz : ");
            String lastName = input.next().toUpperCase();

            System.out.println("Lutfen sifrenizi giriniz : ");
            // int ccn = input.nextInt();
            String ccn = input.next(); // sifreler genellikle karakter dizisi veri tipinde tutulur.



            System.out.println("Name: " +firstName.charAt(0) +"***"+ " "+firstName.split(" " )[1].charAt(0)+"***");
        System.out.println("Lastname : "+ lastName.charAt(0)+ "*****");

            System.out.println("CCN : **** **** **** "+ (ccn.substring(ccn.length()-4) ));
    }
}
