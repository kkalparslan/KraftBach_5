package bootCamp;

public class B9_ObjactAndClass {
    // class is template of object------> what properties an behavior the object
    // class nesnenin bir şablondur.----- nesneye ait davranış ve özellikler classdan gelir.

    // object: comes from class----ıt is an instance of class..
    // nesne classın bir örneğidir.

    // fields--->instance
    String name;
    // fields--->static
    static String schoolName="KRAFT";
     // behavior ----> method ---> instance
    void action(){
        System.out.println("action of "+name);
    }
    // behavior--->static
    static void status(){
        System.out.println("student");
    }
}
class Test{
    public static void main(String[] args) {
        // object comes from class--->instance of this class
        B9_ObjactAndClass copy=new B9_ObjactAndClass();
        copy.name="name1";
        copy.action();

        B9_ObjactAndClass copy2=new B9_ObjactAndClass();
        copy2.name="name1";
        copy2.action();

        // instance vs static
        // instance--> belongs to the object--> each object has its qwn copy
        // static--> belongs to the class--> only one copy for all object

        // static olmayan methoddan static ve non static
        // static methoddan ise sadece static elemanlara erişebiliriz.
        B9_ObjactAndClass.schoolName="superKraft";
        B9_ObjactAndClass.status();

    }
}
