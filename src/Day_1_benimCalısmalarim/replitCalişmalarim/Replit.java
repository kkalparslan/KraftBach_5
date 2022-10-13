package Day_1_benimCalısmalarim.replitCalişmalarim;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Replit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        System.out.println("kitap1 in ismini ve fiyatını girin:");
        String kitap1=sc.nextLine();
        double fiyat1=sc.nextDouble();

        System.out.println("kitap2 nin ismini ve fiyatını girin:");
        String kitap2=sc.nextLine();
        sc.nextLine();
        double fiyat2=sc.nextDouble();

        System.out.println("kitap3 ün ismini ve fiyatını girin:");
        String kitap3=sc.nextLine();
        sc.nextLine();
        double fiyat3=sc.nextDouble();
        double toplamFiyat=fiyat1+fiyat2+fiyat3;
        System.out.println("Kitap1 fiyatı: "+fiyat1+", Kitap2 fiyatı: "+fiyat2+", "
                +"Kitap3 fiyatı: "+fiyat3+"\n"+"Toplam Fiyat: "+toplamFiyat+"TL");
































//        System.out.println("bir rakam giriniz");
//        Scanner scan =new Scanner(System.in);
//        // 15:30:11 PM
//
//        int hour =scan.nextInt();
//        int minute=scan.nextInt();
//        int second= scan.nextInt();
//        scan.nextLine();
//        scan.nextDouble();
//        scan.nextLine();
//        String amOrPm=scan.nextLine();
//
//        System.out.println(hour+":"+minute+":"+second+" "+amOrPm);



    }
}
