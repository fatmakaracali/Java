package day22stringbuilder;

public class sbf01 {

    /*
    1) StringBuffer : Java'da String ureten bir Class'tir
    2) StringBuffer, StringBuilder'e cok benzer, yani ikiside "mutable" String uretir
    3) StringBuffer " multi-thread" dir ama StringBuilder "multi-thread" degildir.
    4)Java  StringBuffer'i, StringBuilder'den once olusturuldu
    5)  StringBuilder, "multi-thread" olmadigi icin StringBuffer'dan daha hizli calisir
    6)multi-thread yapilirken yapilan islerin sirasi onem arz eder. yapilan isleri mantikli bir siraya koymaya
    "synchronization" olarak adlandirilir
    StringBuffer "multi-thread oldugu icin ayni zamanda "synchronized" dir

    3 tane String olusturan Class ogrendik
    i) immutable string lazimsa ; String Class
    ii)mutable string lazimsa ; Stringbuilder ya da stringbuffer
    1) Stringbuilder'i multi-thread gerekmezse kullaniriz
    2)Stringbuffer'i multi-thread gerekirse kullaniriz
     */

    public static void main(String[] args) {

        StringBuffer sbf1= new StringBuffer("Java");




    }
}
