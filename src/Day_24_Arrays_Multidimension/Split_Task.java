package Day_24_Arrays_Multidimension;

import java.util.Arrays;

public class Split_Task {
    public static void main(String[] args) {

//        String str="merhaba java insanları";
//        String [] arry=str.split(" ");
//        System.out.println(arry[0]);
//        arry[1]="yurdum";
//        System.out.println(Arrays.toString(arry));
        //int [] arrys= {1,2,3,4,5,6,7,8,9};
//        int [] ints =Arrays.copyOfRange(arrys,2,6);
//        System.out.println(Arrays.toString(ints));
        //int [] arrys2= {1,8,3,11,5,6,7,4,10};
//        Arrays.sort(arrys2);                      //sort küçükten büyüğe doğru sıralama yapıyor
//        //System.out.println(Arrays.toString(arrys2));
//        Arrays.fill(arrys2,10);
//        //System.out.println(Arrays.toString(arrys2));
//        Arrays.fill(arrys2,2,5,5);
//        String str="merhaba java insanları bugün nasılsınız";
//        System.out.println(Arrays.toString(stringToArray(str)));
//        String str2="kayısı, armut, üzüm, nar, çilek";
//        System.out.println(Arrays.toString(stringToArray2(str2)));
//        String str3 = "elma, armut, üzüm, çilek, nar";
//        System.out.println(Arrays.toString(stringToArrays3(str3)));
//        String str4="merhaba java insanları bugün nasılsınız";
//        System.out.println(Arrays.toString(stringToArrays4(str4)));
        // System.out.println(Arrays.toString(stringToArrays5(10)));
        //System.out.println(arithmetic(arrys));
        // System.out.println(Arrays.toString(fillWithSmallest(arrys)));
        //System.out.println(Arrays.toString(fillWithSmallest2(arrys)));
        //System.out.println(Arrays.deepToString((splitArray(str))));

    }
    public static String[] stringToArray(String str) {
        return str.split(" ");

    }
    public static String[] stringToArray2(String str) {
        String[] split = str.split(", ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() < 5) {
                split[i] = "çilek";
            }
        }
        return split;
    }
    public static String[] stringToArrays3(String str) {
        String[] split = str.split(", ");
        String temp = split[0];
        split[0] = split[split.length - 1];
        split[split.length - 1] = temp;
        return split;
    }
    public static String[] stringToArrays4(String str) {
        String[] arr = str.split(" ");
        return arr[1].split("");
    }
    public static int[] stringToArrays5(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;

        }
        return arr;
    }
    public static int arithmetic(int[] arr) {
        Arrays.sort(arr);
        return (arr[0] + arr[arr.length - 1]) / 2;
    }
    public static int[] fillWithSmallest(int[] arr) {
        Arrays.sort(arr);
        Arrays.fill(arr, arr[0]);
        return arr;
    }
    public static int[] fillWithSmallest2(int[] arr) {
        Arrays.sort(arr);
        Arrays.fill(arr, 0, arr.length - 1, arr[0]);
        return arr;
    }
    public static String [][] splitArray(String str){
        String [] arr=str.split(" ");
        String [] string=Arrays.copyOfRange(arr,0,3);
        String [] string1=Arrays.copyOfRange(arr,3,5);
        String [][]forReturn={string,string1};
        return forReturn;


    }

}
