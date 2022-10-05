package day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        // içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen sonucunda
        // bir Integer list döndüren metodu yazınız
        Integer [] array={1, 3, 5, 5, 4, 4, 8, 11, 15};
        List<Integer>list=new ArrayList<>(Arrays.asList(array));
        System.out.println("list = " + list);
      //  System.out.println("clearAllData= " + clearAllData(list, 5));
      //  System.out.println("clearAllData= " + clearAllData(list, 4));
//        System.out.println("clearAllData2(list,5) = " + clearAllData2(list, 5));
//        System.out.println("clearAllData2(list,4) = " + clearAllData2(list, 4));
//        System.out.println("clearAllData3(list,5) = " + clearAllData3(list, 5));
//        System.out.println("list = " + list);
        System.out.println("(list,5) = " + clearAllData4(list, 5));
        System.out.println("(list,4) = " + clearAllData4(list, 4));
        System.out.println("(list,3) = " + clearAllData4(list, 3));
        System.out.println("(list,2) = " + clearAllData4(list, 8));


    }
    public static List<Integer> clearAllData(List<Integer> list, Integer data){
        List<Integer> list2=new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            if(!list.get(i).equals(data)){
                list2.add(list.get(i));
            }
        }return list2;
    }
    public static List<Integer> clearAllData2(List<Integer> list, Integer data){

        for (int i=0; i<list.size(); i++){
            if(list.get(i).equals(data)){
                list.removeAll(Arrays.asList(data));
            }
        }return list;
    }
    public static boolean clearAllData3(List<Integer> list, Integer data){
        return list.removeAll(Arrays.asList(new Integer []{data}));
    }
    public static List<Integer> clearAllData4(List<Integer>list, Integer data){
        Iterator<Integer> iter=list.iterator();
        while (iter.hasNext()){
            if(iter.next().equals(data)){
                iter.remove();
            }
        }return list;
    }

}
