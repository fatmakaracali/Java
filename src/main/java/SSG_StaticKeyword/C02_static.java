package SSG_StaticKeyword;

public class C02_static {

    //soru2)assagidaki classlar calistirildiginda ne olur inceleyelim
    int x;
    static int y;

    C02_static(int i) {
        x += i;
        y += i;
    }

    public static void main(String[] args) {
        new C02_static(2);
        //x=5; x'i obje olmadan degistiremedigimiz icin degismemis oldu
        C02_static dnm = new C02_static(3);
        System.out.println(dnm.x + "," + dnm.y);

    }
}