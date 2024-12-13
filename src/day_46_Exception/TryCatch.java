package day_46_Exception;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
//        int arr []=new int[5];
//        System.out.println("program başladı");
//        try{// hata alınması beklenen kod bloğu
//            System.out.println(arr[6]);
//            System.out.println("try bloğunun içi");
//        }catch (Exception e){// hata alındıktan sonra yapılan işlem
//            System.out.println("catch bloğunun içi");
//            System.out.println(e.toString());
//        }
//        System.out.println("program sonlandı");


        System.out.println("program başladı");
        boolean devam = true;
        while (devam) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("sayı: ");
                int x = scan.nextInt();
                System.out.println("bölüm");
                int y = scan.nextInt();
                System.out.println("sonuç: " + x / y);
                devam = false;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("lütfen tekrar debeyiniz");
            }
        }
        System.out.println("program sonlandı");
    }
}

