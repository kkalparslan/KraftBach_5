package day_48_Collections;

import java.util.Stack;

public class Stack_Example {
    public static void main(String[] args) {
        Stack <Object>stack=new Stack();
        stack.add(true);
        stack.add(5);
        stack.add("merhaba");
        stack.add('c');
        stack.add(8.8);

        System.out.println("stack = " + stack);//[true, 5, merhaba, c, 8.8] farklı veri türlerini kabul ediyor
        System.out.println("size() = " + stack.size()); // size() = 5
        System.out.println("pop() = " + stack.pop());  // pop() = 8.8 LİFO last in first out
                                                       // sırasına göre son gireni atıyor
        System.out.println("stack = " + stack);  // [true, 5, merhaba, c]
        System.out.println("pop() = " + stack.pop()); // pop() = c
        System.out.println("size() = " + stack.size()); // size() = 3
        System.out.println("stack = " + stack); // [true, 5, merhaba]
        System.out.println("peek() = " + stack.peek()); // peek() = merhaba son indexteki değeri döndürüyor
                                                        // ama pop metodu gibi değeri göndermiyor
        System.out.println("size() = " + stack.size()); // size() = 3
        System.out.println("stack = " + stack);


    }
}
