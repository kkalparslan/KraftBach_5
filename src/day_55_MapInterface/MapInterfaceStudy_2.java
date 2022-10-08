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

        // How to collect all keys of map
        // set<K> keySet()
        // Returns a "set view" of the keys contained in the map
        Set<String> stringSet=ageMap.keySet();
        System.out.println("stringSet = " + stringSet);

        // How to remove a key which have specific value?
        // How to convert a new map from current map?
        // ages should be under 25;
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
        // Collection<V> values()
        // Returns a "Collection view" of the values contained in the map
        Collection<Integer> values = ageMap.values();
        System.out.println("values = " + values);

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

        System.out.println("-----------------------------------------");
        Set<Map.Entry<String, Integer>> entries = ageMap.entrySet();
        for (Map.Entry<String, Integer>eachEntry:entries){
          //  eachEntry.getKey()+eachEntry.
        }


    }
}
