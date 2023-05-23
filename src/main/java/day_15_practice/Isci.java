package day_15_practice;

public class Isci extends Muhasebe{

    /*
    Bu class'dan da obje olusturabiliriz. Bu class'in child class'larinin olmasi obje olusturmaya engel degil.
    fakat isciler icin , surekli isci ve ustabasi olmaktan baska ihtimal olmadigi icin isci class'inda isci
    uretmeye gerek yok
     */

    protected String isciStatu= "Surekli Isci";

    protected void mesai(){
        System.out.println("Isciler gunde 8 saat, haftada 5 gun calisir");
    }

}
