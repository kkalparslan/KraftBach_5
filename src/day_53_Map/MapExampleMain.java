package day_53_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExampleMain {
    public static void main(String[] args) {
        Map<Integer, Ogrenci> okul =new TreeMap<>();
        Ogrenci ogr1=new Ogrenci("mehmet","yılmaz",53);
        Ogrenci ogr2=new Ogrenci("ahmet","şen",89);
        Ogrenci ogr3=new Ogrenci("alp","çelik",76);
        Ogrenci ogr4=new Ogrenci("kemal","aslan",20);

        okul.put(278,ogr4);
        okul.put(27,ogr3);
        okul.put(78,ogr2);
        okul.put(878,ogr1);
        okul.put(145, new Ogrenci("emel", "öztürk", 33));

        System.out.println(okul.get(27).getSurName());
        List<Ogrenci>list=new ArrayList<>();
        list.add(ogr1);
        list.add(ogr2);
        list.add(ogr3);

    }
}
