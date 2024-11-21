package day_48_Collections;

import java.util.Scanner;

public class Collection_Lesson {
    public static void main(String[] args) {
        veriAlVeEkranaYazdir();
    }

    public static void veriAlVeEkranaYazdir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("kaç adet sayı girmek istiyorsunuz: ");
        int x=scan.nextInt();
        int [] array=new int[x];
        for (int i = 0; i < array.length; i++) {
            System.out.print("sayı: ");
            array[i]=scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
