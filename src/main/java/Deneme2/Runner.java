package Deneme2;

public class Runner {
    public static void main(String[] args) {


        Shape c= new Circle();

        c.draw();
        c.paint();

        Shape s= new Square();

        s.draw();
        s.paint();

        Shape t= new Shape();
        t.draw();
        t.paint();
    }
}
