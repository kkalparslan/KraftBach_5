package bootCamp.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class B16_Polymorphism {
    // poly morph---çokca form--many form
    // it is the ability of an object to take many form//bir nesnenin birden fazla form alma yeteneği
    // there must be a relationship
    // parent/super class or interface referanced to the child class
    // parent type decide which can be accessible
    // object type decides which implementation executed

    // static polymorphism-->compile time polymorphism-->method overloading
    // dynamic polymorphism-->runtime time polymorphism-->method overridding

    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>(); // polymorphic way
        TreeSet<Integer> treeSet = new TreeSet<>(); // standart create object

        // referance type casting
        // upcasting-auto casting--smaller type to large type--implictily
        List<Integer> list = (List) new ArrayList<>(); // upcasting

        // downcasting--larger to smaller type
        Super sub1 = new Sub();
        sub1.message1();
    }
}

    class Super {
        void message1() {
            System.out.println("message from super");
        }
    }
    class Sub extends Super {
        @Override
        void message1() {
            System.out.println("message from sub");
        }
        void message2(){
            System.out.println("message2 from sub");
        }
    }


