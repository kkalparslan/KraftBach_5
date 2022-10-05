package Day_22_String_Class_Cont;

import java.util.Arrays;
import java.util.Scanner;

public class Benim_Cözümler {
    public static void main(String[] args) {
        //System.out.println(unluUnsuz("Alparslan"));
        //System.out.println(ilkUcHarf("alparslan"));
        //System.out.println(sonUcHarf("alparslan"));
        //System.out.println(ilkBenzersiHarf("alparslan"));
        //System.out.println(ayniHarflerKontrol("kayak", "yakar"));
        //System.out.println(ardArdatekrarEdenHarf("alparrrssslan"));
        //System.out.println(ikiKelimeBirlestirme());
        //System.out.println(terstenOkunus("Kabak"));
        //System.out.println(kacDefaSevKontrol("sev seni seveni, sevmek güzeldir", "sev"));
        //System.out.println(bursaAnkaraKontrol("Bursa ile ankara çok bursa"));
        //System.out.println(sonuAcakKontrol("zamlanacak", "acak"));
        //System.out.println(harfKadarSayiKoy("emine ceren"));
        //System.out.println(enCokHarfDöndür("alparslan")); harun hocaya soralım..2. for döngüsü 0 yada 1 olunca
        // fark edermi


//        System.out.println("birinci kelimeyi giriniz");   // 3 defa hatalı girilen sorunun cevabı
//        String result="";
//        Scanner scan = new Scanner(System.in);
//        String str1 = scan.nextLine();
//        for (int i=0; i<1; i++) {
//            if (str1.length() > 4) {
//                System.out.println("hatalı,,,tekrar giriniz");
//            } else if(str1.length()>=1&&str1.length()<=3){
//                result += str1 + "";
//            }
//            String str2 = scan.nextLine();
//            if (str2.length() > 4) {
//                System.out.println("hatalı,,,tekrar giriniz");
//            } else {
//                result += str2 + "";
//            }
//            String str3 = scan.nextLine();
//            if (str3.length() > 4) {
//            } else {
//                result += str3 + "";
//            }
//            System.out.println("3. defa hatalı giriş yaptınız program sonlandırıldı");//
//        }
//            System.out.println("ikinci kelimeyi giriniz");
//            String str4 = scan.nextLine();
//            if (str4.length() > 4) {
//                System.out.println("hatalı,,,tekrar giriniz");
//                String str5 = scan.nextLine();
//                if (str5.length() > 4) {
//                    System.out.println("hatalı,,,tekrar giriniz");
//                    String str6 = scan.nextLine();
//                }
////            }
//            System.out.println(str1.concat(" ").concat(str4));
        }
//String str="merhaba java insanları bugün nasılsınız";


    // 15.SORU  Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    // ayrı ayrı ekrana yazan programı yazınız.
    // Ankara ünlü harfler=Aa       Ünsüz harfler=nkr
    public static String unluUnsuz(String str) {
        String unluHarf = "";
        str = str.toLowerCase();
        String unsuzHarf = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    unluHarf += str.charAt(i);
                    break;
                case 'e':
                    unluHarf += str.charAt(i);
                    break;
                case 'ı':
                    unluHarf += str.charAt(i);
                    break;
                case 'i':
                    unluHarf += str.charAt(i);
                    break;
                case 'o':
                    unluHarf += str.charAt(i);
                    break;
                case 'ö':
                    unluHarf += str.charAt(i);
                    break;
                case 'u':
                    unluHarf += str.charAt(i);
                    break;
                case 'ü':
                    unluHarf += str.charAt(i);
                    break;
                default:
                    unsuzHarf += str.charAt(i);
            }
        }
        return "ünlü harfler: " + unluHarf + " ünsüz harfler: " + unsuzHarf;

    }
    //    16. SORU Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
//    harfini kelimeden keserek sonuna ekleyin.
//            Merhaba habaMer
//    Ali Ali
    public static String ilkUcHarf(String str) {
        String sonuc = "";
        if (str.length() > 3) {
            sonuc += str.substring(3).concat(str.substring(0, 3));
        } else {
            sonuc += str + str;
        }
        return sonuc;
    }
    //    17. SORU Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
//    harfini kelimeden keserek kelimenin başına ekleyin.
//    Merhaba abaMerh   Ali Ali
    public static String sonUcHarf(String str) {
        String sonuc = "";
        if (str.length() > 3) {
            sonuc = str.substring(str.length() - 3).concat(str.substring(0, str.length() - 3));
        } else {
            sonuc += str + str;
        }
        return sonuc;
    }
    //    18. SORU Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
//    küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
//    ikazı versin.
//    Merhaba M    Araba r     Karkas rotası o
    public static String ilkBenzersiHarf(String str) {               // olmadı ilk harfi veriyor
        str = str.replace(" ", "").toLowerCase();
        String sonuc = "";
        for (int i = 0; i < str.length(); ) {
            if (!str.substring(1).contains(str.substring(0, 1))) {
                sonuc += str.substring(0, 1);
                return sonuc;
            }
            str = str.replace(str.substring(0, 1), "");
        }
        return sonuc;
    }
    //   Soru 19:  Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
//eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
//            yazdırın. (anagram kelime ise)
//    İftar – Tarif true    Zehra – Ezhar true    Nefes – Enfes true   Selcuk-Elyase false
    public static boolean ayniHarflerKontrol(String str1, String str2) {   // hep true dönüuor harf sayısı eşitse
        int count = 0;
        str1.toLowerCase();
        str2.toLowerCase();
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int k = 0; k < str1.length(); k++) {
                    if (str1.charAt(i) == str2.charAt(k)) {
                        count++;
                        if (count == str1.length()) {
                            return true;
                        }
                    }
                }
            }

        }
        return false;
    }
    //    SORU 20: Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
