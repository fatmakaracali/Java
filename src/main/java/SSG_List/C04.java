package SSG_List;

import java.util.ArrayList;
import java.util.List;

public class C04 {

  /*
    bir dogal sayi listesi olusturun ve olusturdugunuz listedeki cift ogeleri toplayin
   */
  public static void main(String[] args) {

      List<Integer> sayilar = new ArrayList<>();

      sayilar.add(36);
      sayilar.add(34);
      sayilar.add(25);
      sayilar.add(16);

      int sum =0;
     /* for (Integer a:sayilar) {

          if (a%2==0){
              sum+=a;
          }
      }System.out.println(sum);*/

      for (int i = 0; i <sayilar.size() ; i++) {

          if (sayilar.get(i)%2==0){
              sum+=sayilar.get(i);
          }

      }
      System.out.println(sum);

  }
}
