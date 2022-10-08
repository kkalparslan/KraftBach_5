package day_55_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceStudy {
    public static void main(String[] args) {
        Map<String,Integer> ageMap=new HashMap<>();
        //Map<K,V>
        // put()
        ageMap.put("Mehmet",25);
        ageMap.put("Ahmet",24);
        ageMap.put("Ayşe",22);

        // size()
        System.out.println("ageMap.size() = " + ageMap.size());

        // get(K)
        System.out.println("ageMap.get(Mehmet) = " + ageMap.get("Mehmet"));
        int ageOfMehmet=ageMap.get("Mehmet"); // unbowed get metodu value olarak
                                              // ne döndürüyorsa o tarzda bir atama yapabiliriz.

        //containsKey()
        System.out.println("ageMap.containsKey(Mehmet) = " + ageMap.containsKey("Mehmet"));

        // remove()
        System.out.println("ageMap.remove(Mehmet) = " + ageMap.remove("Mehmet"));
        System.out.println("ageMap = " + ageMap);

        // put()
        Map<String, Integer> ageMap2=new HashMap<>();
        ageMap2.put( "Metin", null);
        ageMap2.put( "Ayşe", 22);
        ageMap2.put( "Hakan", 24);
        ageMap2.put( "Osman", 37);
        ageMap2.put( "Ahmet", 25);
        System.out.println("ageMap2 = " + ageMap2);

        ageMap2.putAll(ageMap2);
        System.out.println("ageMap2 = " + ageMap2);

        // clear()
        ageMap2.clear();
        System.out.println("ageMap2 = " + ageMap2);
        System.out.println("ageMap = " + ageMap);

        //putIfAbsent()
        System.out.println("ageMap2.putIfAbsent(Osman,38) = "
                + ageMap2.putIfAbsent("Osman", 38));
        Integer integer=ageMap.putIfAbsent("Osman",37);
        System.out.println("ageMap = " + ageMap);
        System.out.println("ageMap.putIfAbsent(Metin,23) = "
                + ageMap.putIfAbsent("Metin", 23));
        System.out.println("ageMap = " + ageMap);

        //getOrDefault()
        System.out.println("ageMap.getOrDefault(Ayşe,22) = "
                + ageMap.getOrDefault("Ayşe", 22));
        Integer ayşe=ageMap.getOrDefault("Ayşe",22);
        System.out.println("ageMap = " + ageMap);

        // replace()
        System.out.println("ageMap.replace(\"Ayşe\",24) = " + ageMap.replace("Ayşe", 24));
        System.out.println("ageMap = " + ageMap);
        System.out.println("ageMap.replace(\"Ayşe\",24,25) = "
                + ageMap.replace("Ayşe", 24, 25));
        System.out.println("ageMap = " + ageMap);
        System.out.println("ageMap.replace(\"Ayşe\",20,30) = "
                + ageMap.replace("Ayşe", 20, 30));
        System.out.println("ageMap = " + ageMap);

        //


    }
}
