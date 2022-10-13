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

        // get(K) get Key ler üzerinden çalışır.
        // nesne oluştururken ilk değer key ikince değer value olur.
        System.out.println("ageMap.get(Mehmet) = " + ageMap.get("Mehmet"));
        int ageOfMehmet=ageMap.get("Mehmet"); // unboxed...get metodu value olarak (tipi) ne döndürüyorsa o tarzda
                                              //  bir atama yapabiliriz. burada Integer değer döndürdüğü için
                                              //   int değere atadık onuda unboxed yaparak primitive dataya atadık.
        //containsKey()
        System.out.println("ageMap.containsKey(Mehmet) = " + ageMap.containsKey("Mehmet"));

        // remove()
        System.out.println("ageMap.remove(Mehmet) = " + ageMap.remove("Mehmet"));
        System.out.println("ageMap = " + ageMap);

        // putAll()
        Map<String, Integer> ageMap2=new HashMap<>();
        ageMap2.put( "Metin", null);
        ageMap2.put( "Osman", 37);
        ageMap2.put( "Hakan", 24);
        ageMap2.put( "Ahmet", 22);
        ageMap2.put( "Ahmet", 25); // ageMap = {Ahmet=25, Ayşe=22, Osman=37, Hakan=24, Metin=null}
        System.out.println("ageMap2 = " + ageMap2);
        // ageMap2 = {Ahmet=22, Osman=37, Hakan=24, Metin=null}

        ageMap.putAll(ageMap2); // ageMap = {Ahmet=22, Ayşe=22, Osman=37, Hakan=24, Metin=null}
        System.out.println("ageMap = " + ageMap);

        // clear()
        ageMap2.clear();
        System.out.println("ageMap2 = " + ageMap2); // ageMap2 = {}
        System.out.println("ageMap = " + ageMap);
        // ageMap = {Ahmet=25, Ayşe=22, Osman=37, Hakan=24, Metin=null}

        //putIfAbsent()
        System.out.println("ageMap.putIfAbsent(Osman,38) = "
                + ageMap.putIfAbsent("Osman", 38));
        Integer integer=ageMap.putIfAbsent("Osman",37);
        System.out.println("ageMap.putIfAbsent(Metin,23) = "
                + ageMap.putIfAbsent("Metin", 23)); // (Metin,23) = null
        System.out.println("ageMap = " + ageMap);
        // {Ahmet=25, Ayşe=22, Osman=37, Hakan=24, Metin=23} null bir value su olan parametreye
        // value verilen değeri putİfAbsent ile gönderince null değeri döndürüyor ancak verilen
        // yeni değeri de atama yapıyor

          // getOrDefault()
        System.out.println("ageMap.getOrDefault(Ayşe,22) = "
                + ageMap.getOrDefault("Ayşe", 22));
        Integer ayşe=ageMap.getOrDefault("Ayşe",22);
        System.out.println("ageMap = " + ageMap);

        // replace()
        System.out.println("ageMap.replace(Ayşe,24) = " + ageMap.replace("Ayşe", 24));
        System.out.println("ageMap = " + ageMap);
        System.out.println("ageMap.replace(Ayşe,24,25) = "
                + ageMap.replace("Ayşe", 24, 25)); // ageMap.replace(Ayşe,24,25) = true
        System.out.println("ageMap = " + ageMap); // ageMap = {Ahmet=25, Ayşe=25, Osman=37, Hakan=24, Metin=23}
        System.out.println("ageMap.replace(Ayşe,20,30) = "
                + ageMap.replace("Ayşe", 20, 30));
        System.out.println("ageMap = " + ageMap); // ageMap.replace(Ayşe,20,30) = false




    }
}
