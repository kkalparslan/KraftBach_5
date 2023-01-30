package day_29_Warargs;

public class Wrapper_Class_2 {
    public static void main(String[] args) {
        Integer I =10;
        int i =I.intValue();
        System.out.println("i = " + i);

        Byte B =100;
        byte b = B.byteValue();
        System.out.println("b = " + b);

        Boolean Bl = true;
        boolean bl = Bl.booleanValue();
        System.out.println("bl = " + bl);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Integer.sum(10,20) = " + Integer.sum(10, 20));

        System.out.println("Double.max(10,20) = " + Double.max(10, 20));

        System.out.println("Character.isDigit('a') = " + Character.isDigit('a'));
        System.out.println("Character.isDigit('4') = " + Character.isDigit('4'));
        System.out.println("Character.isLetter('4') = " + Character.isLetter('4'));
        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));
        System.out.println("Character.isAlphabetic('a') = " + Character.isAlphabetic('a'));
        System.out.println("Character.isAlphabetic('4') = " + Character.isAlphabetic('4'));
        System.out.println("Character.isUpperCase('a') = " + Character.isUpperCase('a'));
        System.out.println("Character.isUpperCase('A') = " + Character.isUpperCase('A'));
        System.out.println("Character.isLowerCase('b') = " + Character.isLowerCase('b'));
        System.out.println("Character.isLowerCase('B') = " + Character.isLowerCase('B'));


    }
}
