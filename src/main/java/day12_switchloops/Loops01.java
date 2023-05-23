package day12_switchloops;

public class Loops01 {

    public static void main(String[] args) {

        /*kod yazarken
                        i)tekrarli kod yazmamaya dikkat ediniz

                       ii) yazdiginiz code'un gerektiginde tamir edilebilir olmasina
                       iii)yazdiginiz code'un gelistirilebilirmesinin kolay olmasina
                       iiii) yazdiginiz code'un farkli senaryolar icin calisabilmesine dikkat ediniz
         */


        // for-loop
        //1) for-loop  2) while-loop     3) do-while-loop       4) for- each-loop
        // ekrana 5 kere "Hi" yazdiriniz

        for ( int a=1; a<6; a++ ) {
            System.out.println("Hi");
        }

        for (int i = 11; i < 15; i++) {
            System.out.println(i);
        }
        // 40'tan 22'ye kadar tum cift sayilari yazdiriniz

        for( int x=40; x>21 ; x--){ if(x%2==0)
            System.out.print(x+ " ");
        }

        System.out.println();

        // 18'den 56'ya kadar tum tek sayilari ekrana yazdir

        for( int y=18   ;  y<57  ; y++ ){ if(y%2 != 0)
            System.out.print(y+" "); }

        System.out.println();

        // 4'ten 24'e kadar ayni satirda aralarinda bosluk birakarak console'e yazdiriniz

        for(  int i = 4; i<25;  i++){
            System.out.print(i +" ");}

            System.out.println();

        //Massachusetts kelimesindeki tum sesli harfleri konsole'a yazdiriniz

            String s= "Massachusetts";

            for (int i =0 ; i<s.length(); i++){
                char c = s.charAt(i);
                if(c=='a' || c=='e' || c=='u' || c=='i' || c=='A' ||  c=='E' || c=='U' || c=='O' || c=='I'){
                System.out.println(c + " ");}


            }




}
}