package Day_24;

public class Benim_Arrays_Calismalarim {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(merhaba(str)));
        //System.out.println(Arrays.toString(cilek(str)));
        //System.out.println(Arrays.toString(swaping(str)));
        //System.out.println(Arrays.toString(ikinci(str)));



    }
    public static String [] merhaba(String str){
        return str.split(" ");
    }
    public static String[] cilek (String str){
        String [] split=str.split(" ");
        for (int i = 0; i < split.length; i++) {
            if(split[i].length()<5){
                split[i]="çilek";
            }
        }return split;
    }
    public static String [] swaping(String str){
        String [] split=str.split(" ");
        String temp=split[0];
        split[0]=split[split.length-1];
        split[split.length-1]=temp;
        return split;
    }
    public static String[] ikinci(String str){
        String [] arr=str.split(" ");
        return arr[1].split("");
    }
}
