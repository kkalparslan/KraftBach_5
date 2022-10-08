package day_53_Map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//        list.add(5);
//        list.add(8);
//
       // Map<Integer, String> map = new LinkedHashMap<>(); // TreeMap key lere göre (doğal treeMap)
        // artan bir sıralama yapıyor. HashMap ise hash kodlara göre sıralama yapıyor. giriş
        // sırası yada harf rakam küçük büyü önemli değil..LinkedHasMap ise giriş sıralamasını korur.
        // HashMap bir adet null key birden fazla null value alabiliyor ancak
        // TreeMap ise null key almaz fakat HashMap gibi birden fazla null value alabilir.

        // put()
//        map.put(6830, "Alparslan");
//        map.put(1071, "Emel");
//        map.put(8957, "Ceren");
//        map.put(1558, "Azra");

       // map.forEach((k,v)-> System.out.println(k+"-->"+v));

        // get()
       // System.out.println("map.get(6830) = " + map.get(6830)); // map.get(6830) = Alparslan
//        // olmayan yanlış bir key girersek null değer döndürüyor..

        // size()
        //System.out.println("map.size() = " + map.size()); // 4

        // toString()
        //System.out.println("map.toString() = " + map.toString().toUpperCase());
        //{6830=ALPARSLAN, 1071=EMEL, 8957=CEREN, 1558=AZRA} toStringten sonra string döndürdüğü
        // için arkasından tekrar başka metod ile devam edebiliyoruz. Diğerlerinde de
        // yapabiliyormuşuz. tek tek denerim olmazsa..

        // remove()
//        System.out.println("map.remove(6830) = " + map.remove(6830));
//        System.out.println("map = " + map); // {1071=Emel, 8957=Ceren, 1558=Azra}

        // containsKey()
//        System.out.println("map.containsKey(1071) = " + map.containsKey(1071));//true
//        System.out.println("map.containsKey(6830) = " + map.containsKey(6830));//false
//        // containsValue()
//        System.out.println("map.containsValue(kemal) = " + map.containsValue("kemal"));//false
//        System.out.println("map.containsValue(Azra) = " + map.containsValue("Azra"));//true

//        // replace()
//        map.replace(1071,"Alp");
//        System.out.println("map = " + map); // {1071=Alp, 8957=Ceren, 1558=Azra}
//
//        // keySet()
//        System.out.println("map.keySet() = " + map.keySet()); // [1071, 8957, 1558]
//        // sadece key leri alıp bir collection nın içine atıyor.
//
//        // Value()
//        System.out.println("map.values() = " + map.values()); // [Alp, Ceren, Azra]
//        // sadece value ları alıp bir collection nın içine atıyor.

       //  for (Integer num : map.keySet()) {
//            System.out.println(map.get(num));
//        }

        Map<Integer, String> fenA=new LinkedHashMap<>();
        fenA.put(6830, "Alparslan");
        fenA.put(1071, "Emel");
        fenA.put(8957, "Ceren");
        fenA.put(1558, "Azra");

        Map<Integer, String>fenB=new LinkedHashMap<>();
        fenB.put(683, "Hacı");
        fenB.put(107, "Kemal");
        fenB.put(897, "Nevzat");
        fenB.put(158, "Dilek");
        List<Map<Integer, String>> okul =new ArrayList<>();
        okul.add(fenA);
        okul.add(fenB);
//        System.out.println("list.size() = " + okul.size());
//        System.out.println("list.toString() = " + okul.toString());

//        System.out.println("map.get(8957) = " + fenA.get(8957));
//        System.out.println("list.get(1).get(1558) = " + okul.get(0).get(1558)); // iç içe Map/List vs
//                                                   // yapılarını ileride frame worklerde kullanacağız..
//
//        for (Map<Integer, String> sinif: okul) {
//             for (Integer key:sinif.keySet()) {
//                 System.out.println("sinif.get(key) = " + sinif.get(key));
//             }
//        }
        for (int i = 0; i < okul.size(); i++) {
            for (Integer key : okul.get(i).keySet()) {
                System.out.println("okul.get(i).get(key) = " + okul.get(i).get(key));

            }
        }


        }

    }




