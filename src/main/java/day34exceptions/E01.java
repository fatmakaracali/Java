package day34exceptions;

public class E01 {


    /*
    1)exception beklenmedik problem demektir
    2)exception'lari halledebilmek icin iki temel yol vardir
       i) "Exception"a uygun cozumler uretebilriz.Buna "Exception Handling"denir
       ii) "Exception" olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da "Throw Exception" denir
    3) "Exception"a uygun cozumler uretmede "try-catch" kullanilir
        "try block" da yapilmasi gereken islemi Java'dan yapmasi istenir
        Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz
        "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki kodlar calisir
    4) "try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz

     */
    public static void main(String[] args) {

        System.out.println(divide1(12, 3));  //4
        System.out.println(divide2(6, 0)); //Exception in thread "main" java.lang.ArithmeticException: / by zero


        System.out.println(divide2(12, 3));  //4
        System.out.println(divide2(6, 0));

    }

    //1.way : Exception'i handle etmede ilk yol
    public static int divide1(int a, int b) {

        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

   //2.way Exception'i handle etmede harika yol
    public static int divide2(int a, int b) {
       int result =0;

       try{
           result=a/b;
           System.out.println("I am here"); //12/3= 4   i am here ve 4 yazdirir

       }catch(ArithmeticException e){  //6/0 yazarsak try ici yazilmaz, catch kismi calisir
           System.out.println("There is an issue in division");
       }
       return result;

    }
    //toplama-cikarma-carpma islemlerinde try-catch yapmaya gerek yoktur.
    //ArithmeticException matematik ile ilgili herhangi bir kural ihlali yapildiginda atilir
}