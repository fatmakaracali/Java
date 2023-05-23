package day25polymorphism;

public class Student {

    public String stdName = "Tom Hanks";
    public int age =23;


    //Encapsulation nedir?  Data saklamaktir(Data hiding)
    //Data nasil saklanir?  Access modifier'ini "private" yaparak
    //

     private String stdId = "AC2023102T";

    public String getStdId() {
        return stdId;
    }

    private double gpa= 3.87;

    private boolean successful = false;

    public boolean isSuccessful() {
        return successful; //Encapsulation yapilan variable'in data type'i "boolean ise
        //get method ismi "is" ile baslar
    }

    public double getGpa() {
        return gpa;
    }

    //Encapsulation yaptigimiz datayi istersek diger claa'lardan okuyabiliriz
    //Nasil okuruz? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabilirz
    //"get methodu" hep public olur
    //get method'un return type'i okudugu variable'in return type'i ile ayni olur
    //get method bir boolean variable icin olusturulduysa ismi "is" ile baslar

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan nasil degistirebiliriz
    //nasil degistirirlir "set method" olusturarak Encapsulate edilmis data degerini degistirebiliriz
    //"set method" hep pulic olur.
    //"set method"un "return type" hep void olur
    // set method parametre kullanir, parametrenin data type'i variable ile aynidir
    //set method kullanarak var olan object uzerinde degisiklikler yaparak o object'i sanki yeni bir objectmis gibi kullanabiliriz
    //note: get methodlarin diger adi "getter", set method'larin diger adi "setter" dir.
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


}
