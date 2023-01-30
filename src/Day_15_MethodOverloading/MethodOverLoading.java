package Day_15_MethodOverloading;

import java.util.Scanner;

public class MethodOverLoading {
    public static void main(String[] args) {

        // calculateArea(5,4);
        //calculateArea(3);
        //  concat(5,"Alparslan",false);
        //concat("emel", 4);
        //startProcess();
        // benim çözümler
        //calculatedArea(8,7);
        //calculatedArea(4);
        // konkat(4," Alparslan ",false);
        // konkat("azra", 6);
        //startProcess();
        //baslangic();




    }

    public static void calculateArea(int a, int b) {
        System.out.println(a * b);
    }

    // aşağıdaki iki calculated benim tekrarlar.
    public static void calculatedArea(int a, int b) {
        System.out.println("kare alan " + a * b);
    }

    public static void calculatedArea(int a) {
        double PI = 3.14;
        int r = a;
        System.out.println("daire alan= " + (PI * r * r));
    }

    public static void calculateArea(int b) {
        int r;
        double PI = 3.14;
        r = b;
        System.out.println(PI * r * r);
    }

    public static void concat(int i, String str, boolean bl) {

        if (bl) {
            System.out.println(str + " " + i);
        } else {
            concat(str, i);
        }
    }


    public static void konkat(int i, String str, boolean bl) {
        if (bl) {
            System.out.println(str + i);
        } else {
            konkat(str, i);
        }

    }

    public static void konkat(String kelime, int c) {
        for (int t = 0; t < c; t++) {
            System.out.println(kelime);
        }
    }


    public static void concat(String kelime, int c) {
        for (int t = 0; t < c; t++) {
            System.out.println(kelime);
        }
    }


    public static void startProcess() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 2 sayı giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        if (sayi2 % 3 != 0) {
            sum(sayi1, makeMultipleOfThree(sayi2));
        } else {
            sum(sayi1, sayi2);
        }
    }

    public static int makeMultipleOfThree(int a) {
        int multiple3;
        if (a % 3 > 1) {
            multiple3 = a + 1;
        } else {
            multiple3 = a - a % 3;
        }
        return multiple3;
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    // benim örnek
    public static void baslangic() {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayı giriniz ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num2 % 3 != 0) {
            topl(num1, katOfuc(num2));
        } else {
            topl(num1, num2);
        }
    }

    public static int katOfuc(int a) {
        int katuc;
        if (a % 3 > 1) {
            katuc = a + 1;
        } else {
            katuc = a - a % 3;
        }
        return katuc;
    }

    public static void topl(int a, int b) {
        System.out.println(a + b);
    }

    public static void yeniİslem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();
        if(b%3!=0){
            //met
        }else{
            System.out.println(a+b);
        }
    }
public static int cevir(int b){
        int n=b;
        if(b%3>1){
            n=b+1;
        }else{
            n=b-1;
        }
    return n;
    }
    public static void son(){
        System.out.println();
    }
// benim çalışmalar eksik kaldı
}












