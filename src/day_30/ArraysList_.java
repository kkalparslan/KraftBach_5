package day_30;
import java.util.ArrayList;

public class ArraysList_ {
    public static void main(String[] args) {
        //size(), add(), set(), isEmpty()
        ArrayList<String>names= new ArrayList<>();
        names.add("Ahmet");
        names.add("Mehmet");
        names.add("Ayşe");
        names.add("Zehra");
        System.out.println("names.size() = " + names.size());
        System.out.println("names.toString() = " + names);
        System.out.println("names = " + names);

        names.set(2,"Fatma");
        System.out.println("names = " + names);
        names.add(2,"Ayşe");
        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size());

        System.out.println("names.isEmpty() = " + names.isEmpty());

        names.clear(); //size artık 0 oldu..
        System.out.println("names.isEmpty() = " + names.isEmpty());
        boolean isEmpty= names.size() == 0;
        System.out.println(names.size() == 0);
        System.out.println(" is Empty= "+ isEmpty);



    }
}
