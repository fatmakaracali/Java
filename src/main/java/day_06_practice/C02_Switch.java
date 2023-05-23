package day_06_practice;

import java.util.Scanner;

public class C02_Switch {

    public static void main(String[] args) {

         /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.
     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın
     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("1-4 arasi islem numaranizi giriniz" + "\n "+
                " işlem 1: Bakiye Sorgulama" + "\n" +
                "     işlem 2: Para Cekme" + "\n" +
                "     işlem 3: Para Yatırma" + "\n" +
                "     işlem 4: İşlemi Sonlandırın" );
        int islemNo= scan.nextInt();

        int bakiye = 1000;

        switch (islemNo){
            case 1:     //bakiye sorgulama
                System.out.println("Bakiyeniz: " +bakiye + "TL");

            case 2:  // Para Cekme
                System.out.println("Cekmek Istediginiz Parayi Giriniz");
                int cekilecekPara = scan.nextInt();
                if(cekilecekPara<=bakiye){
                    bakiye =  bakiye-cekilecekPara;
                    System.out.println("Para Cekme Isleminden Sonraki Mevcut Bakiyeniz: " + bakiye + "TL");
                }else{
                    System.out.println("Bakiyeniz Yetersiz");
                }
                break;
            case 3: // Para Yatirma
                System.out.println("Yatirmak Istediginiz Parayi Giriniz");
                int yatirilacakPara = scan.nextInt();
                if(yatirilacakPara<=2000){
                    bakiye =  bakiye + yatirilacakPara;
                    System.out.println("Para Yatirma Isleminden Sonraki Mevcut Bakiyeniz: " + bakiye + "TL");
                }else{
                    System.out.println("ATM'de Gunluk Para Yatirma Limiti 2000TL");
                }
                break;
            case 4: // Islemi Sonlandir
                System.out.println("Techpro Bank'ı Kullandiginiz Icin Tesekkur Ederiz");
                break;
            default:
                System.out.println("Gecerli Bir Numara Giriniz");
        }


    }

    }

