package day_35_challenge;

public class ChildClass extends ParentClass{
    public void print_message_C(){
        print_message_P();
        System.out.println("  world");

    }
}
