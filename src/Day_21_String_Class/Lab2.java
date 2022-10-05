package Day_21_String_Class;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        // System.out.println(firstThree("alparslan"));
        //System.out.println(boslukKaldir("alp öztürk ve emel"));
        // System.out.println(ikinciYari("alparslan"));
        //System.out.println(changeWord("alparslan", "a", "e"));
        //System.out.println(repeatThree("azra"));
        //System.out.println(harfSayisi("emine ceren", "e"));
       // System.out.println(kelimeSayisi("alparslan", "alp"));
        //System.out.println(harfTemizle("alparslan", "l"));
       //System.out.println(controlSentences("emine ceren", "emine "));
        //System.out.println(repeatThree("ali"));

    }
    public static String firstThree(String str) {
        if (str.length() < 3) {
            return str;

        } else {
            return str.substring(0, 3);
        }


    }
    public static String boslukKaldir(String str) {
        return str.replace(" ", "%");
    }
    public  static String ikinciYari(String str) {
        return str.substring(str.length() / 2);
    }
    public static String changeWord(String str, String old, String new1) {
        return str.replaceFirst(old, new1);
    }
    public static String repeatThree(String str) {
        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
               // result = result+str.charAt(i);
                result=result+str.charAt(i);
            }
        }
        return result;
    }
    public static int harfSayisi(String str, String target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase(target)) {
                count++;
            }
        }
        return count;


    }
    public static int kelimeSayisi(String str, String target) {
        int count = 0;
        for (int i = 0; i < str.length() - (target.length() - 1); i++) {
            String result = str.substring(i, i + target.length());
            if (str.substring(i, i + target.length()).equalsIgnoreCase(target)) {
                count++;
            }
        }
        return count;
    }
    public static String harfTemizle(String kelime, String harf) {
        return kelime.replace(harf, "");
    }
    public static boolean controlSentences(String kelime, String control) {
        return kelime.substring(0, control.length()).equalsIgnoreCase(control) ||
                kelime.substring(1, 1 + control.length()).equalsIgnoreCase(control);
    }

}
