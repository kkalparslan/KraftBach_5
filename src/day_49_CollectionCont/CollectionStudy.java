package day_49_CollectionCont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionStudy {
    public static void main(String[] args) {
        ArrayList<Integer> lst1=new ArrayList<>();
        List<Integer>lst2=new ArrayList<>(); //polymorphic way
        Collection<Integer> col=new ArrayList<>();
        // adding element/object/item
        col.add(5); col.add(15); col.add(25); col.add(20); col.add(50);
        System.out.println(col);

        // getting size
        System.out.println("size= " + col.size());

        // remove items
        col.remove(15);
        System.out.println("col = " + col); //col = [5, 25, 20, 50]
        System.out.println("col.remove(100) = " + col.remove(100)); // false. çünkü böyle bir nesne yok
        col.add(5); col.add(80);  // col = [5, 25, 20, 50, 5, 80]
        System.out.println("col = " + col);
        col.remove(5); // col = [25, 20, 50, 5, 80] ilk gördüğü beşi remove etti. verilen
                          // değerin kendisini remove ediyor index değil
        System.out.println("col = " + col);

        // contains item
        System.out.println("contains(50) = " + col.contains(50));  // true
        System.out.println("contains(1000) = " + col.contains(1000));  // false

        // checking empty or not
        System.out.println("isEmpty() = " + col.isEmpty());  // false  bunu framework lerde yoğun olarak kullanıyormuşuz.
                                                             // eğer boşsa yeni nesneyi oraya ata gibi
        // remove all
 //       col.removeAll(col);
 //       col.removeAll(Arrays.asList(50,500)); // remove yapılmak istenen collection nın eşleşen
                                                // elemanları remove edilir. diğerleri dikkate alınmaz.
                                                // sonu ..All ile biten methodlarda tek bir nesne değil
                                                // başka bir collection parametre olarak isteniyor
        System.out.println("col = " + col);

        // adding all
        col.addAll(Arrays.asList(60,70,90));    // Arrays.asList hazır metodu ile de hemen farklı bir
                                                // collection (üretebiliyor) oluşturabiliyoruz.
        System.out.println("col = " + col);

        // containsAll
         System.out.println(col.containsAll(Arrays.asList(25, 200))); // true dönmesi için yapılan kontrolde
                                                     // her iki değeri de bulmalıdır. biri yanlışsa false dödürüyor

        // retainAll  [25, 20, 50, 5, 80, 60, 70, 90]
        // col.retainAll(Arrays.asList(20,25));
        // System.out.println(col.retainAll(Arrays.asList(200, 250))); // girilen değerler mevcut collection de yoksa
                                                                       // hepsini atıp boş bir collection döndürüyor.
        System.out.println("col = " + col);

        // turning to array  [25, 20, 50, 5, 80, 60, 70, 90]
        // Integer [] toArray=col.toArray(new Integer[0]);// çevireceğimiz collectionın sizeından daha küçük veya eşit
                                                          // bir değer girilirse aynı collectionı yine döndürüyor,,
                                                          // büyükse fazla değerleri null olarak veriyor..
        Integer [] toArray=col.toArray(new Integer[11]);  // [25, 20, 50, 5, 80, 60, 70, 90, null, null, null]
        System.out.println("array: "+Arrays.toString(toArray));
    }
}
