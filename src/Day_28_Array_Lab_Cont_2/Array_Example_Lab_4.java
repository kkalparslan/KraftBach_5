package Day_28_Array_Lab_Cont_2;

import java.util.Arrays;

public class Array_Example_Lab_4 {
    public static void main(String[] args) {
        int [] array={5, 2, 8, 12, 11};
        //System.out.println(asalSayiBulma(array));
        //kucuktenBuyugeSirala(array);

    }
    public static String asalSayiBulma(int [] arr){
        String result="";
        firstLoop: for (int sayi: arr) {
            if(sayi==2) {result+=sayi+" ";}
            else if(sayi==0 || sayi==1) {continue firstLoop;}
            else{
                for (int i = 2; i < sayi; i++) {
                    if(sayi%i==0){
                        continue firstLoop;
                    }
                }result+=sayi+" ";
            }
        }return result;

    }
    public static int [] kucuktenBuyugeSirala (int [] arr){
        int depo=0;
        for (int i=0; i<arr.length; i++){
            for (int k = i+1; k < arr.length; k++) {
                if(arr[i]>arr[k]){
                    depo=arr[i];
                    arr[i]=arr[k];
                    arr[k]=depo;
                }
            }
        }return arr;
    }
}
