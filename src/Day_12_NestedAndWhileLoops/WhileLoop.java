package Day_12_NestedAndWhileLoops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
/*
       int i=0;
        while(i<20){
            System.out.println(i+" merhaba dünya");
            i+=2;
        }


// örnek 2

        int i=0;
        while(i<100){
            System.out.print(i+" " );
            i++;
        }


        //örnek 3
        int i=15;
        while(i<100){
            System.out.print(i+" " );
            i++;
        }


        //örnek 4 100 den 0 a kadar yazdırın

        int i=100;
        while(i>0){
            System.out.print(i+" " );
            i--;
        }

        //örnek 5 0 dan 100 e kadar olan çift sayıları yazdırın

        int i=0;
        while(i<100){
            System.out.print(i+" " );
            i+=2;
        } // veya

        int i=0;
        while(i<=100){
        if(i%2==0)
            System.out.print(i+" " );
            i++;
            }

        //örnek 6 0 dan 100 e kadar olan tek sayıları yazdırın

        int i=1;
        while(i<100){
            System.out.print(i+" " );
            i+=2;
        }

        //örnek 7 10 ile 1000 arasında olan 10 a tam bölünebilen tüm
        sayıları yazdırın

        int i=10;
        while(i<1000){
            System.out.print(i+" " );
            i+=10;
        } veya if ile de yapabiliriz;
        int i=10;
        while(i<=1000){
            if(i%10==0)
            System.out.print(i+" " );
            i++;
        }

        ÖRNEK 8: 8 faktöriyel??
        int i = 1, sonuc = 1;

        while (i <= 8) {
            sonuc *= i;
            i++;
            System.out.println("sonuç= "+sonuc);
            }


        //örnek9 0 ile 20 arasındaki 3 ün katı olan tüm sayıların küplerini ekrana yazdırın

        int i=3;
        while(i<20){
            int sonuc=i*i*i;
            System.out.println(i+" nin küpü= "+sonuc);
            i+=3;
        }

// derece fahreneyt ödev...

        double i=23;
        while(i<=50){
            double fahrenheit=((i*1.8)+32);
            System.out.println(i+" derece= "+fahrenheit+" fahrenheitdır");
            i+=1;
        }

        // kullanıcıdan kelime alın sorana kadar yazdırın taki x ebasana kadar
        Scanner scan = new Scanner(System.in);

        String exit = "x";
        while (true) {
            System.out.print("lütfen bir kelime giriniz: ");
            String kelime = scan.next();
            if (kelime.equals(exit)) { // exit yerine sadece equals "x" desek
                // te olurdu ancak kodun bu hali daha şık
                break;
            }
            System.out.print("kaç defa yazdırmak istersiniz ");
            int repeat = scan.nextInt();
            for (int i = 0; i < repeat; i++) {
                System.out.println(kelime);


// örnek xxxxxx
        for(int i=1; i<=5; i++){
            for(int j=1; j<=10; j++){
                System.out.print(1);
            }
            System.out.println();
        }

//dışarıdan bir k değişkeni atadık bu örnekte
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                k++;
                System.out.print(k);

            }
            System.out.println();
        }

        */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

            }
        }




