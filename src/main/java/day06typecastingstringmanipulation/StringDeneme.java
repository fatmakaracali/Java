package day06typecastingstringmanipulation;

public class StringDeneme {
    public static void main(String[] args) {


        String str1 = "ali";
        String str2 = "Ali";
        System.out.println(str1.equalsIgnoreCase(str2));
        // Ekrana true yazdırır
        System.out.println(str1 == str1);
        //Ekrana true yazdırır
        System.out.println(str1.equals(str2));
        //  Ekrana false yazdırır
        System.out.println((str1 + str2).equals(str2 + str1));
        // Ekrana false yazdırır

        String str = "Java Kolaydir";

        System.out.println(str.endsWith("r"));
       // Ekranan true yazdırır
         System.out.println(str.endsWith("dir"));
       // Ekranan true yazdırır
         System.out.println(str.endsWith(""));
        // Ekranan true yazdırır
        System.out.println(str.endsWith("Java Kolaydir"));
        // Ekranan true yazdırır



}}