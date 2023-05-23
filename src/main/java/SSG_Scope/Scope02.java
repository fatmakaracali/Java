package SSG_Scope;

public class Scope02 {

    static int i;

    public static void main(String[] args) {

        int y = 14;

        for (int i = 0; i <5 ; i++) {

            System.out.println(i);

        }
        System.out.println(i);

        {
            int z = 543;
            System.out.println(z);
            System.out.println(y);
            System.out.println(i);
        }
        System.out.println(y);
        System.out.println(i);

    }
}
