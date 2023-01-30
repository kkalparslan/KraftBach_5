package day_30_Arraylist;

import java.util.ArrayList;

public class ArrayList_5 {
    //copy, contains, containsAll
    public static void main(String[] args) {
        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");

        ArrayList<String> allDays = new ArrayList<>(weekDays);
        System.out.println("allDays.get(0) = " + allDays.get(0));

//        ArrayList<String> alterDay=allDays;
//        alterDay.set(0,"Pazartesi");
//        System.out.println("after set pazartesi allDays.get(0) = " + allDays.get(0));

        allDays.add("Saturday");
        allDays.add("Sunday");
        System.out.println("allDays = " + allDays);
        System.out.println("allDays.contains(Tuesday) = " + allDays.contains("Tuesday"));
        System.out.println("allDays.indexOf(Tuesday) = " + allDays.indexOf("Tuesday"));
        System.out.println(allDays.get(1) == "Tuesday");
        System.out.println("allDays.get(1).equals(\"Tuesday\") = " + allDays.get(1).equals("Tuesday"));
        System.out.println("allDays.containsAll(weekDays) = " + allDays.containsAll(weekDays));
        System.out.println("weekDays.containsAll(allDays) = " + weekDays.containsAll(allDays));


    }
}
