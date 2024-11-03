package bootCamp.oop;

public class B11_Inheritance {
    // is a relationship between parent and child class
    // keyword extends---> sub/childClass extends super/parentClass
    // can not inheritance from subClass=subClass method ve değişkenlerini superClass kullanamaz.
    // a class can not extends more then one superClass
    // but a superClass can be extended more than one subClass
    // benefits: ınheritance prevent code duplication
    //         : provide easy maintainıng
    // example : basePage or testBase in automation framework
    public static void main(String[] args) {
        Child ahmet=new Child();
        Child ayşe=new Child("ayşe",5);
    }
}
//------parent class
class Parent{
    String name;
    int age;
    public Parent() {
        System.out.println("from parent class parameterized constructor");
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
//-------chaild class
class Child extends Parent{
    public Child() {
        super();//compiler put super() keyword automatically and implicit
    }
    // if there is parameterized constructor in the parentClass we must
    // put super with() parameter in childClass
    public Child(String name, int age) {
        super(name, age);
    }
}
