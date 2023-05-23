package ReplitDeneme;



public class TestArrays9 {

    public static void main(String[] args) {

        /*
        Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
Array: [1,2,3,4,5,6,7,8,9]
```Tek Sayilar: 5
```Cift Sayilar: 4
         */
        int [] a={1,2,3,4,5,6,7,8,9};

        int cift =0;
        int tek=0;

        for (int w: a){
            if(w%2==0){
                cift++;

            }else{
                tek++;
            }


        }
        System.out.println(cift);
        System.out.println(tek);

    }
}
