package day26abstraction;

public class TestLER extends Ab02 {


    @Override
    public void set(int a) {
        this.a=a;
    }

    public static void main(String[] args) {
        TestLER obj = new TestLER();

        obj.set(20);

        System.out.println(obj.get());
    }
}



