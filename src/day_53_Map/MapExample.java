package day_53_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//        list.add(5);
//        list.add(8);
//
//        Map<Integer, String>map=new HashMap<>();
//        // put()
//        map.put(6830, "Alparslan");
//        map.put(1071, "Emel");
//        map.put(8957, "Ceren");
//        map.put(1558, "Azra");
//        System.out.println("map = " + map);
//        for (Integer num:map.keySet()) {
//            System.out.println(map.get(num));
        Map<Integer, String>map=new HashMap<>();

        map.put(6830, "Alparslan");
        map.put(1071, "Emel");
        map.put(8957, "Ceren");
        map.put(1558, "Azra");

        Map<Integer, String>map2=new HashMap<>();
        map.put(683, "Hacı");
        map.put(107, "Kemal");
        map.put(897, "Nevzat");
        map.put(158, "Dilek");
        List<Map<Integer, String>> list=new ArrayList<>();
        list.add(map);
        list.add(map2);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.toString() = " + list.toString());


    }

        // get()
//        System.out.println(map.get(1071));
//        map.forEach((k,v)-> System.out.println(k+" --> "+v));

        // size()
//        System.out.println("map.size() = " + map.size());

        // toString()
//        System.out.println("toString() = " + map.toString().toUpperCase());

        // remove()
//        map.remove(6830);
//        System.out.println("map = " + map);

        // containsKey/Value()
//        System.out.println("map.containsKey(8957) = " + map.containsKey(8957));
//        System.out.println("map.containsValue(\"Azra\") = " + map.containsValue("Azra"));

        // replace()
//        System.out.println("map.replace(1071,\"Alp\") = " + map.replace(1071, "Alp"));
//        System.out.println("map = " + map);

        // keySet()
        //System.out.println("map.keySet() = " + map.keySet());

        // values()
        //System.out.println("map.values() = " + map.values());




    }



