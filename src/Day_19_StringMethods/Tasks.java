package Day_19_StringMethods;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        // System.out.println("counterOfChar(s) = " + counterOfChar(s));
        //System.out.println("fullNameLength() = " + fullNameLength());
        // System.out.println("fullNameUpper() = " + fullNameUpper());
        //System.out.println("lastIndex() = " + lastIndex());
        //charInTheColumn();
        //System.out.println(takeAndReturn("        yoruldum         "));
        //System.out.println(dateStomp("18/08/2022 21:32:45"));

    }
    public static int counterOfChar(String s) {
        return s.length();
    }
    public static int fullNameLength() {  // isim soy isim toplam length örneğini yap sonra..
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        return s1.length() + (s2.length());
    }
    public static String fullNameUpper() {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        return s1.toUpperCase().concat(s2.toUpperCase());


    }
    public static char lastIndex() {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        return s1.charAt(s1.length() - 1);
    }
    public static void charInTheColumn() {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));

        }
    }
    public static String takeAndReturn(String mesaj) {
        String str = mesaj;

        return str.trim();
    }
    public static String dateStomp(String str) {
        // 18/08/2022 21:32:45
        String replace= str.replace("/","");
        String replace1=replace.replace(" ","");
        return replace1.replace(":","");
    }


}


