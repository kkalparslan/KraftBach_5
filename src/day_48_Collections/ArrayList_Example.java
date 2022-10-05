package day_48_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
       // Scanner scan=new Scanner(System.in);
        arrayList.add("ahmet");
        arrayList.add("mehmet");
        arrayList.add("ayşe");
        System.out.println(arrayList.get(1));
        System.out.println("ilk durum: "+arrayList.size());
        arrayList.add("ahmet");
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.remove(3));
        System.out.println("son durum: "+arrayList.size());
        System.out.println(arrayList.set(0, "alparslan"));
        System.out.println(arrayList.get(0));
        arrayList.add("emel");
        System.out.println(arrayList.get(0));
        arrayList.add("ali");
        arrayList.get(0);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.add("kemal");
        System.out.println(arrayList);
        arrayList.add(2,"suzan");
        System.out.println(arrayList);


    }
}
