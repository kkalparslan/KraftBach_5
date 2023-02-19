package Day_1_BenimCalismalarim;

import java.util.ArrayList;
import java.util.List;

public class StringWorking {
    public static void main(String[] args) {

        // count letters in a string --> "Yayla"->y2,a2,l1

        String str="Yayladan";
        System.out.println("(str) = " + countLetter(str));
        System.out.println(countLetter2(str));


    }
    public static List<String> countLetter(String str){
        str=str.toLowerCase();
        List<String>list=new ArrayList<>();
        int count=1;
        for (int i = 0; i < str.length(); ) {
            for (int j = 1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            list.add(""+str.charAt(i)+count);
            count=1;
            str=str.replace(str.substring(0,1), "");
        }
        return list;
    }
    public static List<String> countLetter2(String str){
        str=str.toLowerCase();
        List<String>list=new ArrayList<>();
       while (!str.isEmpty()){

            String control=str.substring(0,1);
            int count = str.length() - str.replace(control, "").length();
            list.add(control+count);
            str=str.replace(control,"");
        }

        return list;
    }
    /**
     * str tersten yazdır
     * str ın içindeki  unique harfleri yazdır. list e at
     */


}
