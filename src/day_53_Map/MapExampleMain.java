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
        Ogrenci ogr3=new Ogrenci("enes","çelik",76);
        Ogrenci ogr4=new Ogrenci("adem","aslan",20);

        okul.put(278,ogr4);
        okul.put(34,ogr3);
        okul.put(25,ogr2);
        okul.put(899,ogr1);
        okul.put(145, new Ogrenci("alparslan", "öztürk", 77));


        System.out.println(okul.get(25).getSurName()); // şen
        List<Ogrenci>list=new ArrayList<>();
        list.add(ogr1);
        list.add(ogr2);
        list.add(ogr3);
        list.add(ogr4);
        System.out.println("okul.keySet() = " + okul.keySet());

        System.out.println(list.get(0).getAverageNote()); // 53.0
        okul.get(899).setAverageNote(70);
        System.out.println("ogr1.getAverageNote() = " + ogr1.getAverageNote()); // ogr1.getAverageNote() = 70.0


    }
}
