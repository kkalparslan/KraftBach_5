package bootCamp;

import javax.xml.soap.SAAJResult;

public class B7_MethodAndConstructor {

    // method: code fragment which can perform task
    // Access modifier return type name (parameter) {implementation/body/code}

    // method overloading:
    // same method different name, parameter in same class
    // return type no effect method overloading
    public static void message(String str) {
        System.out.println(str);
    }

    public static void message() {
        System.out.println("hello");
    }
    public static void message(String str, int a) {}
    public static void message(String str, int a, double b) {}
    public static void message(int a, double b, String str) {}
    public static void message( double b, int a, String str) {}
    public static void message( double b) {}
    public static void message(int a) {}
    public static void main(String[] args) {
        // method: code fragment which can perform task
        //Access modifier, return type, name(parameter){implementation/body/code}
        message("hello");
        message();
        message(5,10.0, "hello");
        //-----------
        // constructor
        Test1 test1=new Test1("hello");
        test1.str="big world";
        test1.any();

    }

    // constructor
    // special method
    // used for creating object
    // constructor name must be same with class name
    // does not have any return type
    // if we dont put any constructor always there is a default constructor as implicit
    // if we put a parameterized constructor there is no default constructor.
}
     class Test1 {
        String str;
         public Test1(String str){
            str=str;
            System.out.println(str);
        }
        public Test1(String str, int i){

        }
        public void any(){
            System.out.println(str);

        }
    }


