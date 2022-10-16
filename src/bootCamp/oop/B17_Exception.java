package bootCamp.oop;

import java.io.FileWriter;

public class B17_Exception {
    // checked and unchecked
    // checked exception--- during compile time
    // unchecked exception: during runtime
    public static void main(String[] args) {
        int [] arr={5,7,9,10};
       // System.out.println("arr[50] = " + arr[50]); // runtime exception...unchecked exception
      //  FileWriter writer=new FileWriter(""); // checked exception...compile time exception

        String str=null;
        try {
//            System.out.println("str.length() = " + str.length()); // null pointer exception
//            System.out.println("arr[50] = " + arr[50]); // array index out of bound exception
//            Integer.parseInt("iki"); // number format exception
//            int i=55/0; // arithmetic exception
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("ne olursa olsun yürürüm");
        }


    }
    // **** throws key only handle checked exception ****
    // final vs finally vs finalize????
    // final is a keyword that I know
    // finally is a block that it can be used with try catch blocks and it always executed/runs..
    // finalize is a method collectors unreferanced object from garbage collection..
}
