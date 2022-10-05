package day_50_CollectionCont;

import java.util.Arrays;
import java.util.Vector;

public class VectorStudy {
    public static void main(String[] args) {

        Vector<String>vec =new Vector<>();
        vec.add("nn");
        System.out.println("vec.size() = " + vec.size());
        System.out.println("vec = " + vec); // vec = [nn]

        // addAll
        vec.addAll(Arrays.asList("aa","ab","ddd","al","aa","nn"));
        System.out.println("vec = " + vec); // [nn, aa, ab, ddd, al, aa, nn]

        // addElements()
        vec.addElement("tc");
        System.out.println("vec = " + vec); // [nn, aa, ab, ddd, al, aa, nn, tc]

        // capacity()
        System.out.println("vec.size() = " + vec.size()); // vec.size() = 8
        System.out.println("vec.capacity() = " + vec.capacity()); // vec.capacity() = 10

        // clear()
//        vec.clear();
//        System.out.println("vec = " + vec);   []

        // clone
        Object clone=vec.clone();
        System.out.println("vec.clone() = " + vec.clone()); // nesneye atamadan da yapılıyormuş..
        System.out.println("clone = " + clone);

        // contains()
        System.out.println("vec.contains= " + vec.contains("nn"));

        // containsAll()
        System.out.println("vec.containsAll(Arrays.asList(aa,tc)) = "
                + vec.containsAll(Arrays.asList("aa", "tc")));

        // copyInto()
        String[] strings=new String[9]; // collection nı bir arrayin üzerine yazacaksak
        // (kopyalayacaksak eğer) collectionın nın indexi ile ya eşit yada fazla olmalı, düşük olmamalı
        strings[0]="1";
        vec.copyInto(strings);
        System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings));
              // [nn, aa, ab, ddd, al, aa, nn, tc, null]
        System.out.println("------------------------------------");
        // ensureCapacity()
        System.out.println("vec.capacity() = " + vec.capacity());  // 10
        vec.ensureCapacity(20);
        System.out.println("vec.capacity() = " + vec.capacity());  // 20

        // trimToSize()
        vec.trimToSize();
        System.out.println("vec.capacity() = " + vec.capacity());

        // set()
        vec.set(2,"ccc");
        System.out.println("vec = " + vec);

        // setElementAt
        vec.setElementAt("cccc",2);
        System.out.println("vec = " + vec);

    }
}
