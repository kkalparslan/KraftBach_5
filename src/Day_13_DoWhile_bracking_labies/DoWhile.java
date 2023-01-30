package Day_13_DoWhile_bracking_labies;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.println(i + "nci işlem");
            i++;
        } while (i < 6);
        System.out.println(i);
    }
}

// örnek toplam 0 ise programdan çıksın


        /*System.out.println("lütfen bir sayı giriniz");

        do {
            System.out.println("toplam 0 ise programdan çıkış işlemi olacaktır");
            System.out.println("1. sayı");
            int a = scan.nextInt();
            System.out.println("2. sayı");
            int b = scan.nextInt();
            System.out.println("toplam" + (a + b));
            if (a + b == 0) {
                break;
            }
        }while (true) ;


        //farklı metot aşağıda
        int i = 0;
        do {
            System.out.println("toplam 0 ise programdan çıkış işlemi olacaktır");
            System.out.println("1. sayı");
            int a = scan.nextInt();
            System.out.println("2. sayı");
            int b = scan.nextInt();
            System.out.println("toplam" + (a + b));
            i++;
        }while(i<10);



        //3. yöntem
        boolean k = true;
        System.out.println("lütfen bir sayı giriniz");

        do {
            System.out.println("toplam 0 ise programdan çıkış işlemi olacaktır");

            System.out.println("1. sayı");
            int a = scan.nextInt();
            System.out.println("2. sayı");
            int b = scan.nextInt();
            System.out.println("toplam" + (a + b));
            if (a + b == 0) {
                k = false;
            }
        } while (k);

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(50);

        int j=1;
        do {
            System.out.println(j+" tahmin: ");
            int tahmin= scan.nextInt();
            if(tahmin==i){
                System.out.println("tebrikler sayıyı buldun");
                break;
            }
            else if(tahmin>i){
                System.out.println("aşağı");
            }
            else{
                System.out.println("yukarı");
            }
            j++;
        }while(j<6 );

        System.out.println("tuttuğum sayı"+i);
    }
}*/

