package MultiDimensional;

public class C02 {

    public static void main(String[] args) {




        /*
        verilen bir multi-dimensional array in tum elemanlarini yazdiran bir method olusturun
         */

        String isimler[][] = {{"Ali", "Veli", "Can", "Ahmet"}, {"Azra", "Ayse", "Sen"}};

        elemanYazdir(isimler);

    }
    public static void elemanYazdir(String[][]isimler) {

        for (String [] w:isimler)
              {
                  for (String a:w)
                        {
                            System.out.println(a);

                  }
                  System.out.println("---------");

        }



        }


    }


