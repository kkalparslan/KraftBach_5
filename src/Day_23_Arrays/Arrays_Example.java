package Day_23_Arrays;

import java.util.Random;

public class Arrays_Example {
    public static void main(String[] args) {
        // String[] kelime = new String[5];
//        int [] i=new int[4];
//        i[0]=12;
//        i[1]=14;
//        i[2]=16;
//        System.out.println(i[0]);
//        System.out.println(i[1]);
//        System.out.println(i[2]);
//        for (int j = 0; j < 3; j++) {
//            System.out.println(i[j]);
        //  for (int k = 0; k < 3; k++) {
        //  System.out.println(i[k]*i[k]);
/*
        String[] hafta = new String[7];
        hafta[0] = "pazartesi";
        hafta[1] = "salı";
        hafta[2] = "çarşamba";
        hafta[3] = "preşembe";
        hafta[4] = "cuma";
        hafta[5] = "cumartesi";
        hafta[6] = "pazar";
        //System.out.println("bugün günlerden "+hafta[2]);
//        if(hafta[2].equals("çarşamba")){
//            System.out.println("bugün günlerden çarşambadır");
//        }else{
//            System.out.println("bugün günlerden çarşamba değildir");
//        }
//        for (int i = 0; i < 7; i++) {
//            if (hafta[i].equalsIgnoreCase("cuma")) {
//                System.out.println("true");
//                break;
//            } else {
//                if (i == 6) {
//                    System.out.println("false");
//                }
//            }
//        }
// 2. yol
        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (hafta[i].equalsIgnoreCase("cuma")) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
      String isim="alparslan";
        String str [] ={"ali","alp","aslan","arslan","alparslan"};

        int count=0;
        for (int i = 0; i < 5; i++) {
            if(str[i].equalsIgnoreCase(isim)){
                count++;
            }
        }if(count>0){
            System.out.println("isminiz grup içerisinde vardır");
        }else{
            System.out.println("isminiz grup içerisinde yoktur");
        }

       int [] sayi= new int [20];
       Random random=new Random();
        int tek=0,çift=0;
        for (int i = 0; i < 20; i++) {
            sayi[i] = random.nextInt(100);
            System.out.println((i) + " sayı: " + sayi[i]);
                        if (sayi[i] % 2 == 0) {
                çift++;
            } else {
                tek++;
            }
        }
        System.out.println("17. indeksdeki sayımız " + sayi[17]);
        System.out.println("array uzunluğu "+sayi.length);
//        int tek=0,çift=0;
//        for (int i = 0; i < 20; i++) {
//            sayi[i]=random.nextInt(100);
//            if(sayi[i]%2==0){
//                çift++;
//            }else{
//                tek++;
//            }
//        }
        System.out.println("tek sayı adedi: "+tek);
        System.out.println("çift sayı adedi: "+çift);
*/
        int [] array=new int [5];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
//        for (int i: array){
//            System.out.println(i);
 //       }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}


