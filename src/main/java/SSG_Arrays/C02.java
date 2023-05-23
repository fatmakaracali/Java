package SSG_Arrays;

import java.util.Arrays;

public class C02 {

    public static void main(String[] args) {

        //verilen array in tum elemanlarini bir soldaki konuma tasiyacak bir program yaziniz
        //ornek array(1,2,3)  ==> array(2,3,2)


        int numbers[]={5,4,3,2,1};

        int temp=numbers[0];

        for (int i = 0; i < numbers.length-1; i++) {

            numbers[i]= numbers[i+1];
            System.out.println(Arrays.toString(numbers));

        }
        numbers[numbers.length-1]=temp;
        System.out.println(Arrays.toString(numbers));
    }


}
