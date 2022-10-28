package Day_1_benimCalısmalarim.replitCalişmalarim;

import java.util.Scanner;

public class Cfs_ControlFlowStatment {
    public static void main(String[] args) {
//        **** girilen sayının tek mi çift mi olduğunu kontrol eden bir kod yazınız.
//        Konsolda kullanıcıya sorun "Enter a number:"
//        example :
//        25
//        25 is a odd number.
       Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int a=scan.nextInt();
//        if(a%2==0){
//            System.out.println(a+" is a even number");
//        }else{
//            System.out.println(a+" is a odd number");
//        }


//        **** Verilen sayının negatif,pozitif veya 0 oldugunu kontrol eden bir akış ifadesi yazınız.
//        konsola sayının ne oldugunu ornekteki gibi yazdırın.
//        Example :
//        10
//        sayı sıfırdan büyük ve pozitiftir.
//        ***
//        0
//        sıfır girdiniz.
//        ***
//        -10
//        sayı sıfırdan küçük ve negatiftir.

//       SORU:  Scanner scan = new Scanner(System.in);
//        int num=scan.nextInt();
//        if(num>0){
//            System.out.println("sayı sıfırdan büyük ve pozitiftir.");
//        }else if(num<0 ){
//            System.out.println("sayı sıfırdan küçük ve negatiftir.");
//            }else if(num==0){
//            System.out.println("sıfır girdiniz.");
//
//        }
        // SORU: kullanıcıdan 3 sayı isteyin ve ortanca olanı bulun.**
        // submitted
//        Scanner sc = new Scanner(System.in);
//        System.out.println("3 sayı giriniz");
//        System.out.print("->");
//        int a=sc.nextInt();
//        System.out.print("->");
//        int b=sc.nextInt();
//        System.out.print("->");
//        int c=sc.nextInt();
//        if(a>b && a<c || a>c && a<b){
//            System.out.println(a+"-> mid");
//        } else if (b > a && b<c || b<a && b>c) {
//            System.out.println(b+"-> mid");
//        }else {
//            System.out.println(c+"-> mid");
//        }

        // SORU:  isa,serdar,harun,salih isimlerini girdiğinizde kraft personeli olduğunu başka isim girildiğinde öğrenci oldugunu yazdırın.
        //    Examples :
        //    input: serdar
        //    output:staff
        //    input: isa
        //    output:staff
        //    input: salih
        //    output:staff
        //    input: harun
        //    output:staff
        //    input: ihsan
        //    output:student
   /*
        Scanner scan =new Scanner(System.in);
            System.out.println("isim giriniz");
            String name=scan.nextLine();
            switch (name){
                case "serdar":
                    System.out.println("staff");
                    break;
                case "isa":
                    System.out.println("staff");
                    break;
                case "salih":
                    System.out.println("staff");
                    break;
                case "harun":
                    System.out.println("staff");
                    break;
                default:
                    System.out.println("student");
            }
            */

       // SORU:
//         System.out.println("Saniye girin");
//                int seconds1 = scan.nextInt();
//                int hour=seconds1/3600;
//                int minutes=(seconds1-(hour*3600))/60;
//                int seconds=seconds1-((hour*3600)+(minutes*60));
//                System.out.println(hour+" hour, "+minutes+" minutes, "+"and "+seconds+" seconds");

    // SORU: yaşa göre kayıt sistemi : 3-5 yaş okul öncesi, 6-9 ilkokul,
        // 10-13 ortaokul, 14-17 lise, 18-~ universite.
        //
        //3'den küçük okula gidemez.
        //
        //example :
        //input : 3 output : okul öncesi
        //input : 8 output : ilkokul
        //input : 11 output : ortaokul
        //input : 13 output : ortaokul
        //input : 16 output : lise
        //input : 17 output : lise
        //input : 1 output : okula gidemez
        //input : 20 output : üniversite

        int yas=scan.nextInt();
        switch (yas) {
            case 1:
                System.out.println("okula gidemez");
                break;
            case 2:
                System.out.println("okula gidemez");
                break;
            case 5:
                System.out.println("okul öncesi");
                break;
        }
        switch (yas){
            case 3:
                System.out.println("okul öncesi");
                break;
            case 4:
                System.out.println("okul öncesi");
                break;
            case 5:
                System.out.println("okul öncesi");
                break;
           }
        switch (yas){
            case 6:
                System.out.println("ilkokul");
                break;
            case 7:
                System.out.println("ilkokul");
                break;
            case 8:
                System.out.println("ilkokul");
                break;
            case 9:
                System.out.println("ilkokul");
                break;
        }
        switch (yas){
            case 10:
                System.out.println("ortaokul");
                break;
            case 11:
                System.out.println("ortaokul");
                break;
            case 12:
                System.out.println("ortaokul");
                break;
            case 13:
                System.out.println("ortaokul");
                break;
        }
        switch (yas){
            case 14:
                System.out.println("lise");
                break;
            case 15:
                System.out.println("lise");
                break;
            case 16:
                System.out.println("lise");
                break;
            case 17:
                System.out.println("lise");
                break;
                default:
                System.out.println("üniversite");
            }

        }




    }


