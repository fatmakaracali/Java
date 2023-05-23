package ReplitDeneme;

import java.util.ArrayList;
import java.util.List;

public class TestArray7 {

    public static void main(String[] args) {
     /*   Array i ARRAYLIST e çeviren Java Kodunu yazınız.

        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

```
        Beklenen Çıktı:
```

```
[Python, JAVA, PHP, Perl, C#, C++]*/
        String arr[]={ "Python", "JAVA", "PHP", "Perl", "C#", "C++" };

        List<String> lst= new ArrayList<>();



        for (String w: arr) {

            lst.add(w);
        }
        System.out.println(lst);




    }
}
