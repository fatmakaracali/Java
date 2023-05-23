package day26abstraction;

public abstract class Courses {

    //Body'si olmayan method'a abstract(vucutsuz-soyut) method denir
    //Bazen parent class'taki method'un body'si hicbir child class tarafindan kullanilmaz
    //Bu durumda parent'taki method'a body yazmak hic kullanilmadigi icin mantikli degildir.
    //biz de o method'a body yazmayiz
    //Body'si yazilmayan method'a abstract method denir. Abstract ing'de vucutsuz veya soyut anlamindadir
    //Method'un body'sini yazmayinca java hata verir. biz de abstract keyword'unu kullanarak
    //java'ya bu method'un body'si olmayacak deriz
    // abstract keyword'unu kullaninca elde ettigimiz abstrac method normal class'lara konulamaz,
    //o yuzden class'i da "abstract" yapariz
    //Parent'taki method abstrac ise butun child class'lar o method'u override etmek zorundadir
    // bu yuzden tum child'lar icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir
    //body'si olan method'lar(Concrete Method) abstrac class'in icine yazilabilir
    // abstract method'lar  concrete class'larin icine yazilamaz
    // Abstrac keyword ile method body bir method'da ayni anda kullanilamaz
    //Abstrac class'larin icinde abstrac class'lar olur,"Abstrac method"lar body'si olmadigindan
    //eksik method'lar gibi dusunulebilr.Yani abstract class icindeki eksiklikler object'e yansir ve
    //object eksigi olan bir object olmus olur
    //Java bunu istemez cunku eksik object eksik is yapar, bu da application'in yanlis calismasina
    //sebep olur
    //Java applicationu korumak icin "abstract class'lardan object uretilmesini engellemistir
    //Abstrac class'lardan obje olusturamayiz
    //Abstract class'larin costructor'i vardir ama object olusturamazlar
    //"final method" lar
    //privite method'lar constructor olamaz
    //"private" method;lar "abstract" olamazlar
    //"abstract class'in abstract child'i veya concrete child'i olabilir

    /* "final" keyword'u aciklar misin?
        final keyword 1) variable'larda 2) method'larda 3) class'larda kullanilabilir
        1)variable'larda kullanildiginda a) o variable'a kesinlikle deger atamasi yapilmalidir
                                         b) ilk atanan deger degistirilemez
        2) method'larda kullanildiginda  a) o method'un body'si degistirilemez
                                         b) o method override edilemez
        3) class'larda kullanildiginda   a) o class'in child class'i olamaz ama final class'in kendisi child olabilir

     */

    public abstract void math();

    public void art(){
        System.out.println();
    }




}
