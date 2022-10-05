package day_51_ListAndSet;

import java.util.*;

public class ListExample_1 {
    public static void main(String[] args) {
        // bir array i list içine alan ve list return eden bir metod yazınız
        int [] array={1,3,5,8,11,15};
        System.out.println("listReturnMetod(array) = " + addlistMetod(array));
 //       List<Integer> list2=new ArrayList<>(addlistMetod(array)); //bulduğumuz sonucu yeni bir list
                                                                       //        e de tanımlayabiliyoruz
//        System.out.println("list2 = " + list2);
//        System.out.println("list2.get(1) = " + list2.get(1));
        Integer [] array2={1,3,5,8,11,15};
        System.out.println("addListMetod2(array2) = " + addListMetod2(array2));

        List<Integer>list1=new ArrayList<>();
        list1.add(5);
        list1.add(2);
        List<String>list2=new LinkedList<>();
        List<Double>list3=new Vector<>();
        List<Object>list4=new ArrayList<>();
        list4.add(list1);
        list4.add(list2);
        list4.add(list3);
        System.out.println("list4.get(0) = " + list4.get(0));
        System.out.println("list4.get(1) = " + list4.get(1));
        System.out.println("list4.get(2) = " + list4.get(2));
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list2.size() = " + list2.size());
        System.out.println("list3.size() = " + list3.size());
        System.out.println("list4.size() = " + list4.size());
        System.out.println("list4 = " + list4);
        List<Object>list5=new ArrayList<>();
        System.out.println("list5.add(list4) = " + list5.add(list4));
        System.out.println("list5 = " + list5);
        System.out.println("list5.get(0) = " + list5.get(0));
        list5.add(8);
        System.out.println("list5.get(1) = " + list5.get(1));
        System.out.println("list5 = " + list5);


    }
    public static List<Integer> addlistMetod(int [] arr){
        List<Integer>list=new ArrayList<>();
//        for(int i=0; i<arr.length; i++){ 1. yöntem aşağıda arayi büyükten küçüğe yazdırdık
//            list.add(arr[i]);
//        }return list;
        for(int i=arr.length-1; i>=0; i--){list.add(arr[i]);
        }return list;
    }
    public static List<Integer> addListMetod2(Integer [] arr){
        List<Integer>list=new ArrayList<>();
        list=Arrays.asList(arr);
        return list;
    }
}












        /*
        int[] array = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5,6, 7, 8, 9};
        System.out.println(addListMethod(array));
        List<Integer> list2 = new ArrayList<>(addListMethod(array));
        System.out.println("list2.get(0) = " + list2.get(0));
        System.out.println("addListMethod2(array2) = " + addListMethod2(array2));
        List<Integer>list=new ArrayList<>(Arrays.asList(array2));
        System.out.println("list = " + list);
        System.out.println("listClearAllAndTurnMethod(list,5) = " + listClearAllAndTurnMethod(list, 5));

    }

    public static List<Integer> addListMethod(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public static List<Integer> addListMethod2(Integer[] arr) { // 2. yol priitive data type almaz.
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(arr);
        return list;
    }
    // içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen sonucunda
    // bir Integer list döndüren metodu yazınız

    public static List<Integer> listClearAllAndTurnMethod(List<Integer> list, Integer data) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(data)) {
                list1.add(list.get(i));
            }
        }
        return list1;

    }

    public static List<Integer> listClearAllAndTurnMethod2(List<Integer> list, Integer data) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(data)) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}*/
