package day24inheritancepolymorphism;

public class Toyota extends Car{

    public void hybrid(){
        System.out.println("Toyota ");
    }

    public Toyota(){
        this("Prius");
        System.out.println("Toyota constructur 1");
    }
    public Toyota(String s){
        super(7);
        System.out.println("Toyota constructur 2");
    }
}
