package day12_switchloops;

public class IncrementDecrement {


        //int age = 12;  1)age = age+1;   2)age +=1;    age++;( bu sadece 1 artirmak icin)
        // toplama INCREMENT

        // int salary=120000;   1)salary= salary*1.1;    2)salary *=1.1  carpma increment


        //DECREMENT

        // INT PRICE = 12;      cikarma
        // 1)price = price-3;   2)price -=3;     3)price--;(bu sadece 1 azaltmak icin kullanilir)

        // 1)salary = salary/3;   2) salary/=3;

          /*
        1)"Increment" artirmak demektir, "Decrement" azaltmak demektir.
        2)"Increment" toplama ve carpma ile, "Decrement" cikarma ve bolme ile yapilabilir.
        3)"Increment" ve "Decrement" 3 yolla yapilabilir
            i) int i = 12; ==>  i = i + 5;
            ii) int i = 12; ==>  i += 5;
            iii) int i = 12; ==>  i++;
                 Note: 3. yol sadece 1 artirmak icin kullanilabilir.

            i) int i = 12; ==>  i = i - 5;
            ii) int i = 12; ==>  i -= 5;
            iii) int i = 12; ==>  i--;
                 Note: 3. yol sadece 1 azaltmak icin kullanilabilir.
     */
          public static void main(String[] args) {

              // bir intager variable olusturun ve onu 5 artirin



            int age = 12;
              System.out.println(age); //12
            age =age++;
              System.out.println(age); //12   Post increment

              age =++age;
              System.out.println(age); //13   Pre increment


              int salary = 40;
              salary  = salary-- ;        //Post decrement
              System.out.println(salary); //40

              salary =--salary;           // Pro decrement
              System.out.println(salary); //39


          }
    }

