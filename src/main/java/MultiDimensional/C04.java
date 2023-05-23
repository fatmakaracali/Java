package MultiDimensional;

import java.util.Arrays;

public class C04 {

    public static void main(String[] args) {

        /*
        Asagidaki multidimensional array'in ic array'lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array'in elemani yapan ve yeni arra'i ekrana yazdiran bir program yaziniz
         */

        int sayilar[][]={{1,2,3},{4,56,7}};

        int yeniArray[] = new int[sayilar.length];

        int sum=0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int s = 0; s < sayilar[i].length; s++) {

                sum+=sayilar[i][s];
                
            }
            yeniArray[i]=sum;
            sum=0;
            
        }
        System.out.println(Arrays.toString(yeniArray));
    }


}
