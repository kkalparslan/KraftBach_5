package day_54_CollectionCont;

import java.util.*;

public class NavigableSetStudy {
    public static void main(String[] args) {
        //SortedSet<Integer> intSortedSet=new TreeSet<>();
        //  Set<Integer>intSortedSet=new TreeSet<>();
        NavigableSet<Integer> intSortedSet=new TreeSet<>();

        intSortedSet.add(2);
        intSortedSet.add(40);
        intSortedSet.add(2);
        intSortedSet.add(10);
        intSortedSet.add(50);
        intSortedSet.add(20);
        intSortedSet.add(30);
        intSortedSet.add(35);
        System.out.println("intSortedSet = " + intSortedSet); // [2, 10, 20, 30, 35, 40, 50]
                                                             // sıralanmış olarak geliyor treesetlerde

        // lower()
        System.out.println("lower(35) = " + intSortedSet.lower(35)); // 30 bir düşüğünü veriyor

        // higher()
        System.out.println("higher(35) = " + intSortedSet.higher(35)); //  40 bir üstünü veriyor

        // floor()
        System.out.println("floor(35) = " + intSortedSet.floor(35)); // 35 girilen değerin bir altındaki paremetreyi
                                                       //  veriyor. tam değer veriliyorsa o değeri taban olarak veriyor
        // ceiling()
        System.out.println("ceiling(35) = " + intSortedSet.ceiling(35)); // 40 girilen değerin bir üstündeki paremetreyi
                                                                     //  veriyor. tam değer girilirse floor gibi kandisini veriyor.
        // poolFirst()
        //intSortedSet.clear();
        System.out.println("intSortedSet = " + intSortedSet); // [2, 10, 20, 30, 35, 40, 50]
        System.out.println("first() = " + intSortedSet.first()); // 2
        System.out.println("intSortedSet = " + intSortedSet);
        System.out.println("pollFirst() = " + intSortedSet.pollFirst()); // 2
        System.out.println("intSortedSet = " + intSortedSet); // [10, 20, 30, 35, 40, 50] pollfirst ün first ten
                                                              // farkı parametreyi döndürürken hem de atıyor
        // pollLast()
        System.out.println("pollLast() = " + intSortedSet.pollLast()); // 50
        System.out.println("intSortedSet = " + intSortedSet); // [10, 20, 30, 35, 40] hem verdi hemde sildi..

        // descendingSet()
        intSortedSet.addAll(Arrays.asList(30,60,70,80));
        System.out.println("intSortedSet = " + intSortedSet); // [10, 20, 30, 35, 40, 60, 70, 80]
        System.out.println("descendingSet() = " + intSortedSet.descendingSet()); // [80, 70, 60, 40, 35, 30, 20, 10]

        // subSet() [10, 20, 30, 35, 40, 60, 70, 80]
        System.out.println(intSortedSet.subSet(30, true, 70, false));
        // [30, 35, 40, 60]

        // headSet()
        System.out.println("headSet(40,false) = " + intSortedSet.headSet(40, false));
        // [10, 20, 30, 35]

        // tailSet()
        System.out.println("tailSet(40,false) = " + intSortedSet.tailSet(40, false));
        // [60, 70, 80]

        System.out.println("intSortedSet = " + intSortedSet); // [10, 20, 30, 35, 40, 60, 70, 80]

        Iterator<Integer>iterator=intSortedSet.iterator();
        while (iterator.hasNext()){
             Integer next=iterator.next();
             if (next>39){
                 iterator.remove();
             }
            }System.out.println(intSortedSet); // [10, 20, 30, 35]

        }


    }

