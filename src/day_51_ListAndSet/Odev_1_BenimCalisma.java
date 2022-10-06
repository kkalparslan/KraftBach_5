package day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Odev_1_BenimCalisma {
    public static void main(String[] args) {
        //List içerisindeki polindrom kelimeleri list içerisinden silen metodu yazınız.
        // List<String>
        // ey edip adanada pide ye --> ey edip pide ye çıktı
        List<String>list=new ArrayList<>(Arrays.asList("ey", "edip", "adanada", "kek", "sos", "pide", "ye"));
        System.out.println(removePalindromList(list));
        System.out.println(removePalindromListWithIterable(list));

        List<String>list2=new ArrayList<>(Arrays.asList("efe", "ala", "kala", "kayak", "ala","beb", "mim"));
        System.out.println(removePalindromList(list2));
        System.out.println(removePalindromListWithIterable(list2));

    }
    public static List<String> removePalindromList(List<String>list){
        for (int i = 0; i < list.size(); ) {
            if (list.get(i).equals(reversePalindrom(list.get(i)))){
                list.remove(list.get(i));
                continue;
            }i++;
        }
        return list;
    }
    public static List<String> removePalindromListWithIterable(List<String>list){
         Iterator<String> iter=list.iterator();
         while (iter.hasNext()){
             String str=iter.next();
             if(str.equals(reversePalindrom(str))){
                 iter.remove();
             }
         }
         return list;
    }

    public static String reversePalindrom(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
           }
        return result;
    }

}
