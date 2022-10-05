package day_52_Set_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set<Integer>set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer>set2=new HashSet<>(Arrays.asList(4,5,6,7,8));

        //union 1 2 3 4 5 6 7 8 birleşim
//        set1.addAll(set2);
//        set1.forEach(p-> System.out.print(p+" "));

        // ıntersection kesişim  4 5
//        set1.retainAll(set2);
//        set1.forEach(p-> System.out.print(p+" "));

        // difference items (fark)
//        set1.removeAll(set2);
//        set1.forEach(p-> System.out.print(p+" ")); // 1 2 3
        set2.removeAll(set1);
        set2.forEach(p-> System.out.print(p+" ")); // 6 7 8





    }
}
