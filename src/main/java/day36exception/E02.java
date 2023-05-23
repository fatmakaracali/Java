package day36exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {

      //2.yol
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day36exception/TexFile");

            int i =0;
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {



            System.out.println("Path is wrong or the file does not exist");

        } catch (IOException e) {
            System.out.println("Some characters could not be read");
        }
    }

   /* compile time exception

            1)FileNotFoundException(Dosya bulunamadi hatasi)
    Javadan bir dosyayi bulmasini istediginizde java dosyanin adresi ve dosyanin varligi konusunda hata olusursa
    ne yapmasi gerektigini de soylemenizi ister.
    Ona ne yapmasini soylersek ayrica javayi bu dosyanin silinmedigi konusunda rahatlatmamiz gerekir.

            2)IOException(Input-Output)
    Bu exception input ve output ile ilgili tum problemleri handle edebilir.
     Application'imiza data girdisi yaptigimizda veya data ciktisi yapabiliriz.
     Dosyanin bulunmasi halinde oradaki datayi kullanabiliriz.
     Oyleyse dosyanin bulunmasi input ile alakali bir operasyondur.
      IOException bu nedenle FileNotFoundException'in parent'idir. Genel olan spesifik olanin parent'i olur.
      Bu durumda parent catch block'da ona gore sirasini alir.
    Coklu catch block yapmazsak, o zaman sadece IOExeption'i kullaniriz.*/

}