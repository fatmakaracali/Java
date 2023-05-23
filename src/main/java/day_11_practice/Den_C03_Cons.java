package day_11_practice;

public class Den_C03_Cons {

    public static void main(String[] args) {

        C03_Constructor obj1 = new C03_Constructor();

        obj1.marka="Mersedes";
        obj1.model="C180";
        obj1.yakit="benzin";
        obj1.yil= 2023;

        System.out.println(obj1.marka); //Mersedes
        System.out.println(obj1.yakit); //benzin
        System.out.println(obj1.yil);   //2023
        System.out.println(obj1.model); //C180


    }
}