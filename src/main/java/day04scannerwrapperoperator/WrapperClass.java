package day04scannerwrapperoperator;

public class WrapperClass {
        public static void main(String[] args) {

        }
        {


                // primitive     : char, boolean, byte, short, int, long, float, double
                // Wrapper Class : Character, Boolean, Byte, Short, Integer, Long, Float ,Double

                // Wrapper Class lar non-primitive dir. Oyuzden memory de cok yer kaplarlar.
                // o yuzden sart degilse wrapper class kullanmayi tercih etmeyiz.
                // boyle bir imkanin da varligindan haberdar olmaliyiz.

                // "n" yazip "." koyarsaniz hic method goremezsiniz, cunku primitive ler method icermez.
                // "m" yazip . koyarsaniz bircok method gorebilirsiniz, cunku wrapper class lar method icerir.
                int n = 12;
                Integer m = 12;
                byte p = 13;
                Byte r = 13;

                // ornek 1: short data type in minimum ve maximum degerlerini kod yazarak bulunuz
                short maxShort = Short.MAX_VALUE;
                System.out.println(maxShort);

                short minShort = Short.MIN_VALUE;
                System.out.println(minShort);

                // ornek 2: int data type inin minimum degeri ile byte data type inin max degerini topla

                byte maxDeger = Byte.MAX_VALUE;
                int minDeger = Integer.MIN_VALUE;
                System.out.println(maxDeger + minDeger);

                // ornek 3: primitive int i wrapper Intrger a ceviriniz.  AUTOBOXING
                // primitive yani method bulunmayan bir kutudaki degeri alarak icinde bazi methodlar bulunan wrapper kutuya
                // atarsak bu isleme autoboxing denir

                int num = 13;
                Integer wrapperNum = num;

                // Wrapper Byte i , primitive byte a ceviriniz.          UNBOXING
                Byte k = 33;
                byte primitivek = k;

                // wrapper, bir kutu icinde bulunan bazi methodlarla birlikte bulunan degeri alarak primitive yani method
                // bulunmayan bir kutuya atarsak bu isleme UN BOXING denir.

                // ornek 4 primitive chari Wrapper Character e ceviriniz

                char initial = 'T';
                Character initialWrapper = initial;

                //Wrapper Boolean i primitive boolean a ceviriniz

                Boolean isOld = true;
                boolean isOldpr = isOld;

        }
}

