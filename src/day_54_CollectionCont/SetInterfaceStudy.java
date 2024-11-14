package day_54_CollectionCont;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceStudy {
    public static void main(String[] args) {
        // unique item/ no dublicate
        // insertion ordering not preserved
        Set<Long> longSet=new HashSet<>();
        System.out.println(longSet.add(7l)); // true bu nokta itibari ile long türündeki 7
                                             // burada yok o halde true diyor ve ekliyor, yaz içeriye
        System.out.println(longSet.add(7l)); // false
        longSet.add(7l); // false
        longSet.add(7l); // false
        System.out.println(longSet.add(70l)); // true
        System.out.println(longSet.add(70l)); // false

        System.out.println("longSet = " + longSet);

        for (long each : longSet){ // nesne olan long değeri primitive long a çevirdik ve unboxing yaptık
            System.out.println("--> "+each);
        }
        longSet.addAll(Arrays.asList(2l,3l,4l,4l,4l));
        System.out.println(longSet); // [2, 3, 4, 70, 7]
        System.out.println(longSet.add(null));// true set içinde null değer olamdığı için "true" verdi
        System.out.println(longSet.add(null)); // false
        System.out.println(longSet); // [null, 2, 3, 4, 70, 7]

        if(!longSet.add(70l)){
            // item varsa false döndürür, ! (logical not) olduğu için true döner ve koda girerek if i çalıştırır.
            longSet.remove(70l);
        }
        System.out.println(longSet); // [null, 2, 3, 4, 7] 70 gitti..yukrıdaki remove dan dolayı
    }
}
