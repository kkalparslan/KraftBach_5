package day_47_Exception_Cont;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        // soru integer değişken kabul eden bir method yazın
        // kullanıcıdan tek bir giriş sağlayın.
        // kullnıcı integer dışında bir değer girerse "lütfen tekrar deneyiniz" hata mesajı verin.
        // kullanıcı doğru girişi yapana kadar kullnıcıdan veri almaya devam edin

        boolean devam = true;
        while (devam) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("sayı");
                int x = scan.nextInt();
            } catch (Exception e) {
                System.out.println("lütfen tekrar deneyiniz");
                continue;
            }
            System.out.println("programdan çıkış yapılıyor");
            devam = false;

        }

    }
}
