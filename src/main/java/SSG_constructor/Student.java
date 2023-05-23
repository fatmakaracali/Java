package SSG_constructor;

public class Student {

    String name = "Emily";
    int age = 20;

    Student(String name, int age) {
        System.out.println(name);
        this.name = name;
        this.age = 22;

        System.out.println("constructer icindeki age : " + this.age);
    }

    public static void main(String[] args) {

        Student st = new Student("oliver", 21);
        System.out.print(st.name);
        System.out.print("," + st.age);

    }
}