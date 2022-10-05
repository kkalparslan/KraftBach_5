package day_47_Exception_Cont;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        // 2. soru: kullanıcıdan iki integer sayı alın 1. sayıyı 2. sayıya bölün.
        // kalanı ekrana yazdırın 2 ADET CATCH BLOĞU KULLANIN.2. sayının
        // 0 olabileceğini değerlendirin


//        try { // 1. çözüm sacanner sınıfı kullanmadan da sadece try catch blokları ile yapılabilirdi
//            Scanner scan = new Scanner(System.in);
//            System.out.println("sayı");
//             int x = scan.nextInt();
//            System.out.println("bölen");
//            int y = scan.nextInt();
//            System.out.println(x/y);
//        } catch (ArithmeticException e) {
//            System.out.println("aritmetik exception bulundu");
//            System.out.println(e.getMessage());
//
//        } catch (Exception e) {
//            System.out.println("Exception bulundu");
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("finally blok çalıştı");
//        }

        // 2. çözüm while döngüsü ile:
        boolean devam = true;
        while (devam) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("sayı: ");
                int x = scan.nextInt();
                System.out.print("bölen: ");
                int y = scan.nextInt();
                System.out.println("sonuc: "+(x / y));
            } catch (ArithmeticException e) {
                System.out.println("aritmetik bir hata bulundu tekrar deneyiniz");
                System.out.println(e.getMessage());
                continue;
            } catch (Exception e) {
                System.out.println("Exception bulundu tekrar deneyiniz");
                System.out.println(e.getMessage());
                continue;
                }
            finally {
                System.out.println("finally blok uyarıyor");

            }devam=false;
        }

    }
}
