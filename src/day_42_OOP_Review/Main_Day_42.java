package day_42_OOP_Review;

public class Main_Day_42 {
    public static void main(String[] args) {
        Daire daire = new Daire();
        daire.setRadıus(4);
        System.out.println("daire.alan() = " + daire.alan());
        System.out.println("daire.cevre() = " + daire.cevre());
        System.out.println("daire.alan(5) = " + Daire.alan(5));
    }
}