//    yazın.
//            aabccccseeeeeefff acef
//    abaccb c
//    Arsız ardı ardına tekrar eden harf yoktur
//    amannsız n
    public static String ardArdatekrarEdenHarf(String str) {
        String str1 = str.toLowerCase();
        String sonuc = "";
        while (!str1.isEmpty()) {
            if (str1.substring(1).contains(str1.substring(0, 1))) {
                sonuc += str1.substring(0, 1);
            }
            str1 = str1.replace(str1.substring(0, 1), "");
        }
        return sonuc;
    }
    //    SORU 21: Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
//    girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
//    Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
//    giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
//    birleştirerek yazdırın.Slm
//            Ali                       Slm Ali
//    public static String ikiKelimeBirlestirme() {
//        String str3 = "Hakkiniz dolmustur. Program kapaniyor.";
//        Scanner scan = new Scanner(System.in);
//        System.out.println("birinci kelime giriniz : ");
//        String word = scan.nextLine();
//
//        if (word.length() >= 1 && word.length() <= 4) {
//            System.out.println("ikinci kelime giriniz : ");
//            String word2 = scan.nextLine();
//            if (word2.length() >= 1 && word2.length() <= 4) {
//                return word.concat(" " + word2);
//            } else {
//                System.out.println("Hatali sayida karakter sayisi girdiniz tekrar giriniz :");
//                loop1:
//                for (int i = 0; i < 3; i++) {
//                    System.out.println("ikinci kelime giriniz : ");
//                    String word3 = scan.nextLine();
//                    if (word3.length() >= 1 && word3.length() <= 4) {
//                        return word.concat(" " + word3);
//                    } else {
//                        continue loop1;
//                    }
//                }
//            }
//        } else {
//            System.out.println("Hatali sayida karakter sayisi girdiniz tekrar giriniz :");
//            loop2:
//            for (int i = 0; i < 3; i++) {
//                String word4 = scan.nextLine();
//                if (word4.length() >= 1 && word4.length() <= 4) {
//                    System.out.println("ikinci kelime giriniz : ");
//                    String word2 = scan.nextLine();
//                    word2 = word2.toLowerCase();
//                    if (word2.length() >= 1 && word2.length() <= 4) {
//                        return word4.concat(" " + word2);
//                    } else {
//                        continue loop2;
//                    }
//                }
//            }
//        }
//        return str3;
//    }
    //    SORU 24: Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
    // true değil ise false döndüren metot yazınız.
    // Kabak true Nalan true Ara true talat true Kasaba false ahmet false
    public static boolean terstenOkunus(String str) {
        str = str.toLowerCase();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result.equals(str);

    }
    //    SORU 25:  Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
//    ekrana yazdırın.
//    Seni seviyorum 1  Sevmek veya sevmemek 2    Sev seni seveni , sevmek güzeldir. 3
    public static int kacDefaSevKontrol(String str, String target) {
        int count = 0;
        for (int i = 0; i < str.length() - target.length() - 1; i++) {
            String result = str.substring(i, i + target.length());
            if (str.substring(i, i + target.length()).equalsIgnoreCase(target)) {
                count++;
            }
        }
        return count;
    }
    //    SORU 26: Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı
//    sayılarda dönüyorsa false yazdıran metodu yazınız.
//    Ankara ile Bursa arası 500 km. True
//    Ankara Bursa kadar yeşil değil. Bursa bir başka. False
//    İstanbul çok uzak false
    public static boolean bursaAnkaraKontrol(String cümle) {  //bir harf hatalı veriyor
        cümle = cümle.toLowerCase();
        String[] str;
        str=cümle.split("ankara");
        int count = str.length;
        str = cümle.split("bursa");
        int count2 = str.length;
        return count == count2;
    }
    //    SORU 27: Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
//    döndüren metodu yazdırın.
//    Kullanacak true  Zamlanacak true Farkındalık false   Farkında false
    public static boolean sonuAcakKontrol(String kelime, String hedef) {
        return kelime.substring(kelime.length() - 4).equals(hedef);
    }
    //    SORU 28: Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
//    yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
//    Merhaba 1m1e1r1h2a1b    Seni seviyorum 2s2e1n2i1v1y1o1r1u1m
    public static String harfKadarSayiKoy(String kelime) {
        kelime=kelime.toLowerCase().replace(" ","");
        String sonuc = " ";
        for (int i = 0; i < kelime.length(); i++) {
            int count = 0;
            for (int k = 0; k < kelime.length(); k++) {
                if (kelime.charAt(i) == kelime.charAt(k)) {
                    count++;
                }
            }
            if (kelime.contains(sonuc)) {
                continue;
            }
            if (sonuc.contains("" + count + kelime.charAt(i))) {
                continue;
            }
            sonuc += "" + count + kelime.charAt(i);
        }
        return sonuc;
    }
    //    SORU 29: Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
//    Merhaba a    aaaaaaabbcccc a      eeemmmsssssssssshhhhhhhhhsss s
    public static String enCokHarfDöndür(String kelime) {
        String sonuc = "";
        int count;
        int adet=1;
        kelime=kelime.toLowerCase();
        for (int i = 0; i < kelime.length(); i++) {
            count=0;
            for (int k = 0; k < kelime.length(); k++) {
                if(kelime.charAt(i)==kelime.charAt(k)){
                    count++;
                }
            }if(count>adet){
                sonuc=kelime.charAt(i)+"";
                adet=count;
            }
        }
        return sonuc;
    }


}






