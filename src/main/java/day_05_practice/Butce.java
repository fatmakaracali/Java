package day_05_practice;

public class Butce {

    //Tum aile uyelerinin birikiminin bulundugu ortak ihtiyaclar icin kullanildigi bir butce ile kisisel harcamalarin
    // yapildigi harcliklarin oldugu basit bir ev butcesi kodu yaziniz


    public static int butce;

    public int harclik;

    public void maasAl(int alinanMaas) {
        butce += alinanMaas;
    }

     public void harclikAl(int alinanHarclik) {
        butce-= alinanHarclik;
        harclik+=alinanHarclik;
     }
     public void butcedenHarca(int harcanacakPara){
        butce-=harcanacakPara;
     }
     public void harcliktanHarca(int harclikHarcamasi){
        harclik-=harclikHarcamasi;
     }

}
