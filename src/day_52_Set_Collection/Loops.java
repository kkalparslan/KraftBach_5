package day_52_Set_Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Loops {
    public static void main(String[] args) {
        Integer [] arr={1,2,3,4};
        Set<Integer> set=new TreeSet<>(Arrays.asList(arr));

      /*  for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int i=0;
        while (i<arr.length){
            System.out.println(arr[i]);
            i++;
        }
        do {
            System.out.println(arr[i]);
            i++;
        }while (i<arr.length);

        for (Integer num:set){
            System.out.println(num);
        }
        Iterator<Integer>iter=set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        */
        set.forEach(p-> System.out.println(p));// lambda expression


    }
}
