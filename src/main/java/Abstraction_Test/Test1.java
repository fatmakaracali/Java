package Abstraction_Test;

public class Test1 extends Ab01 {

    int b = 10;

    Test1() {
       b= super.b;

    }

    void getNumber(int x, int y) {
        int i = x * y + b;
        System.out.print(i);
    }

    public static void main(String[] args) {
        Test1 sub = new Test1();
        sub.getNumber(7, 3);
    }
}