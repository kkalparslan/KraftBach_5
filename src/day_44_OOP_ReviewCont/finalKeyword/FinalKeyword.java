package day_44_OOP_ReviewCont.finalKeyword;

public class FinalKeyword {
    static final int f=10; // 1. nokta
    final int n;
    final int l;
    static final int sl;

    public FinalKeyword(){ // 2. nokta
        n=20;
        System.out.println("n = " + n);
    }
    {
        l=30;  // 3. nokta
        System.out.println("l = " + l);
    }
    static {
        sl=40;
        System.out.println("sl = " + sl);
    }

}
class run{
    public static void main(String[] args) {
        FinalKeyword finalKeyword=new FinalKeyword();
        System.out.println("------------------------");
        FinalKeyword finalKeyword1=new FinalKeyword();
    }
}

