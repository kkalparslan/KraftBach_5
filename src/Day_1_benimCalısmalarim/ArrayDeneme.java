package Day_1_benimCalısmalarim;

public class ArrayDeneme {
    public static void main(String[] args) {
        System.out.println("yeni değişiklik");
        int [] array={11,2,66,3,66};
        System.out.println(maxNumberArray(array));
        System.out.println((maxIndex(array)));

    }
    public static int maxNumberArray(int [] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int maxIndex(int[] arr){
        int ındex=0;
        int maxNumber=maxNumberArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==maxNumber){
                ındex=i;
            }
        }return ındex;
    }
}
