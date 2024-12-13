package day_45_OOP_Review_Cont.HiddingCont._interface;

public interface A {
    // public static final int i; // instance variable olmaz.
    int i = 10;
    int j = 20;

    void M1();

    void M2();

    void M3();

    void M4();

    default void M5() {
    } // tüm alt sınıfları kolayca etkilemek

    // için default method kullanımına izin verilmiş
    // backyard compatibility / geriye dönük uyumluluk //java 8
    static void M6() {
    }  //java 8
    // private void M7(){} // JAVA 9
}
