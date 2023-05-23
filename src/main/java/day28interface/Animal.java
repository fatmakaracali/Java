package day28interface;

public interface Animal {

    void eat(); // bu method yazmasa da abstract ve publictir

    void drink();
    //1) interface'lerdeki tum variable'lar otomatik olarak final'dir. bu yuzden interface icindeki
    //variable'i olusturdugunuzda mutlaka deger atamalisiniz
    //bilindigi gibi final variale'larin degerleri degistirilemez

    //2) interface 'deki tum variable'lar otomatik(default) olarak public'tir
    //nterface 'deki tum variable'lar otomatik(default) olarak static'tir
    int age =4 ;
}
