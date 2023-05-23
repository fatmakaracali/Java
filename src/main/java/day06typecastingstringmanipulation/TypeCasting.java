package day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {

        //****************Explicint Narrowing***********
        // Explicit Narrowing yaparken dikkat edilmeli
        // cunku cok ciddi Data kaybi hatta datatin degismesine neden olur
        // Eger donusturmeye calistigimiz variablein sinirlari disinda ise Java sayiyi mod icine alir ve kalani yazdirir
        // kalan bolenin yaridan fazlaysa kalan sayiyi Java kucultmek ister ve bolumu 1 buyuterek kalani - isa
        //retli olacak sekilde yazdirir

        // short data type'inda bir variable olusturup byte data type'ina ceviren kodu yaziniz

        short num = 260;
        byte numByte = (byte) num;
        System.out.println("numByte = " + numByte);  // 4   260/256 = 4 yazdirir

        short num2 = 1023;
        byte  numByte2 = (byte) num2;
        System.out.println("numByte2 = " + numByte2);  //-1

        short num3= 1000;
        byte numByte3 =(byte) num3;
        System.out.println("numByte3 = " + numByte3);   //-24

        int intSayi= 8880;
        short shortSayi = (short) intSayi;               // -32768 + 32768 + 0 short araligi
        System.out.println("shortSayi = " + shortSayi);  //8880

    }
}
