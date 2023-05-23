package day25polymorphism;

public class Animal {

    /*1) Parent'taki method ile Child 'da Override edilen method'un access modifier'i ayni olabilir
      2) Child 'da Override edilen method'un access modifier'i Parent'taki method'un access modifier'indan  dar olamaz
      3)Parent'taki method'un access modifier'i Child'da Override edilen method'un access modifier'indan dar olabilir
      4) Method'un return type'i "primitive" ise  Overriding yapildiginda return type degistirilemez.
      5) Method'un return type'i "void" ise Overriding  yapildiginda return type degistirilemez
      6)Child 'da Override edilen method'un "return type"i ile Parent'taki method'un "return type" arasinda IS-A iliskisi varsa
       "return type" degistirilebilir. aksi takdirde degistirilemez
      mesela: Integer wrapper Class ile Long Wrapper Class arasinda IS-A iliskisi  yoktur.Oyuzden return type
        Integer oldugunda     Longa degistirilemez
      7) return type Wrapper Class oldugunda ,Overriding yaparken "return type" degistirilemez
      8) Final method'lar Override edilemez
         Final method'larin body'si degistirilemez ama Override ederken method body'i degistiririz.
           bu celiskidir. Bu yuzden java, final method'larin Override edilmesine izin vermez

         a)  Final keyword'unu variable'lar ile kullanabiliriz
            i)final variable ise mutlaka deger atanmalidir
            ii)ilk atanan deger degistirilemez

          b) Final keyword unu Methodlar ile kullanabiliriz
          i) method final ise methodun body'si degistirilemez
          ii) methodun body si degistirilmeyince override yapmak mumkun olmaz

          c)Final keyword'unu Class'lar ile kullanabiliriz
          ==>class final ise o classin child'i olmaz

      9) Static method'lar Override edilemez.Cunku static method'lar tum childlar icin ortak method'dur.
         Bir child ortak method'u degistirdiginde diger Child'lar bundan etkilenir. Bu etkilenme ummadik sonuclar ortaya cikarabilir
         bu yuzden Java "static method"larin Override edilmesine musaade etmez
      10) "private method'lar  Override edilemez
       11)Child'daki override edilmis eat() methoduna "Overriding method" denir
          Parent'taki override edilmis eat() methoduna "Overriden method" denir                                 */
    public void move() {

        System.out.println("Animals move...");}

        public void run(){
            System.out.println("Animals run");
        }


    public int add(int a, int b) {
        return a + b;
    }

    public Animal create() {return new Animal();}

    public Integer multiply(Integer a, Integer b){
        return a*b;
    }

    public final double circleArea(double r){ return 3.14*r*r;}






}

