package day_03_practice;

public class C04_SwitchCase {

    public static void main(String[] args) {

           /*

Bir restoranda, müşteriler menüden yemeklerini seçerler.
Restoran, müşterilerin seçtiği yemeği pişirmek için bir
program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
belirlendigi bir program yaziniz

*/

        String meal= "hamburger";

        switch (meal){
            case "hamburger" :
                System.out.println("Hamburger menusu 20euroa");
                break;
            case"pizza"    :
                System.out.println("pizza menu 25 euroa");
                break;
            case "tavuk"    :
                System.out.println("tavuk menu 30 euroa");
                break;
            default:
                System.out.println("Bu menu mevcut degil");
        }

        /*Bir arac kiralama sitesinde secilen araba markasina gore degisen kiralama ucretine gore toplam ödenecek
        fiyati gosteren kodu yaziniz
        SUV=500.0
        SEDAN=400.0
        HATCBACK=350.0
        GERIYE KALANLAR=300.0
        double toplamUcret= kiralamaUcreti+kiralanacakGunSayisi

         */


        String car= "SEDAN";
        int kiraGunSayisi=5;
        double kiraUcreti;

        switch (car) {
            case "SEDAN":
                kiraUcreti = 400.0;
                break;
            case "SUV":
                kiraUcreti = 500.0;
                break;
            case "HATCBACK":
                kiraUcreti = 350.0;
                break;
            default:
                kiraUcreti = 300.0;


        }
        double toplamUcret =kiraUcreti + kiraGunSayisi;
        System.out.println("toplamUcret:"+toplamUcret);


        /*
     Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
     Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
     gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
     istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
     onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
      kontrol eden bir program yaziniz(elephant,lion,giraffe
      default == belirtilen hayvan bulunamadi */


        String animal="lion";

        switch (animal){
            case "elephant":
                System.out.println("Fil beslendi");
                break;
            case"lion"    :
                System.out.println("Aslan beslendi.");
                break;
            case "giraffe"  :
                System.out.println("Zurafa beslendi.");
                break;
            default:


        System.out.println("belirtilen hayvan bulunamadi");}







    }
}
