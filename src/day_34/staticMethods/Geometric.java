package day_34.staticMethods;

import java.util.Random;

public class Geometric {
    static int primeter;
    static int conterSides;

    public static void setPrimeter(int... sides) {
        for (int i : sides) {
            primeter += i;
            conterSides++;
        }
        System.out.println(" geometrik şeklin cevresi "+primeter);
        System.out.println("geometrik şeklin kenar sayısı "+conterSides);
    }

}

class main2 {
    public static void main(String[] args) {
        //Geometric.setPrimeter(2,3);
        Geometric.setPrimeter(generateSide(),generateSide(),generateSide(),generateSide());
    }
    public static int generateSide(){
        Random rm=new Random();
        return rm.nextInt(10);
    }
}
