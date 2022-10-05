package day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InterviewQuestion_2 {
    public static void main(String[] args) {
        // List içerisinde Mehmet olan tüm isimleri silin
        String[] array = {"ahmet","mehmet","ayşe","emel","alp"};
        List<String> list=new ArrayList<>(Arrays.asList(array));
        System.out.println(removeNameListMethod(list, "Mehmet"));


    }
    public static List<String> removeNameListMethod(List<String>list, String  data){
        Iterator<String> iter=list.iterator();
        while (iter.hasNext()){
            if(iter.next().equalsIgnoreCase(data)){
                iter.remove();
            }
        }return list;
    }

}
