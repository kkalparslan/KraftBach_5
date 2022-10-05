package day_49_CollectionCont;

import java.util.*;

public class ListStudy {
    public static void main(String[] args) {
        List<Integer> lst=new LinkedList<>(Arrays.asList(10,70,50,40,100));
        System.out.println(lst);  // [10, 70, 50, 40, 100]
        // accessing items
        System.out.println("get(0) = " + lst.get(0)); // get(0) = 10

        // adding items with index
        lst.add(0,11); // [11, 10, 70, 50, 40, 100]
        System.out.println("lst = " + lst);
        System.out.println("lst.get(0) = " + lst.get(0)); // lst.get(0) = 11

        // updating elements
        lst.set(0,10);  // [10, 10, 70, 50, 40, 100]
        System.out.println(lst);

        // getting index of item
        System.out.println("lst.indexOf(10) = " + lst.indexOf(10));
        System.out.println("lst.indexOf(40) = " + lst.indexOf(40));
        System.out.println("lst.indexOf(1000) = " + lst.indexOf(1000)); // -1  olmayan değer de -1 veriyor

        // remove with index
        lst.remove(0); // [10, 70, 50, 40, 100]
        System.out.println("lst = " + lst);

        // addAll
        lst.addAll(Arrays.asList(60,80)); // [10, 70, 50, 40, 100, 60, 80]
        System.out.println("lst = " + lst);
        lst.addAll(2,Arrays.asList(30,90)); // [10, 70, 30, 90, 50, 40, 100, 60, 80]
        System.out.println("lst = " + lst);

        // sort
      //  lst.sort(null);
        System.out.println("lst = " + lst); // [10, 30, 40, 50, 60, 70, 80, 90, 100]
        //lst.sort(Comparator.naturalOrder());
        System.out.println("lst = " + lst);
        lst.sort(Comparator.reverseOrder());  // [100, 90, 80, 70, 60, 50, 40, 30, 10]
        System.out.println("lst = " + lst);

        // sublist (from, to)
        System.out.println("subList(2,6) = " + lst.subList(2, 6));
        List<Integer> subList3_8=lst.subList(3,8); // subList(2,6) = [80, 70, 60, 50]
        System.out.println("subList3_8 = " + subList3_8); // [70, 60, 50, 40, 30]
        System.out.println("lst = " + lst);
        subList3_8.set(1, 555);  // lst = [100, 90, 80, 70, 555, 50, 40, 30, 10]
        System.out.println("subList3_8 = " + subList3_8);
        System.out.println("lst = " + lst);
        lst.set(5,556);
        System.out.println("lst = " + lst);
        System.out.println("subList3_8 = " + subList3_8);
       // lst.set(1,550);  // [100, 550, 80, 70, 555, 556, 40, 30, 10]
        System.out.println("lst = " + lst);
        System.out.println("subList3_8 = " + subList3_8); // [70, 555, 556, 40, 30] sublist in
                                                          // kapsamı dışındaki değişiklik onu etkilemiyor
        System.out.println("---------------------------------------------------------");
        //list iterator
        // [100, 90, 80, 70, 555, 556, 40, 30, 10]
        ListIterator<Integer> listIterator= lst.listIterator();
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());
       // System.out.println("listIterator.next() = " + listIterator.next());
        while (listIterator.hasNext()){
            Integer next=listIterator.next();
            System.out.println(next);
            if (next>40){
                listIterator.remove();
            }
        }
        System.out.println(lst);  // [40, 30, 10]
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());
        System.out.println("listIterator.hasPrevious() = " + listIterator.hasPrevious());
       // System.out.println("listIterator.previous() = " + listIterator.previous());
        while (listIterator.hasPrevious()){
            Integer previous = listIterator.previous();
            if (previous<40){
//                listIterator.remove(); // [40]
//                listIterator.set(2022); // [40, 2022, 2022]
                listIterator.add(333);
            }
        }
        System.out.println(lst);










    }
}















