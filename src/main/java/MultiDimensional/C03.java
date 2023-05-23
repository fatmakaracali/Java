package MultiDimensional;

import java.util.Arrays;

public class C03 {

    public static void main(String[] args) {

        /*
        verilen 2 katli bir multi-dimensional array'da outer index'i ve inner index'i ayni olan
        sayilarin toplamini bulunuz

         */

        int arr[][] = {{1,2,3},{4,5,6,10},{7,8,9,123,456}};

       int sum =0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if(i==j){
                    sum +=arr[i][j];
                }else System.out.println(arr[i][j]);

                
            }
            System.out.println("_______");
            
        }
        System.out.println(sum);
    }
}
