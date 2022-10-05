package day_36_Inheritance_Cont;

public class Class_B extends Class_A{
    int b;
    public Class_B(int a, int b){
        super(a);
        this.b=b;
    }
    public void bMetodu(){
        System.out.println("b metodu");
    }
}
