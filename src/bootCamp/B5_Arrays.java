package bootCamp;

import java.util.Arrays;

public class B5_Arrays {
    public static void main(String[] args) {
        // we can hold/store multiple same type value in single variable
        // fixed size
        // we can reach an element by using index number
        int [] nums=new int[8];
        System.out.println(Arrays.toString(nums)); // [0, 0, 0, 0, 0, 0, 0, 0]
        nums [0]=2;
        System.out.println(Arrays.toString(nums)); // [2, 0, 0, 0, 0, 0, 0, 0]
        nums [1]=5;
        nums [2]=7;
        nums [3]=10;
        nums [4]=21;
        nums [5]=13;
        nums [6]=9;
        nums [7]=25;
        System.out.println(Arrays.toString(nums)); // [2, 5, 7, 10, 21, 13, 9, 25]

        int [] nums2 = {2,4,6,1,78,11,4};
        System.out.println(nums2.length); // 7
        System.out.println(Arrays.toString(nums2)); // [2, 4, 6, 1, 78, 11, 4]

        int [] nums3= new int[]{4,54,2,7,90,3};
        System.out.println(nums3.length); // 6

        // nums2 yi tersten yazdırın
        int [] reverse=new int[nums2.length]; // size 7
        for (int i = reverse.length-1, j=0; i >=0 ; i--, j++) {
            reverse[j]=nums2[i];
        }
        System.out.println(Arrays.toString(reverse)); // [4, 11, 78, 1, 6, 4, 2]

        // num u sorting yapın




    }


}
