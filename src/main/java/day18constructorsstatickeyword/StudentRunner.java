package day18constructorsstatickeyword;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {

        //Static olan "numofrefistered" variable'ini cagirmak icin sadece class ismini kullanidik
        System.out.println(Student.numOfRegisteredStd); //0

        //static olmayan "num" variable'ini cagirmak icin object olusturduk
        Student s1 = new Student();
        System.out.println(s1.num);

        // static olan  "numofregisteredstd" variable'ina object uzerinden ulasabilirsiniz ama bu hatadir
        // System.out.println(s1.numOfRefisteredStd);

    }
}
