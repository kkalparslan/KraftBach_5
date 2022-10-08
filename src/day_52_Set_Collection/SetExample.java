package day_52_Set_Collection;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

     /*   Set<Integer>set=new HashSet<>();
        set.add(5);
        set.add(35);
        set.add(45);
        set.add(26);
        set.add(5);// yinelenen verileri almıyor
        System.out.println("set = " + set); // [35, 5, 26, 45]*/
        Set<String>set=new HashSet<>();
        set.add("ahmet");
        set.add("35");
        set.add("ahmet"); // yinelenen verileri almıyor
        set.add("mehmet");
        set.add("kemal");
        set.add("azra");
      //  System.out.println("set = " + set);

        // örnek soru: aşağıdaki cümlede hangi harfler vardır?..
//        String str= "bugün eve çok geç geldim, ama kendimi çok mutlu hissediyorum";
//        str=str.replaceAll(" ","").replaceAll(",","");
//        String [] stringArray=str.split("");
//        Set<String>hashSet=new HashSet<>(Arrays.asList(stringArray));
//        Set<String>treeSet=new TreeSet<>(Arrays.asList(stringArray));
//        for (int i = 0; i < stringArray.length; i++) {
//            mySet.add(stringArray[i]);
//        }
//        System.out.println("hashSet= "+hashSet); // hash koduna göre sıralama yapıyor.
//                                                 // verileri giriş sırasına göre sıralamıyor
//        System.out.println("treeSet = " + treeSet); // verileri giriş sırasına göre sıralamıyor ancak
                                                    // tree map e göre artan bir sıralama yapıyor


        Integer [] arr={47,1,8,2,32,3,6,8,24,11,43,2,0,9,5};
        Set<Integer>hashSet=new HashSet<>(Arrays.asList(arr));
        Set<Integer>treeSet=new TreeSet<>(Arrays.asList(arr));
        System.out.println(hashSet); // [32, 0, 1, 2, 3, 5, 6, 8, 9, 11, 43, 47, 24] hash tablosuna göre sıraladı
        System.out.println(treeSet); // [0, 1, 2, 3, 5, 6, 8, 9, 11, 24, 32, 43, 47] dahili treeM ape göre sıraladı


//        stem.out.println("myList = " + myList);

        // örnek soru: "mavi gömlek ürün kodu:4325, beyaz gömlek ürün kodu:1542..........
        // ürün kodlarına göre sıralayınız..(samsung) interview sorusu



    }
}
