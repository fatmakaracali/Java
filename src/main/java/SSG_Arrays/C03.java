package SSG_Arrays;

public class C03 {

    public static void main(String[] args) {

        //Verilen bir int array'deki en buyuk sayiyi yazdiran bir method olusturunuz

        int arr[]={90,101,42,20,37,15};
        maxYazdir(arr);

    }

    public static void maxYazdir(int[]arr){
        int maxSayi=arr [0];

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>maxSayi){

                maxSayi=arr[i];
            }

        }
        System.out.println(maxSayi);
    }

}
