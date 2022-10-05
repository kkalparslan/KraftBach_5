package day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class OdevSorusu_1 {
    public static void main(String[] args) {
        //"bir berber bir berbere gel beraber bir berber dükkanı açalım demiş"
        String str = "bir berber bir berbere gel beraber bir berber dükkanı açalım demiş";
        String[] strArray = str.split(" ");
        System.out.println(Arrays.toString(strArray));
        List<String> strList = Arrays.asList(strArray);
        System.out.println("strList = " + strList);

        // ödev 1: List içerisindeki polindrom kelimeleri list içerisinden silen metodu yazınız.
        // List<String>
        // ey edip adanada pide ye --> ey edip pide ye çıktı
        List<String> list = new ArrayList<>(Arrays.asList("adanada", "ankarada", "efe", "metin"));
        System.out.println(removePalindromListWithIterable(list));


        List<String> list1 = new ArrayList<>(Arrays.asList("ey edip adanada pide ye"));
    }

    public static List<String> removePalindromList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(reversePalindrom(list.get(i)))) {
                list.remove(list.get(i));
            }
        }
        return list;
    }
    public static List<String> removePalindromListWithIterable(List<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals(reversePalindrom(str))) {
                iter.remove();
            }
        }
        return list;
    }
    public static String reversePalindrom(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;


    }
}
