package day34exceptions;

public class E02 {
    public static void main(String[] args) {

        //Bir String array'dan istenilen bir elemani ,elemani sirasi ile alan method olusturunuz

        String a[] = {"A", "V", "A", "J"};

        System.out.println(getElement(a, 3)); //A
        System.out.println(getElement(a, 1)); //A
        System.out.println(getElement(a, 4)); //J
        System.out.println(getElement(a, 2));  //V

        System.out.println(getElement(a, 6)); //ArrayIndexOutOfBoundsException. Arraylarda olmayan index icin kullanilir
        System.out.println(getElement(a, -3));



    }

    //Bir String array'den istenilen bir elemani eleman sirasi ile alan method olusturunuz
    public static String getElement(String[] a, int numOfElement){

        String result = "";

        try{
            result = a[numOfElement-1];
        }catch(ArrayIndexOutOfBoundsException e){ //Array islemlerinde olmayan index kullanildiginda atilir
            if(numOfElement-1<0){
                result = a[0];
            }else{
                result = a[a.length-1];
            }
        }
        return result;
    }
    }

