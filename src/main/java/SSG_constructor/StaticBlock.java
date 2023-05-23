package SSG_constructor;

public class StaticBlock {

    static int a=6;
    StaticBlock(){
        System.out.println("constructer calisti");
        a=5;
        System.out.println(a);
    }

    static {
        a=3;
        System.out.println("usteki static block calisti ve a degeri : "+a);
    }

    public static void main(String[] args) {
        System.out.println("Main Method calisti");
        System.out.println(a);
        StaticBlock obj1=new StaticBlock();


    }
    static {
        a=10;
        System.out.println("alttaki static block calisti ve a degeri : "+a);
    }


}
