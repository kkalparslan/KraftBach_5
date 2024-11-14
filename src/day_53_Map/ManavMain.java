package day_53_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ManavMain {
    public static void main(String[] args) {
        Map<String, Manav> manav = new TreeMap<>();
        manav.put("02Elma02", new Manav("elma", 25.99));
        manav.put("Ayva0204", new Manav("ayva", 36.99));

        manav.get("Ayva0204").setFiyat(75.99);
        manav.get("Ayva0204").fiyatArttir(5);
        System.out.println(manav.get("Ayva0204").getFiyat());
        double toplamFiyat = 0;
        for (String key : manav.keySet()) {
            toplamFiyat += manav.get(key).getFiyat();
        }
        System.out.println(Math.round(toplamFiyat)); // 107

        Map<String, Integer> map = new HashMap<>();
        map.put("elma", 25);
        map.put("armut", 35);
//        int result=map.get("armut")+15;
//        System.out.println("result = " + result); // result = 50
        int result = 0;
        for (String key : map.keySet()) {
            result += map.get(key);
        }
        System.out.println("result = " + result);
        map.forEach((k, v) -> System.out.println(k + "-->" + v));
        System.out.println(Integer.parseInt("1") + 5);// 6 Integer (atamalarımız)
        //  tanımlamalarımızın içeride hata vermesi durumunda parseInt yapıp
        //  içerideki veriyi Integer a dönüştürebiliriz.
    }
}
