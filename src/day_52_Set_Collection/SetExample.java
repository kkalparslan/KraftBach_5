package day_52_Set_Collection;

import java.util.HashSet;
import java.util.Set;

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
        System.out.println("set = " + set);
    }
}
