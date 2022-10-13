package bootCamp;

import java.util.Scanner;

public class B3_Loops {
    public static void main(String[] args) {
        // fori
        // iteration number is fixed
        // track index
        // for(initialization; condition; iterator--increment){}

        // while
        // iteration is not fixed
        // do not track if index
        // while(condition) {}

        // do while
        // one time execute even condition is false
        // do{} while (condition)

//        String message = "welcome to bootcamp";
//        // for loop ve while ile son kelimesini tersten yazdıracağız..
//        String reverse="";
//        // 1-tersten döndüreyim
//        // 2-ilk boşlukta kodum kesilmeli
//
//        int i= message.length()-1;
//        for (i=i; i> 0; i--){
//            if (message.charAt(i)==' '){break;}
//            if (message.charAt(i)!=' '){
//                reverse+=message.charAt(i);
//            }
//        }
//        System.out.println("reverse = " + reverse); // reverse = pmactoob
//        System.out.println("reverse.length() = " + reverse.length());
//
//
//        message="welcome to bootcamp";
//        i=message.length()-1;
//        reverse="";
//        while (message.charAt(i)!=' '){
//            reverse+=message.charAt(i);
//            i--;
//        }
//        System.out.println("reverse = " + reverse); // reverse = pmactoob
//        //---------------------------------------------------------------
//
//        String colar= "red";
//        int count=0;
//        do {
//            count++;
//            System.out.println(count+" ----> do it");
//        }while (colar.equals("red") && count<10);

        // break and continue
        // kullanıcıdan bir sayı aralığı alalım
        // 1- 7 ye tam bölünen sayıya kadar azalan şekilde yazdıralım.
        // 2- 7 ye tam bölünenleri yazdıran sayıları artan şekilde yazdırın

        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        // 1.cevap;
        for (int j = Integer.max(i1, i2); j >= Integer.min(i1, i2); j--) {
            if (j % 7 == 0) break; // true olduğu anda döngüyü keser loop un dışına çıkar
            System.out.print(" " + j);
        }
        // 2. cevap;
        for (int t = Integer.min(i1, i2); t <= Integer.max(i1, i2); t++) {
            if (t % 7 != 0) continue; // true ise devam etme altta ki satırları yazmadan for
            System.out.print(t + " ");
        }
        // label works with break and continue
        // verilen aralıktaki prime numberları bulunuz.

        // 1- prime number sadece 1 e ve kendine bölünen sayılar
        // 2- hersayı 1 e bölünebilir loop 2 den başlamalı
        // 3- iç içe 2 loop olmalı; dıştaki sayı aralığını tek tek gezmeli,
        // 4- içdeki loop dıştakinden gelen her sayıyı 2 dahil son sayıya
        // kadar tüm sayıları bölmeli ve tam bir bölüm olup olmadığını denetlemeli

        label: for (int j = Math.min(i1,i2); j <= Math.max(i1,i2); j++) {
           // 7---2,3,4,5,6
           // 8---2,3,4,5,6,7
            for(int k=2; k<j; k++){
                if(j%k==0){
                    continue label;
                }
            }
            System.out.println(j+" ");

        }




    }


}

