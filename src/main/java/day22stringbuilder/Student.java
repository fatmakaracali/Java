package day22stringbuilder;

public class Student {

    // stdName "public" oldugu icin diger class'lardan ulasilabilir
    public String stdName ="Ali Can";

    int age =23;
    //Access modifier'i "default" olan ile public olan class member'lar
    //ayni package icinde kullanildiklarinda ayni ozellikleri gosterir
    //Fakat farkli package'a gectiginizde, "public" olanlara ulasilir, "default olanlara ulasilmaz


    private String healthCondition = "Cancer";
    //Access Modifier'i "default" olan Class Member'lar sadece olusturulduklari class icinden gorulebilir
    //olusturulduklari class'in disina ciktiginizda gorunmez, ulasilmaz olurlar
    // Access Modifier'i "protect" olan Class Member'lar ayni package icinde iken
    //public gibi davranirlar
    // farkli package'e gectiginizde , "protected" olanlar sadece child class'lardan gorulebilir
    // Class'lar, public ve default olabilir
    protected int salary = 3000;




}
