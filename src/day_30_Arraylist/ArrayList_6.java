package day_30_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayList_6 {
    public static void main(String[] args) {
        ArrayList<String> fruitInBasket = new ArrayList<>();
     //   fruitInBasket.add("elma");
        fruitInBasket.add("armut");
        fruitInBasket.add("kayısı");
        fruitInBasket.add("üzüm");
      //  fruitInBasket.add("erik");

        ArrayList<String> fruitInPlate = new ArrayList<>();
        fruitInPlate.add("armut");
        fruitInPlate.add("kayısı");
        fruitInPlate.add("üzüm");

       // fruitInBasket.removeAll(fruitInPlate);
       // System.out.println("fruitInBasket = " + fruitInBasket);

//        System.out.println("fruitInPlate.equals(fruitInBasket) = " + fruitInPlate.equals(fruitInBasket));
//        System.out.println(fruitInPlate == fruitInBasket);

        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(200);

//        printListNumber(listOfNums);
//        System.out.println("\nsum(listOfNums) = " + sum(listOfNums));
        ArrayList<Integer> myList=getList(20);
        System.out.println("myList = " + myList);
        System.out.println("random(20) = " + random(20));
        ArrayList<String>stringNums=new ArrayList<>();
        stringNums.add("10");
        stringNums.add("100");
        stringNums.add("101");
        stringNums.add("1000");
        toIntList(stringNums);
        System.out.println("toIntList(stringNums) = " + toIntList(stringNums));
        System.out.println(toIntList(stringNums).get(0) + toIntList(stringNums).get(1));
        System.out.println(Arrays.toString(toIntArr(stringNums)));
    }
    public static void printListNumber(ArrayList<Integer>nums){
        for (Integer I:nums) {
            System.out.print(I+" ");
        }
    }public static int sum(ArrayList<Integer>nums){
        int sum=0;
        for (Integer I:nums) {
            sum+=I;
        }return sum;
    }
    public static ArrayList<Integer> getList(int i){
        ArrayList<Integer> list=new ArrayList<>();
        for (int j = 0; j < i; j++) {
            list.add(j);
        }return list;
    }
    public static ArrayList<Integer>random(int param){
        Random rm=new Random();
        ArrayList<Integer>rmList=new ArrayList<>();
        for (int i = 0; i < param; i++) {
            rmList.add(rm.nextInt(param)+1);

        }return rmList;
    }
    public static ArrayList<Integer>toIntList(ArrayList<String> strList){
        ArrayList<Integer> intList=new ArrayList<>();
        for (String s:strList) {
          intList.add(Integer.valueOf(s)); //noboxing
          //intList.add(Integer.parseInt(s));
        }return intList;
    }
    public static int [] toIntArr(ArrayList<String> strList){
        int [] myArray=new int[strList.size()];
        for (int i = 0; i < strList.size(); i++) {
            myArray[i]=Integer.parseInt(strList.get(i)); // noboxing
        }return myArray;
    }
}
