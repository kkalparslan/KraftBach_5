package day_51_ListAndSet;

import java.util.*;

public class OdevSorusu_2 {
    public static void main(String[] args) {
        // ödev 2: List içerisindeki polindrom kelimeleri list içerisinden her iki kelimeyi silen metodu yazınız.
        // List<String>
        // ey edip adanada pide ye --> ey edip pide ye çıktı
        List<String>list=new ArrayList<>(Arrays.asList("ey", "edip", "adanada", "kibik", "bir", "kek", "sos", "pide", "ye"));
       // System.out.println(clearAllPalindrom(list));
        Random random = new Random();
//        int rastgeleSayi=random.nextInt(list.size());
//        list.forEach(p-> System.out.println(p));
        Iterator<String> iter=list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        //System.out.println("list.get(rastgeleSayi)  " + list.get(rastgeleSayi));

    }

    public static List<String> clearAllPalindrom(List<String>list){
            for (int i = 0; i < list.size(); ) {
            String str=reversePalindrom(list.get(i));
            if(list.contains(str)){
                list.removeAll(Arrays.asList(list.get(i),str));
                continue;
            }i++;
        }return list;
    }
    public static String reversePalindrom(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}

