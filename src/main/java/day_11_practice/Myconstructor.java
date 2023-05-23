package day_11_practice;

public class Myconstructor {

    int x=3;
    int y= 5;

    Myconstructor(){
        x+=1;
        System.out.println("-x"+x);
    }

    Myconstructor(int i){
        this.y=i;
        x+=y;
        System.out.println("-x"+x);
    }
    Myconstructor(int i, int i2){
        this(3);

        this.x-=4;
        System.out.println("-x"+ x);
    }

    public static void main(String[] args) {
        Myconstructor mc1= new Myconstructor(4,3);
    }


}
