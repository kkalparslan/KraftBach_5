package Day_14;

import java.util.Scanner;

public class  MethodsDays_2 {
    public static void main(String[] args) {
//yasHesapla(1979);
//kuvvet(5,3);
        // sumOf(7,8);
//calculater(7,8,"/");

sum(5,4);
        System.out.println(sum(5,4));
        int sonuc=sum(5,4);
        System.out.println("sonuc=" + sonuc);
        int yeniSonuc=sonuc+3;
        System.out.println(yeniSonuc);
        calculater(yeniSonuc,8,"*");

    }
    public static void yasHesapla(int born) {
        System.out.println(2022 - born);
    }
    public static void kuvvet(int a, int b) {
        double pow = Math.pow(b, a);
        System.out.println(pow);
    }
    public static void sumOf(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public static void calculater(double a, double b, String c) {
        if (c.equals("+")) {
            System.out.println(a + b);
        }else if(c.equals("-")){
            System.out.println(a-b);
        }else if(c.equals("*")){
            System.out.println(a*b);
        }else if(c.equals("/")){
            System.out.println(a/b);
        }else{
            System.out.println("matematiksel bir operatör yoktur");
        }
    }
public static int sum(int a, int b){
        return a+b;



            }
    }












