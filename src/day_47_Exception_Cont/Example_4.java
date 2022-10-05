package day_47_Exception_Cont;

import java.util.Arrays;

public class Example_4 {
    public static void main(String[] args) throws Exception {
        // array içinde en büyük sayının index numarasını getiren metodu yazınız
        // eğer en büyük sayıdan 2 veya daha fazla var ise new exception throw edin.
        int arr[]={3,5,8,9,11,2,8,4,1};
        System.out.println(maxNumberIndex(arr));

    }
    public static int maxNumberIndex(int[]array) throws Exception {
        int arr[]=array.clone();
        int ındexNumber=0;

        Arrays.sort(arr);
        int x=arr[arr.length-1];
        if(arr[arr.length-2]==x){
            throw new Exception("en büyük sayıdan 2 adet vardır");
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]==x){
                ındexNumber=i;
            }
        }return ındexNumber;
    }
    public static int maxNumberOfArray(int [] arr){ // bir array içindeki maximum ve minimum
                                                    // değeri bulmak istersek yapılacak işlem
//        Arrays.sort(arr);
//        int min=arr[0];
//        int max=arr[arr.length-1];  // bu şekilde de bulunabilir max ve min değerleri
                                      // ancak burada array değerleri değişmiş olur.

        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;


    }
}
