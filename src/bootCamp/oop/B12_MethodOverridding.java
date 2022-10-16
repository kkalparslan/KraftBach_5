package bootCamp.oop;

public class B12_MethodOverridding {
    // only happen in sub/childClass
    // method name, return type, parameter must be same.
    // access modifier must be same or more visible
    // final-private-static methods can not averride

    // benefits of overriding: one method different implementation
    public void method() {
        System.out.println("from parent");
//    }
//    static void method(){} not override
//    private void method(){} not override
//    final void method(){} not override
    }

    //------- childClass
    class B extends B12_MethodOverridding {
        @Override
        public void method() {
            System.out.println("from child");
        }
    }

//    class Test {
//        public static void main(String[] args) {
//             B b=new B();
//              b.method();
//
//            B12_MethodOverridding c = new B12_MethodOverridding();
//            c.method();
//        }
    }

