package Day_27_Arrays_Lab_Cont;

import Day_23_Arrays.Arrays_Example;
import Day_26_Arrays_Lab.ArraysExample_1;

import java.util.Arrays;

public class Arrays_Example_2 {
    public static void main(String[] args) {
        //System.out.println(dublicateControl(sayilar));
//        String str5="Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek\n" +
//                "dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp\n" +
//                "sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının\n" +
//                "üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu ";

        int[] sayilar = {2, 3, 5, 8, 6, 9, 10};
        //System.out.println(enBuyukIkınciSayi(sayilar));
        //System.out.println(ardArdaUcSayi(sayilar));
        //System.out.println(Arrays.toString(yalnizSayilar(sayilar)));  //Harun hocaya sor
        //System.out.println(enCokSayiBul(sayilar));
        //System.out.println(dublicateControl(sayilar));
        //System.out.println(findCountLetter_1(str5,"o"));
        //System.out.println(findCountLetter_2(str5, "o"));
        //System.out.println(findCountLetter_3(str5, "o"));
        //System.out.println(dublicateControlString("ben seni çok seviyorum çünkü ben, çünkü ben"));
        //System.out.println(Arrays.toString(enKucukSayiVeSifirAta(sayilar)));
        //ArraysExample_1.arrayYazdir(degerAtamaKontrol(sayilar,5,8,1));
        // deger atama sorusunu harun hocaya soralım parametreleri vermeden de çözülebilirmiydi??
    }

    public static int enBuyukIkınciSayi(int[] arr) {
        int a = arr[0];
        int b = arr[0];
        for (int sayi : arr) {
            if (sayi > a) a = sayi;
        }
        for (int sayi : arr) {
            if (sayi > b && sayi < a) b = sayi;
        }
        return b;
    }

    public static boolean ardArdaUcSayi(int[] arr) {
        if (arr.length < 3) return false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + 1 == arr[(i + 1)] && arr[i] + 2 == arr[i + 2]) {
                return true;
            }
        }
        return false;
    }

    public static String[] yalnizSayilar(int[] arr) {
        String yalnizSayilar = "";
        if (arr.length == 1) {
            yalnizSayilar += arr[0] + " ";
            return yalnizSayilar.split(" ");
        }
        if (arr[0] != arr[1]) yalnizSayilar += arr[0] + " ";
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                yalnizSayilar += arr[i] + " ";
        }
        if (arr[arr.length - 1] != arr[arr.length - 2])
            yalnizSayilar += arr[arr.length - 1] + " ";

        return yalnizSayilar.split(" ");
    }

    public static int enCokSayiBul(int[] arr) {
        int enCok = -1;
        int count;
        int adet = 1;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > adet) {
                enCok = arr[i];
                adet = count;
            }
        }
        return enCok;
    }

    public static boolean dublicateControl(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int findCountLetter_1(String str, String harf) {
        str = str.toLowerCase();
        String[] arr = str.split("");
        int count = 0;
        for (String harf1 : arr) {
            if (harf1.equals(harf)) {
                count++;
            }
        }
        return count;
    }

    public static int findCountLetter_2(String str, String harf) {
        return str.toLowerCase().split(harf).length - 1;
    }

    public static int findCountLetter_3(String str, String harf) {
        return str.toLowerCase().length() - str.toLowerCase().replace("o", "").length();
    }

    public static boolean dublicateControlString(String str) {
        String[] strArray = str.toLowerCase().split(" ");
        for (int i = 0; i < strArray.length; i++) {
            for (int k = 0; k < strArray.length; k++) {
                if (i != k && strArray[i].equals(strArray[k])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] enKucukSayiVeSifirAta(int[] arr) {
        int enKucukSayi = arr[0];
        for (int sayi : arr) {
            if (sayi < enKucukSayi) {
                enKucukSayi = sayi;
            }
        }
        int[] yeniArray = new int[arr.length];
        yeniArray[0] = enKucukSayi;
        for (int i = 1; i < yeniArray.length; i++) {
            yeniArray[i] = 0;
        }
        return yeniArray;
    }

    public static int[] degerAtamaKontrol(int[] arr, int ilkDeger, int kontrolDegeri, int atanacakSayi) {
        int[] yeniArray = new int[arr.length];
        yeniArray[0] = arr[0];
        for (int i = 0; i < yeniArray.length - 1; i++) {
            if (arr[i] == ilkDeger && arr[i + 1] == kontrolDegeri) {
                yeniArray[i + 1] = atanacakSayi;
            } else {
                yeniArray[i + 1] = arr[i + 1];
            }
        }
        return yeniArray;
    }
    //       [5 ,10, 6, 9 ,5]            5,8
    //       [5, 10, 5, 1, 20]
}




