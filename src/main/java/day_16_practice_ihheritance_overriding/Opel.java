package day_16_practice_ihheritance_overriding;

public class Opel extends Araba{

    protected String hiz="Opel arabalar max 220 km hiz yapar";
    protected String marka ="Opel";
    protected String sirketMerkezi="Almanya";

    protected void motor(){
        System.out.println("Opel arabalar, opel marka motor kullanir");
    }

    protected void garanti(){
        System.out.println("Opel arabalar 2 yil garantilidir");
    }
}
