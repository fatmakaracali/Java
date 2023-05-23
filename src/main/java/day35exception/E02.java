package day35exception;

public class E02 {
    public static void main(String[] args) {

        // Bir String deki karakteri index kullanarak alan bir method olusturunuz

        System.out.println(getCharFromString("Java", 2)); //v

        System.out.println(getCharFromString("Java", 8)); //.StringIndexOutOfBoundsException String'lerde
        //olmayan index kullanildiginda atilir
    }

    public static char getCharFromString(String str, int idx) {

        try {
            return str.charAt(idx);

        } catch (StringIndexOutOfBoundsException e) {

            idx=Math.abs(idx);

              idx = idx % str.length();

            return str.charAt(idx);
        }
    }
}