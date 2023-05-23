package day28interface;


/*      Child    parent
    1) Class--> Class : extends
       interface-->interface : extends
       Class-->interface : implements
       interface-->Class'in child'i olamaz
       Ayni ise extends , farkli ise implements kullan




       abstract class ile interface arasindaki farklar nelerdir?
       1)Abstract Class'lar hem "abstract" hem de "concrete" method'lar icerebilir fakat interface'ler sadece "abstract"
       method icerir.
       Ama interface'lerde istersek "default" ve "static" keyword'larini kullanarak "concrete" method uretebiliriz
       2) Abstract Class'lar multiple inheritance'i desteklemez ama interface'ler destekler
       3) Abstract Class'lar icinde her turlu variable olusturulabilir, interface'ler icindeki variable'lara public, static ve final
       final olmak zorundadir
       4) "interface" Class'in child'i olamaz ama "Abstract class" class'in child'i olabilir
       5) abstract class'larda constructor var ama object olusturamaz, interface'lerde constructor yoktur bu yuzden object uretilemez

 */
public interface Mammal extends Animal{

    String feedBaby = "Milk";

    int age = 6;
}
