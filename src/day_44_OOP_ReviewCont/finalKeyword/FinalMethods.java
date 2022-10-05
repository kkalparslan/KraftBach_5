package day_44_OOP_ReviewCont.finalKeyword;

public class FinalMethods {
    public final void method(){
        System.out.println("method");
    }
}
class drived extends FinalMethods{
    // override
    // public void method(){} // final methodlar overrite olmaz
}

