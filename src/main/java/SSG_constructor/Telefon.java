package SSG_constructor;

public class Telefon {

    /*
soru 2)telefon adli bir constructer olusturun ve
olusturdugunuz constructer'a marka model ve fiyat parametreleri ekleyin
ve main classi olusturup o class icinden cagirip birkac tane telefon ekleyin
 */
    public Telefon(String marka,String model,int fiyat){
        System.out.println("Telefonun markasi : "+marka);
        System.out.println("Telefonun modeli : "+model);
        System.out.println("Telefonun fiyati : "+fiyat+"$");
        System.out.println();
    }
    public Telefon(String marka, String model) {
        System.out.println("Telefonun markasi : "+marka);
        System.out.println("Telefonun modeli : "+model);
        System.out.println();
    }
    public Telefon(String marka) {
        System.out.println("Telefonun markasi : "+marka);
    }
}
