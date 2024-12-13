package day_45_OOP_Review_Cont.HiddingCont.abstraction;

public class D3PrintTest {
    public static void main(String[] args) {
        Mod1 toy = new Mod1("ToyCar", "OBJ");
        System.out.println("-----------------------------");
        Mod1 toy2 = new Mod1("ToyMankey", "STL");
        System.out.println("-----------------------------");
        Mod1 toy3 = new Mod1("ToyTruck", "OBJ");
        System.out.println("-----------------------------");
        Mod1 toy4 = new Mod1("ToyCard", "STL");
        System.out.println("-----------------------------");
        Mod1 toy5 = new Mod1("doll", "OBJ");
        //     mod1.extrude();mod1.polish();
    }
}
