package day_12_practice;

public class C01 {

    String isim = "Hasim";

    int yas= 20;

    public C01(String isim, int yas) {

        this.isim=isim;
        this.yas=yas;
    }

    public C01() {

    }

    public static void main(String[] args) {

        C01 obbj1= new C01("Nuri",25);

        System.out.println(obbj1.isim+ " , "+ obbj1.yas);

        C01 obj2= new C01();

        System.out.println(obj2.isim+ " , "+ obj2.yas);

        //Her class'da default constructor vardir.
        // fakat biz bulundugumuz class'da kendimiz bir constructor olusturursak, bu durumda default constructor silinir
        //instance variable'lar objeye baglidir

    }

}
