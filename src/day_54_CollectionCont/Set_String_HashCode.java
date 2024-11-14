package day_54_CollectionCont;

import java.util.HashSet;
import java.util.Set;

public class Set_String_HashCode {
    public static void main(String[] args) {
        System.out.println(new String("Murat").hashCode()); // 74709341
        System.out.println("Murat".hashCode()); // 74709341

        Set<String>stringSet=new HashSet<>();
        stringSet.add("Murat");
        stringSet.add("Hakan");
        stringSet.add("Murat");
        System.out.println("stringSet = " + stringSet);
        Student s1=new Student("Alp",44);
        Student s2=new Student("Alp",44);
        Student s3=new Student("Alp",44);
        System.out.println("s1.hashCode() = " + s1.hashCode()); // 1846274136
        System.out.println("s2.hashCode() = " + s2.hashCode()); // 1639705018
        System.out.println("s3.hashCode() = " + s3.hashCode()); // 1627674070

        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        Set<Object>studentSet=new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
     //   System.out.println("studentSet = " + studentSet);
        System.out.println("studentSet.size() = " + studentSet.size());
    }
}
