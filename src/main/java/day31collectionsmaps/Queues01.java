package day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    public static void main(String[] args) {


        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse); //[Milk, Meat, Bread, Egg, Cheese]

        wareHouse.remove();
        System.out.println(wareHouse);  //[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek()); //Meat
        System.out.println(wareHouse);  //[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse); //[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.poll()); //ilk elemani verir ve siler, boslar icin null verir Meat
        System.out.println(wareHouse); //[Bread, Egg, Cheese]

        wareHouse.clear(); //hepsini siler
        System.out.println(wareHouse.poll()); //null
        System.out.println(wareHouse.remove()); //Exception. data bos oldugu icin hata verir

    }
}