package day17multidimensionalarraypassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {


        /*
        Method olusturmak icin asagidaki 5 adimi takip ediniz
        1)Access Modifier
        2)Return type
        3)Method ismi
        4)Method parantez
        5){} parantezleri method body'si icin
         */

        //main method'un icindeki tum method'lar static olmalidir. Bir method'u static yapmak icin
        //access modifier ile return type arasina static eklenir


        //Pass by Value:
        //java kullanir.Yani java methodlarin orijinal degeri degistirmesine musaade etmez
        //Java methodlara deger yollarken orijinal degerin kopyasini olusturur ve o kopyayi method'a yollar
        // method kopya deger uzerinde degisiklik yapar.boylece orijinal deger korunmus olur
        //java esnek bir dildir.Istersek yazdigimiz kod ile orijinal degerin degismesini de temin edebiliriz bakiniz line 29


        //Pass by reference :
        //pass by reference da method'a reference yollanir
        //Reference adres demektir.Adres yollaninca method adresi kullanilarak orijinal degere ulasir ve orijinal degeri degistirir
        //bu yuzden "C#" gibi pass by reference kullanan dillerde method variable'in orijinal degerini degistirir



        int shirtPrice = 200;
        System.out.println("discount(\"student\",shirtPrice) = " + discount("student" ,shirtPrice));
        System.out.println("shirtPrice = " + shirtPrice);

        shirtPrice= discount("veteran", shirtPrice);
        System.out.println(shirtPrice);


    }

    //discount Method'u olusturunuz
    public static int discount(String type,int price){

        switch (type){

            case "student":
                price = price-20;
                break;

            case "veteran" :
                price =price-40;
                break;
            case "senior" :
                price=price-30;
                break;
            default :
                price =price;

        }
        return price;

    }
}
