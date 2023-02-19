package Day_1_BenimCalismalarim;

public class Deneme111 {
    public static void main(java.lang.String[] args) {

//        int a=50;
//        int b=90;
//        int c=40;
//
//        if (a+b+c==180){
//            if (a==90 || b==90 || c==90){
//                System.out.println("Bu bir dik üçgendir");
//            }else {
//                System.out.println("Bu bir dik üçgen DEĞİLDİR");
//            }
//
//        }else {
//            System.out.println("iç açıları toplamı 180 derece olmadığından bu bir üçgen değildir");
//        }

        //class Main {
//        for (int i = 101; i < 199;i++ ) {
//            System.out.println(i+(i+1));
//
//        }

//        int sum = 0;
//        int m = 101;
//
//        while (m<200) {
//
//            sum = sum + m;
//
//            m++;
//        }
//        System.out.println(sum);

//        }
//        public static  int tamBolen(int a){
//        int count;
//            for (int i = 0; i < a; i++) {
//                if((i%2==0) && (i%3==0) && (i%5==0) && (i%7==0)){
//                    System.out.println(i+" ");
//                }
//
//            }

//        int deger = 60;
//        int bolen = 1;
//        int tamBolenlerToplami = 0;
//        while(bolen <= deger) {
//            if(deger%bolen == 0) {
//                System.out.println(deger+" sayısı "+bolen+" sayısına tam bölünür.");
//                tamBolenlerToplami = tamBolenlerToplami+bolen;
//            }
//            bolen++;
//        }
//        System.out.println("\n"+deger+" sayısının tam bölenlerinin toplamı: "+tamBolenlerToplami);


//        int sonuc =0;
//
//        int sayi = 500;
//
//        while (sayi>0) {
//
//            sonuc = sonuc + sayi%10;
//
//
//            sayi = sayi /10;
//            String stdAges [] = new String[7];
//            String str="ahmet";
//            str.length();

//            int stdAges [] = new int[7]; //[0, 0, 0, 0, 0, 0, 0]
//            System.out.println(Arrays.toString(stdAges));

        // Dizinin ilk elemanlarini atayalim
//        int[] arr = {3, 5, 2, 8, 1};
//
//        // Dizinin en kucuk ve en buyuk elemanlarini bulun
//        int min_elem = Integer.MAX_VALUE;
//        int max_elem = Integer.MIN_VALUE;
//        for (int i : arr) {
//            if (i < min_elem) {
//                min_elem = i;
//            }
//            if (i > max_elem) {
//                max_elem = i;
//            }
//        }
//
//        // En kucuk ve en buyuk elemanlarin toplamini hesaplayin
//        int total = min_elem + max_elem;
//
//        // Toplami ekrana yazdirin
//        System.out.println(total);

        // String tipinde bir dizi olusturun
        String[] names = new String[5];

        // Diziye isimler ekleyin
        names[0] = "Ali";
        names[1] = "Veli";
        names[2] = "Selami";
        names[3] = "Hayri";
        names[4] = "Mehmet";

        // Isimlerdeki karakter sayilarinin toplamini hesaplayin
        int total = 0;
        for (String name : names) {
            total += name.length();
        }

        // Toplami ekrana yazdirin
        System.out.println(total);
    }
    }



















