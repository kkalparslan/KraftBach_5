package day_51_ListAndSet;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListExampleInterview {
    public static void main(String[] args) {
        // interview sorusu:
        // list içerisindeki tüm sıfırları listin
        // sonunda yazan metodu yazınız
        // giriş: 0,2,3,5,0,4,5   çıkış:2,3,5,4,5,0,0
        Integer[] array2 = {1, 11, 0, 3, 4, 0, 5, 6, 7, 8, 3};
        System.out.println(Arrays.toString(array2));
        List<Integer> list=new ArrayList<>(Arrays.asList(array2));
        //System.out.println(moveAllZeroAddEnd(list));
        System.out.println(moveAllZeroAddEnd2(list));


    }
    public static List<Integer> moveAllZeroAddEnd(List<Integer>list){
        int orginalSize=list.size();
        list.removeAll(Arrays.asList(0));
        int newSize=list.size();
        int result=orginalSize-newSize;
        for (int i = 0; i < result; i++) {
            list.add(0);
            }return list;
        }
    public static List<Integer> moveAllZeroAddEnd2(List<Integer>list){
        List<Integer>list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).equals(0)){
                list1.add(list.get(i));
            }
        }
        int result=list.size()-list1.size();
        for (int i = 0; i <  result; i++) {
            list1.add(0);
        }
        return list1;
    }
    }

// yeni soru 1: list içerisindeki polindrom kelimeleri list içerisinden silen metodu yazınız..
    // List<String> alıcağız ve normal ve tersten okunuşları aynı olan kelimeleri sileceğiz..
    // ey edip adanada pide ye...birde hepsini silsin --> boş

    //




