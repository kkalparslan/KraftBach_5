package Day_16_Summary;

public class Star {
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
        //System.out.println("lütfen bir sayı giriniz");
        //int sayi= scan.nextInt();
        //System.out.println("basamakSayisi = " + basamakSayisi(sayi));
        // benim yıldız pramit çalışmam

        for (int i = 0; i < 8; i++) {
            for (int b = 0; b < 8 - i ; b++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//System.out.println("mathPow = " + mathPow(5,3));
//System.out.println("ebob = " + ebob(7,8));
//amstrong(100, 999);
//fibonacci(15);

// }

    /*public static int basamakSayisi(int sayi) {
        int basamak = 0;
        while (sayi > 0) {
            sayi /= 10;
            basamak++;
        }
        return basamak;
    }

    public static int mathPow(int taban, int us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }

    public static void amstrong(int start, int end) {
        for (int i = start; i < end; i++) {
            int x, y, z, sonuc;
            x = i / 100;
            y = i % 100 / 10;
            z = i % 10;
            sonuc = x * x * x + y * y * y + z * z * z;
            if (i == sonuc) {
                System.out.print(sonuc + "  ");
            }

        }
    }

    public static void fibonacci(int adet) {
        int x = 0, y = 1;
        System.out.print(x + " " + y);
        for (int i = 2; i < adet; i++) {
            int z = y + x;
            System.out.print(" " + z);
            x = y;
            y = z;
        }
    }

    public static int ebob(int x, int y) {
        int sonuc = 1;
        for (int i = 1; i <= minumumSayi(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                sonuc = i;
            }
        }
        return sonuc;
    }

    public static int minumumSayi(int x, int y) {
       /* if (x >= y) {
            return y;
        } else {
            return x;
        }*/
//        int minumum = (x > y) ? x : y;
//        return minumum;

//}










