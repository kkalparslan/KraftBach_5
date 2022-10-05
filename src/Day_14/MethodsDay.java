package Day_14;

import java.util.Scanner;

public class MethodsDay {
    public static void main(String[] args) {


        //message();
        // aritmetik();
       // message5("cuma",12);

        //tahmin(1979);
        //hesap();
        //kilodöndürme();
        //sumOf(3,6);
        //calculater();
        //message3();
        //message2();
    }
    public static void message() {
        message2();
    }
    public static void message2() {
        message3();
    }
    public static void message3() {
        System.out.println("message 3 ten merhaba dünya");
    }

    public static void aritmetik() {

        int a = 5, b = 7, c = 9;
        System.out.println("a+b+c nin aritmetik ortalaması " + (a + b + c) / 3 + " dır");
    }

    public static void hesap() {
        int a = 32, b = 20;
        int sonuc = a > b ? a : b;
        System.out.println(sonuc);
    }

    public static void kilodöndürme() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kg giriniz");
        double kilo = scan.nextDouble();
        double sonuc = kilo / 1.282;
        System.out.println(kilo + " kg= " + sonuc + " okkadır");
    }

    public static void number() {
        Scanner scan = new Scanner(System.in);

        System.out.println("iki sayı giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
    }

    public static void message5(String str, int i) {
        System.out.println("bugün  ayın " + i + " si " + str+" dır");
    }

    public static void tahmin(int born) {
        System.out.println(2022 - born);
    }

    public static void hesap(int a, int b) {
        double pow = Math.pow(b, a);
        System.out.println(pow);

    }

    public static void sumOf(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));

    }

    public static void calculater(int a, String b, int c) {
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextLine();
        c = scan.nextInt();
        System.out.println(a + c);

    }

}


