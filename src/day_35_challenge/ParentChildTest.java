package day_35_challenge;

public class ParentChildTest {
    public static void main(String[] args) {
        ChildClass childClass=new ChildClass();
        //childClass.print_message_P();
        childClass.print_message_C();

        ParentClass parentClass=new ParentClass();
       // parentClass.print_message_P();
        //parentClass.print_message_C(); // parent class child classın methodları
                                         //ve fields larına erişemez
    }
}
