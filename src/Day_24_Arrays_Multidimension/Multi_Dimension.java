package Day_24_Arrays_Multidimension;

import java.util.Arrays;

public class Multi_Dimension {
    public static void main(String[] args) {
        int [][] arr= new int[2][3];
        arr [0] [0]=10;
        arr [0] [1]=20;
        arr [0] [2]=30;

        arr [1] [0]=40;
        arr [1] [1]=50;
        arr [1] [2]=60;

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
        }
int [][] arr2 ={{10,20,30},{40,50,60}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
        }
        System.out.println("....................................");
int [][] arr3=new int[2][];
        arr3[0]=new int[3];
        arr3[1]=new int[4];

        arr3[0][0]= 100;
        arr3[0][1]= 100;
        arr3[0][2]= 100;

        arr3[1][0]= 200;
        arr3[1][1]= 200;
        arr3[1][2]= 200;
        arr3[1][3]= 200;
        System.out.println(Arrays.deepToString(arr3));


    }
}
