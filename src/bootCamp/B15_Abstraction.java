package bootCamp;

public class B15_Abstraction {
    // hiding implemetation
    // focusing essential, ignore details
    // important point abstraction: abstract methods..
    // abstract classes do not have body so implemantation is not allowed
    // abstract method can not be private, final and static
    // abstractions have two ways: --**1**--abstract class
    //                             -----------------------;
    // abstract class can not be final. because it is parent.
    // we can not create object from abstract class but abstract classes--
    //--can have all types and all methods
    // normal/regular class can not have abstract methods
    // --**2**-- interface
    // -------------------;
    // blue print of class
    // provide additional methods//classlara ilave method desteği sağlayabiliyor.
    // it is not a class, it is pure abstraction
    // can not create object
    // keyword: implement
    // allows multiple inheritance
    // has one type variable

}
abstract class Vehicle{
    abstract double price();
}
class Car extends Vehicle implements I{
    @Override
    double price() {
        return 0;
    }
}
interface I{
    public static final String name="ahmet";// variable

}
