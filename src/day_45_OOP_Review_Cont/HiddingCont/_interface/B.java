package day_45_OOP_Review_Cont.HiddingCont._interface;

public abstract class B implements A {
    @Override
    public void M1() {
    }

    @Override
    public void M2() {
    }
}

class C extends B {
    @Override
    public void M3() {
    }

    @Override
    public void M4() {
    }
}
