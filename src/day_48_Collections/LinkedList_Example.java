package day_48_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedList_Example {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("ahmet");
        linkedList.add("mehmet");
        linkedList.add("ayşe");
        linkedList.add("alparslan");

        System.out.println(linkedList.size());
        System.out.println("linkedList = " + linkedList);
        System.out.println(linkedList.pop());
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(2));
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.peek() = " + linkedList.peek());
        linkedList.push("test");
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.peek() = " + linkedList.peek());
        System.out.println("linkedList.pop() = " + linkedList.pop());
        System.out.println("linkedList = " + linkedList);
        //System.out.println("arrayList = " + arrayList);
    }
}
