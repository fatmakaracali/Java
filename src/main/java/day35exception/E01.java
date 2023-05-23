package day35exception;

public class E01 {
    public static void main(String[] args) {


        //Bir String'i Integer'a ceviren method olusturunuz
        System.out.println(convertStringToInt("123") + 2);
        System.out.println(convertStringToInt("12ab") + 2); //.NumberFormatException

    }

    public static int convertStringToInt(String str) {

        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {//NumberFormatException valueOf() methodu non digit character iceren bir string ile kullanildiginda
            // atilir

            System.out.println("Do not use non-digit characters");

            str.replaceAll("[^0-9]","");
            return Integer.valueOf(str);
        }

        }


    }
