package Day_26_Arrays_Lab;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample_1 {
    public static void main(String[] args) {
//        String str="merhaba dünya";
//        System.out.println(str.replace("a", ""));
//        System.out.println(str);
//        int sayi2[]={84,3,8,14,25,32};
//        System.out.println(enKucukSayi(sayi2));
//        System.out.println(sayi2[0]);
        //System.out.println(Arrays.toString(enKucukSayiIleDoldur(sayilar)));
        //System.out.println(enKucukSayiIleDoldur(sayilar));
        //System.out.println(toplam(sayilar));
        //System.out.println(toplamCift(sayilar));
        //System.out.println(toplamUc(sayilar));
        //System.out.println(buyukKucukFark(sayilar));
        int[] sayilar = {1, 3, 4, 5, 7, 8};
        int[] sayilar2 = {3, 4, 5, 6, 7, 8, 9, 10};
        //arrayYazdir(araSayilariAta(5,9));
        //arrayYazdir(arrayBirlestirme(sayilar,sayilar2));
        //System.out.println(arrayKontrol(sayilar, sayilar2));
        //arrayYazdir(tersArray(sayilar));
        //arrayYazdir(rastgeleArrayUret(6));
        //arrayYazdir(rastgeleArray(10));
        //System.out.println(rastgeleArray125Kontrol(4000));
    }

    public static int enKucukSayi(int[] sayi) {
        Arrays.sort(sayi);
        return sayi[0];
    }

    public static int toplam(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    public static int toplamCift(int[] arr) {
        int result = 0;
        for (int sayi : arr) {
            if (sayi % 2 == 0) {
                result += sayi;
            }
        }
        return result;
    }

    public static int toplamUc(int[] arr) {
        int result = 0;
        for (int sayi : arr) {
            if (sayi == 3) {
                result += sayi;
            }
        }
        return result;
    }

    public static int buyukKucukFark(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int sayi : arr) {
            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }
        return max - min;
    }

    public static int[] enKucukSayiIleDoldur(int[] arr) {
        int[] yeniArray = new int[arr.length];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {               // for( int sayi: arr){
            // if ( sayi< min)
            // min=sayi;
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 0; i < yeniArray.length; i++) {
            yeniArray[i] = min;
        }
        return yeniArray;
    }

    public static void arrayYazdir(int[] arr) {
        for (int sayi : arr) {
            System.out.print(sayi + " ");
        }
    }

    public static void arrayYazdir(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

    public static void arrayYazdir(char[] arr) {
        for (char str : arr) {
            System.out.print(str + " ");
        }
    }

    public static void arrayYazdir(double[] arr) {
        for (double str : arr) {
            System.out.print(str + " ");
        }
    }

    public static int[] araSayilariAta(int a, int b) {
        int max = Math.max(a, b);
        if (max == a) {
            int[] yeniArray = new int[(a - b + 1)];
            for (int i = 0; i < yeniArray.length; i++) {
                yeniArray[i] = b + i;
            }
            return yeniArray;
        } else {
            int[] yeniArray = new int[(b - a + 1)];
            for (int i = 0; i < yeniArray.length; i++) {
                yeniArray[i] = a + i;
            }
            return yeniArray;
        }

    }

    public static int[] arrayBirlestirme(int[] arr, int[] arr2) {
        int[] newArray = new int[arr.length + arr2.length];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i < arr.length) {
                newArray[i] = arr[i];
            }
            if (i > arr.length - 1) {
                newArray[i] = arr2[j];
                j++;
            }
        }
        return newArray;
    }

    public static boolean arrayKontrol(int[] a, int[] b) {
        firstLoop:
        for (int i = 0; i < a.length; i++) {
            secondLoop:
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    continue firstLoop;
                }
                continue secondLoop;
            }
            return false;
        }
        return true;
    }

    public static int[] tersArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = newArray.length - 1, j = 0; j < newArray.length; i--, j++) {
            newArray[j] = arr[i];
        }
        return newArray;

    }

    public static int[] rastgeleArrayUret(int boyut) {
        Random random = new Random(100);
        int[] yenArry = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            yenArry[i] = random.nextInt(100);
        }
        return yenArry;

    }

    public static int[] rastgeleArray(int boyut) {
        Random random = new Random();
        int[] yenArry = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            yenArry[i] = random.nextInt(30) + 50;
        }
        return yenArry;
    }

    public static int rastgeleArray125Kontrol(int boyut) {
        Random random = new Random();
        int[] yenArry = new int[boyut];
        int count = 0;
        for (int i = 0; i < boyut; i++) {
            yenArry[i] = random.nextInt(20) + 120;
            if (yenArry[i] == 125) {
                count++;
            }
        }
        return count;
    }


}
