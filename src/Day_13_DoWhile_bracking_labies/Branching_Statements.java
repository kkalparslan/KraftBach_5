package Day_13_DoWhile_bracking_labies;


import java.util.Scanner;

public class Branching_Statements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    for(int i=1; i<6; i++){
            System.out.println(i+" ilk döngü");
            for(int j=1; j<6; j++){
                if(j==3){
                    break;
                }
                System.out.println(j+" ikinci döngü");

            }
        }


/*

       while(true) {
           System.out.println(" sayıların toplamı 50 ise programdan çıkış işlemi olacaktır ");
           System.out.print(" lütfen birinci sayıyı giriniz ");
           int a = scan.nextInt();
           System.out.print(" lütfen ikinci sayıyı giriniz ");
           int b = scan.nextInt();
           System.out.println("toplam" + (a + b));
           if (a + b == 50) {
               break;
           }
       }


        while (true) {
            System.out.println("ne yapmak istiyorsunuz");
            System.out.println("1- Toplama \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme\n 5- Çıkış");
            System.out.print(" Seçiminiz  ");
            int i = scan.nextInt();
            if (i == 1) {
                while (true) {
                    System.out.println("Toplama işleminde çıkış için toplam 0 olmalı");
                    System.out.println("1. sayı: ");
                    int a = scan.nextInt();
                    System.out.println("2. sayı: ");
                    int b = scan.nextInt();
                    System.out.println("toplam=" + (a + b));
                    if ((a + b) == 0) {
                        break;
                    }
                }
            }
            if (i == 2) {
                while (true) {
                    System.out.println("Çıkarma işleminde çıkış için toplam 0 olmalı");
                    System.out.println("1. sayı: ");
                    int c = scan.nextInt();
                    System.out.println("2. sayı: ");
                    int d = scan.nextInt();
                    System.out.println("toplam=" + (c - d));
                    if ((c - d) == 0) {
                        break;
                    }

                }
            }
            if (i == 3) {
                while (true) {
                    System.out.println("Çarpma işleminde çıkış için toplam 0 olmalı");
                    System.out.println("1. sayı: ");
                    int e = scan.nextInt();
                    System.out.println("2. sayı: ");
                    int f = scan.nextInt();
                    System.out.println("toplam=" + (e * f));
                    if ((e * f) == 0) {
                        break;
                    }

                }
            }
            if (i == 4) {
                while (true) {
                    System.out.println("Bölme işleminde çıkış için toplam 0 olmalı");
                    System.out.println("1. sayı: ");
                    int g = scan.nextInt();
                    System.out.println("2. sayı: ");
                    int h = scan.nextInt();
                    System.out.println("toplam=" + (g / h));
                    if ((g / h) == 0) {
                        break;
                    }

                }
            }
            if (i == 5) {
                break;
            }
        }
*/



    }
}







