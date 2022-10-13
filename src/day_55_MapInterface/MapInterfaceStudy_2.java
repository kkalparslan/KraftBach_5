package day_55_MapInterface;

import java.util.*;

public class MapInterfaceStudy_2 {
    public static void main(String[] args) {
        Map<String, Integer> ageMap=new HashMap<>();
        ageMap.put("Mehmet",25);
        ageMap.put("Hatice",24);
        ageMap.put("Ayşe",22);
        ageMap.put( "Metin", 50);
        ageMap.put( "Osman", 37);
        ageMap.put( "Zeynep", 24);
        ageMap.put( "Veli", 24);
        ageMap.put( "Ahmet", 45);
        System.out.println("ageMap.keySet() = " + ageMap.keySet());
        // [Ayşe, Ahmet, Veli, Zeynep, Mehmet, Osman, Hatice, Metin]

        // How to collect all keys of map
        // set<K> keySet()
        // Returns a "set view" of the keys contained in the map
        Set<String> stringSet=ageMap.keySet();
        System.out.println("stringSet = " + stringSet);
        System.out.println("-----------------------------");

        // How to remove a key which have specific value?
        // How to convert a new map from current map?
        // take a new Map which have person mapped ages should be under 25;
        // [Ayşe, Ahmet, Veli, Zeynep, Mehmet, Osman, Hatice, Metin]
        Iterator<String> iterator=stringSet.iterator();

        while (iterator.hasNext()){
            String next=iterator.next();
            if(ageMap.get(next)>25){
                iterator.remove();
            }
            }
        System.out.println("ageMap = " + ageMap);
        // {Ayşe=22, Zeynep=24, Mehmet=25, Hatice=24}

        for (String eachKey: stringSet) {
            System.out.println("eachKey = " + eachKey+"-->"+ageMap.get(eachKey));
        }
        System.out.println("---------------------------");
        // Collection<V> values()
        // Returns a "Collection view" of the values contained in the map
        Collection<Integer> values = ageMap.values();
        System.out.println("values = " + values); // values = [22, 24, 24, 25, 24]

        Iterator<Integer> iterValues = values.iterator();
        while (iterValues.hasNext()){
            Integer next = iterValues.next();
            if (next<24){
                iterValues.remove();
            }
        }
        System.out.println("values = " + values); // [24, 24, 25, 24]
        System.out.println("ageMap = " + ageMap);
        // {Veli=24, Zeynep=24, Mehmet=25, Hatice=24}
        System.out.println("iterValues.hasNext() = " + iterValues.hasNext());
        // iterValues.hasNext() = false

        Iterator<Integer> iterValues2 = values.iterator();
        System.out.println("iterValues2.hasNext() = " + iterValues2.hasNext()); // iterValues2.hasNext() = true
        // yeni bir value değerini iterator metodu uygulayarak Iterator referansı ile nesne oluşturup hasNext
        // yapınca yeni bir while döngüsü ile next yapabiliyoruz..
        System.out.println("-----------------------------------------");

        Set<Map.Entry<String, Integer>> entries = ageMap.entrySet();
        for (Map.Entry<String, Integer>eachEntry:entries){
            System.out.println("eachEntry.getKey() = " + eachEntry.getKey()+"-->"+eachEntry.getValue());
            if(eachEntry.getValue()>24){
                eachEntry.setValue(100);
//            if(eachEntry.getValue()==24){
//                eachEntry.setValue(eachEntry.getValue()+10);
//                // ageMap = {Veli=34, Zeynep=34, Mehmet=25, Hatice=34}
            }
        }
        System.out.println("ageMap = " + ageMap);
        // ageMap = {Veli=24, Zeynep=24, Mehmet=100, Hatice=24}

        ageMap.forEach((K,V)-> System.out.println(K+"--->"+V));
//        Veli--->24
//        Zeynep--->24
//        Mehmet--->100
//        Hatice--->24

        NavigableMap<Integer, String>navMap=new TreeMap<>();
        navMap.put(25,"mehmet");
        navMap.put(24,"hatice");
        navMap.put(22,"ayşe");
        navMap.put(50,"metin");
        navMap.put(37,"osman");
        navMap.put(24,"zeynep");
        navMap.put(24,"veli");
        navMap.put(45,"ahmet");
        System.out.println("navMap = " + navMap);
        // {22=ayşe, 24=veli, 25=mehmet, 37=osman, 45=ahmet, 50=metin}
        System.out.println("navMap.descendingKeySet() = " + navMap.descendingKeySet());
        // [50, 45, 37, 25, 24, 22]

    }
}
