package benimCalismalar_2;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 10;
        int max = 20;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println(randomNum);
    }

    /**
     nextInt() metodu, 0 ile belirtilen sınır (dahil değil) arasında rastgele bir tamsayı döndürür.
     Ancak bizim ihtiyacımız olan sayı 10 ile 20 arasında olmalı. Bu nedenle, (max - min) + 1 ifadesi kullanılır.
     Burada max ve min değerleri arasındaki farkı hesaplarız. Bu farkı, 1 ile toplayarak belirtilen aralıktaki sayıların
     sayısını elde ederiz. Daha sonra, bu sayı aralığında rastgele bir sayı seçmek için nextInt() metoduna bu sayıyı
     geçiririz. Ancak seçilen rastgele sayı, min değerine eklenmelidir, böylece sayı aralığı 10 ile 20 arasında kalır.
     Bu nedenle, min değeri seçilen rastgele sayıya eklenir.Sonuç olarak, randomNum değişkenine atanacak
     olan ifade (max - min) + 1 değerini üretir, bu değer belirtilen aralıktaki sayıların sayısını temsil eder.
     rand.nextInt((max - min) + 1) ifadesi ile bu sayı aralığından rastgele bir sayı seçilir ve son olarak,
     min değeri eklenir. Bu nedenle, randomNum değişkeni 10 ile 20 arasında bir rastgele tam sayıyı temsil eder.
     */
}
