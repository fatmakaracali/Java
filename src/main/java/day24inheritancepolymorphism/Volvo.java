package day24inheritancepolymorphism;

public class Volvo extends Car{

    public void secure(){
        System.out.println("Volvo is the most secure car");
    }

    @Override //Bu bir "annotation" dir. override'daki kurallari kontrol eder
    public void move() {
        System.out.println("Volvo moves...");
    }
}
