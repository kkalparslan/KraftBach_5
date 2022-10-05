package day_49_CollectionCont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {
        Collection<Integer> cll = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 20));
        System.out.println("cll = " + cll);
//        for (Integer each:cll) {
//            System.out.println(each);
//            if(each>5){
//                cll.remove(each);
//            }
//        }  // we can not use remove or update item
        Iterator<Integer> myIter = cll.iterator();
        // next
        System.out.println("myInter.next() = " + myIter.next());
//        System.out.println("myInter.next() = " + myIter.next());
//        System.out.println("myInter.next() = " + myIter.next());

//        // remove
//        myIter.remove(); // [5, 7, 10, 20] 1. indexteki 3 ü attı
        // myIter.remove(); remove() dan önce next yapılmadığı için hata verir
//        System.out.println("cll = " + cll);
//        myIter.next();
//        myIter.remove();
//        System.out.println("cll = " + cll);


// [3, 5, 7, 10, 20]
        while (myIter.hasNext()) {
            Integer next = myIter.next();
            System.out.println(next);
            if (next>5){
                myIter.remove();
            }
        }
        System.out.println("cll = " + cll);
        System.out.println("myIter.hasNext() = " + myIter.hasNext()); // artık iteratör bitti
        Iterator<Integer> ıterator = cll.iterator(); // 3 ve 5 için yeni bir iterasyona tabi tutmam lazım
        System.out.println("ıterator.hasNext() = " + ıterator.hasNext()); // yine başa döndüğümüz için true verdi
        System.out.println("ıterator.next() = " + ıterator.next());
        ıterator.remove();
        System.out.println("cll = " + cll);


    }
    }

