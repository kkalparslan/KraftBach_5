package day_44_OOP_ReviewCont.finalKeyword;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalArrayAndArraylist {
    public static void main(String[] args) {
        final String [] BATCH2={" Talip", "Alparslan"};
        BATCH2[0]="İbrahim";
        System.out.println(Arrays.toString(BATCH2));
       // BATCH2=new String[]{"Ali","Mehmet"}; BATCH2 final array olduğu için referansı değiştirlemez.
        System.out.println("----------------------------");

        ArrayList<String>NAME =new ArrayList<>();
        NAME.add("ihsan");
        NAME.add("enes");
        NAME=new ArrayList<>(); // FİNAL OLDUĞU İÇİN REFERANSI DEĞİŞTİLEMEZ.
    }

}
