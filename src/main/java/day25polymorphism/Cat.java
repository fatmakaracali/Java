package day25polymorphism;

public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("Cats move...");
    }

     @Override
    public void run(){
        System.out.println("Cats run");
    }


    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return 2*a*b;
    }
}
// parent class'daki methodu Child class icinde ozellestirerek kullanmaya overriding denir
//overriding de methodun parantezine ve method ismine dokunulmaz
//private method'lar override edilemez
//child class'daki methodun access modifier'i parent'tan daha dar olamaz
