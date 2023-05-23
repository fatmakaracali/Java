package SSG_Arrays;

public class C04 {

    //7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
    // true veya false sonucu donen bir method olusturun.

    public static void main(String[] args) {
        String isimler[] = {"veli", "ali", "furkan", "hasan", "huseyin"};
        contains(isimler,"hasan");


    }

    public static void contains( String[] a, String b){
        String temp =b;
        int counter= 0;

        for (String w: a) {

            if (w.equalsIgnoreCase(b)) {
                counter++;

            }
        }
        if(counter>0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}