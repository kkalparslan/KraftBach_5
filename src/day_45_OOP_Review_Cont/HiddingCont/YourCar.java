package day_45_OOP_Review_Cont.HiddingCont;

public class YourCar extends MyCar {
    public static boolean haveSunroof1() {
        return true;
    }

    public void getYourCarSunroofStatus() {
        System.out.println("your car have sunroof: " + haveSunroof());
    }
}
