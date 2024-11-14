package day_54_CollectionCont;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SortedSetStudy {
    public static void main(String[] args) {
        SortedSet<Integer> intSortedSet=new TreeSet<>();
        // Ascending /artan sıralama sağlar
        // dublicate not allowed
      //  Set<Integer>intSortedSet=new TreeSet<>();
      // NavigableSet<Integer>intSortedSet=new TreeSet<>();
        intSortedSet.add(2);
        intSortedSet.add(2);
        intSortedSet.add(10);
        intSortedSet.add(10);
        intSortedSet.add(10);
        System.out.println(intSortedSet); // [2, 10]

        System.out.println("intSortedSet.first() = " + intSortedSet.first());
        System.out.println("intSortedSet.last() = " + intSortedSet.last());

        intSortedSet.addAll(Arrays.asList(25,35,45));
        System.out.println("intSortedSet = " + intSortedSet); // [2, 10, 25, 35, 45]

        //System.out.println("intSortedSet.add(null) = " + intSortedSet.add(null)); // null değer almıyor..
        // [2, 10, 25, 35, 45]                                                      // null is not allowed
        // subSet()
        System.out.println("subSet(25,45) = " + intSortedSet.subSet(25, 45)); // 2. paremetreyi tam değer
        // girince substring gibi onu almıyortam değer. 2. değer için örneğin burada 25,46 diyebilirdik.ilk
        // değeri alıyor 2. değer için en az bir rakam değeri fazla istiyor  [25, 35]

        // headSet()
        System.out.println("headSet(35) = " + intSortedSet.headSet(35)); // [2, 10, 25] verilen
        // değere kadar olan paremetreleri alıyor. verilen değeri alması için yine en az bir değer yüksek
        // girmek gerekiyor. örneğin burada 36 girseydik 35 i de alacaktı.

        // tailSet()
        System.out.println("tailSet(35) = " + intSortedSet.tailSet(35)); // [35, 45]// burada
        // da verilen değeri taban gibi görüyor ve onunla birlikte daha büyü paremetreleri alıyor.

        SortedSet<Integer>myTailSet=intSortedSet.tailSet(25);
        System.out.println("myTailSet = " + myTailSet); // [25, 35, 45]
        System.out.println("myTailSet.remove(10) = " + myTailSet.remove(10)); // false
        System.out.println("myTailSet.remove(35) = " + myTailSet.remove(35)); // true

        System.out.println("myTailSet = " + myTailSet); // [25, 45]
        System.out.println("intSortedSet = " + intSortedSet); // [2, 10, 25, 45] buradan da 35 gitmiş oldu..

        SortedSet<Integer>myHeadSet=intSortedSet.headSet(25);
        System.out.println("myHeadSet = " + myHeadSet);
        System.out.println("myHeadSet.remove(25) = " + myHeadSet.remove(25));
        System.out.println("myHeadSet.remove(2) = " + myHeadSet.remove(2));
        System.out.println("intSortedSet = " + intSortedSet); // [10, 25, 45]
    }
}
