package benimCalismalar_2;

public class StringClass {

    public static void main(String[] args) {
//        String str = "alparslan";
//        char[] charArr = str.toCharArray();
//        for (int i = charArr.length - 1; i >= 0; i--) {
//            System.out.print(charArr[i]);
//        }

        String str = "alparslan";
        System.out.println("reverseStr(str) = " + reverseStr(str));


    }

    /**
     * stringi tersten yazdırma
     */
    public static String reverseStr(String str){
        String reverse="";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }return reverse;

    }
}
