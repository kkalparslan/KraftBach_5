package day_48_Collections;

import java.util.Vector;

public class Vector_Example {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("alparslan");
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("alparslan");
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("alparslan");

        System.out.println("vector.capacity() = " + vector.capacity());
        System.out.println("vector.size() = " + vector.size());
        System.out.println("vector.contains(\"apo\") = " + vector.contains("apo"));
        System.out.println("vector.elementAt(11) = " + vector.elementAt(11));
        System.out.println("vector.firstElement() = " + vector.firstElement());
        System.out.println("vector.get(\"mehmet\") = " + vector.get(7));
        vector.insertElementAt("azra", 9);
        System.out.println("vector.get(9) = " + vector.get(9));
    }
}
