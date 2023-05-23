package day35exception;

public class E4 {
    public static void main(String[] args) {

        printAge(151);

    }
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age>120) {
            throw new IllegalArgumentException("Age cannot be older than 150");

        }else{
            System.out.println(age);
        }
    }
}
