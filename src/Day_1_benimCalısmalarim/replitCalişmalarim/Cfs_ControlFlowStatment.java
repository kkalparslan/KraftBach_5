package Day_1_benimCalısmalarim.replitCalişmalarim;

import java.util.Scanner;

public class Cfs_ControlFlowStatment {
    public static void main(String[] args) {
//        **** girilen sayının tek mi çift mi olduğunu kontrol eden bir kod yazınız.
//        Konsolda kullanıcıya sorun "Enter a number:"
//        example :
//        25
//        25 is a odd number.
//        Scanner scan = new Scanner(System.in);
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

        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        if(num>0){
            System.out.println("sayı sıfırdan büyük ve pozitiftir.");
        }else if(num<0 ){
            System.out.println("sayı sıfırdan küçük ve negatiftir.");
            }else if(num==0){
            System.out.println("sıfır girdiniz.");

        }







    }
}