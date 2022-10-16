package bootCamp.oop;

public class B14_FinalKeyword {
    // final keyword: ıt means constant/değiştirilemez
    // final variable:
    // we can initialize 1-in same statement or 2-in constructor or 3-init block

    final double PI=3.14;
    final double PI2;
    final double PI3;
    final static double PI4;
    final static double PI5=3.14;
    B14_FinalKeyword(){
        PI2=3.14;
    }
    {
        PI3=3.14;
    }
    static {
        PI4=3.14;
    }
    // --------------------------
    // method
    // can not overriden

    // class
    // can not be inherited
    // for immutable consept: for example string class..
    // javada neden final keyword var gibi bir soru gelebilir? being final class is needed


}
