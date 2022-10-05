package Day_24;

import java.util.Arrays;

public class Arrays_ {
    public static void main(String[] args) {
//        int[] iArry = new int[5];
//        iArry[0] = 10;
//        iArry[1] = 20;
//        iArry[2] = 30;
//        iArry[3] = 40;
//        iArry[4] = 50;
//        for (int i : iArry) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < iArry.length; i++) {
//             System.out.println(iArry[i]);
//        }
//        String [] sArry= new String[3];
//        sArry[0]="Muhammed";
//        sArry[1]="Alparslan";
//        sArry[2]="Beytullah";
//         System.out.println(sArry[0].length());
//        System.out.println(sArry[0]);
//        System.out.println(Arrays.toString(sArry));
        int[] iArr = {1, 2, 3, 4, 5, 6, 7};
        int[] iArr2 = {1, 2, 3, 4, 5};
        //System.out.println(checkLength(iArr));
        //System.out.println(finds5(iArr2));
        //System.out.println(compareFirstEements(iArr, iArr2));
        //System.out.println(Arrays.toString(newArrWithFirstElements(iArr, iArr2)));
        //System.out.println(sumArrayElements(iArr));
        //System.out.println(Arrays.toString(connectArrays(iArr, iArr2)));
        // System.out.println(bigOne(iArr));
        //System.out.println(Arrays.toString(swapFirstLast(iArr)));
        //System.out.println(Arrays.toString(reverseArry(iArr)));
        //System.out.println(sumOfOdd(iArr));
        //String str="merhaba java insanları bugün nasılsınız";
        //System.out.println(Arrays.toString(splitArray(str)));
        //System.out.println(Arrays.toString(Arrays.copyOfRange(iArr, 2, 5)));


    }

    public static boolean checkLength(int[] iArr) {
        return iArr.length > 5;
    }

    public static boolean finds5(int[] iArry) {
        int parametre = 5;
        for (int i = 0; i < iArry.length; i++) {
            if (iArry[i] == parametre) {
                return true;
            }
        }
        return false;
    }

    public static boolean compareFirstEements(int[] iarr1, int[] iarr2) {
        return iarr1[0] == iarr2[0];
    }

    public static int[] newArrWithFirstElements(int[] iarr, int[] iarr2) {
        int[] newArr = new int[2];
        newArr[0] = iarr[0];
        newArr[1] = iarr2[0];
        return newArr;
    }

    public static int sumArrayElements(int[] iArr) {
        int toplam = 0;
        for (int i = 0; i < iArr.length; i++) {
            toplam += iArr[i];
        }
        return toplam;
    }

    public static int[] connectArrays(int[] iArr, int[] iArr2) {
        int[] newArr = new int[iArr.length + iArr2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < iArr.length) {
                newArr[i] = iArr[i];
            } else {
                newArr[i] = iArr2[i - iArr.length];
            }
        }
        return newArr;
    }

    public static int bigOne(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] swapFirstLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static int[] reverseArry(int[] arr) {
        int[] ints = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[(arr.length - 1) - i];
        }
        return ints;
    }

    public static int sumOfOdd(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static String[][] splitArray(String str) {
        String[] arr = str.split(" ");
        String[] strings = Arrays.copyOfRange(arr, 0, 3);
        String[] strings1 = Arrays.copyOfRange(arr, 3, 5);
        String[][] forReturn = {strings, strings1};
        return forReturn;


    }

}
