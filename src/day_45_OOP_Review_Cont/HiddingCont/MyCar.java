package day_45_OOP_Review_Cont.HiddingCont;

public class MyCar {
    public static boolean haveSunroof(){
        return false;
    }
    public void getMyCarSunroofStatus(){
        System.out.println("my car have sunroof: "+haveSunroof());
    }
}
