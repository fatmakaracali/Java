package day18constructorsstatickeyword;

public class Carrunner {


    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car("Mercedes","C300", 2023, 30000);
        Car c3 = new Car("Audi", "R8", 2023, 50000);
        Car c4 = new Car("BMW");

        System.out.println(c1.make +" " +c1.price);




    }
}
