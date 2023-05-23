package SSG_StaticKeyword;

public class C01_static {

    static int sayi = 54;
    int rakam= 3;

    public static void main(String[] args) {

        System.out.println(sayi);

        C01_static obj1 = new C01_static();
        System.out.println(obj1.rakam);
        System.out.println(obj1.sayi);

        obj1.rakam =7;
        obj1.sayi= 6;

        C01_static obj2=new C01_static();
        System.out.println(obj2.rakam);//3
        System.out.println(obj1.rakam);//7
        System.out.println(obj2.sayi);//6
        System.out.println(obj1.sayi);//6
    }
}
