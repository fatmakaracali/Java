package day18constructorsstatickeyword;

public class Student {

    /*
    1) Static class member'lar(variable +method +constructor +code blocks) tum object'ler tarafindan
    paylasilir
    2)static class member'lardaki degisikler tum objeler tarafindan otomatik olarak gorulur
    3)static class member'lar, gokteki ayin dunyaya bagli oldugu gibi , class'a baglidir
    bu yuzden static variable'lara "class variable" da denir.
    4)static class memberlarin nasil calistigini anlamak icin cizim yapip static olanlari class'a olmayanlari
    object'e baglayarak dusunmek gerekir
    5)"static" class member'lari cagirmak icin object olusturmak gerekmez ve tavsiye edilmez
    6)non-static class member'lari cagirmak icin object olusturmak sarttir


     */
    public static int numOfRegisteredStd=0;
    public int num=0;

    public Student() {

        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {

        System.out.println(numOfRegisteredStd);  //0
        Student s1= new Student();
        System.out.println(numOfRegisteredStd);//1
        Student s2= new Student();
        Student s3= new Student();
        System.out.println(numOfRegisteredStd);  //3
        System.out.println(s1.num);     //1
    }
}
     /*
       1) "static class member'lar (variable+method+constructor+code blocks) tum object'ler tarafindan paylasilir
       2)"static" class member'daki degisiklikler tum object,ler tarafindan gorulur
       3)"static" class member'lar, gokteki ayin dunyaya bagli oldugu gibi class'a baglidir.
       bu yuzden static variable'lara "class variable" da denir
       4)"static class member'larin nasil calistigini anlamak icin cizim yapip static olanlari class'a olmayanlari object'e baglayarak
       dusunmek bu konuyu kolaylastirir


      */
