package day_44_OOP_ReviewCont.accessModifier1;

public class CarTest1 {

    // private CartTest1(){} private constructor ait olduğu
    // sınıftan başka classdan nesne üretilmesini engeller.
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.model = "mazda";
        car1.engine = 1.6;
        car1.year = 2019;
        // car1.door=4;
        System.out.println(car1);
        System.out.println(car1);
    }
}
