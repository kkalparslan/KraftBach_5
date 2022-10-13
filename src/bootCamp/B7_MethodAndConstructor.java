package bootCamp;

public class B7_MethodAndConstructor {
    public static void main(String[] args) {
        // method: code fragment which can perform task
        //Access modifier, return type, name(parameter){implementation/body/code}
        message("hello");
        message();
       // Test test=new Test();
    }
    // method overloading
    // same method different name,,parameter in same class
    // return type no effect method overloading
    public static void message (String str){
        System.out.println(str);
    }
    public static void message (){
        System.out.println("hello");
    }
    public static void message(String str, int a){}
    public static void message(String str, int a, double b){}
    public static void message(double b, String str, int a ){}
    public static void message(String str, double b, int a){}
    public static void message(int a){}


    // constructor
    // special method
    // used for creating objact
    // constructor name must be same with class name
    // if we dont put any constructor always there is a default constructor as implicit
    // if we put a parameterized constructor there is no default constructor.

    class Test {
        String str;
        public Test(String str){
            str=str;
            System.out.println(str);
        }
        public void any(){

        }
    }

}
