package bootCamp;

public class B4_String {
    public static void main(String[] args) {
        // String is sequences of char value
        // String immutable

        String str="Big";
        str.concat("Man");
        // if it is not reassign to str; str always return origijanl value
        System.out.println("str = " + str);

        str=str.concat("Man");
        // concat and reassign ----> we created a new string and pointed to this new string
        System.out.println("str = " + str);

        // heap
        //------------------------
        // |                      |
        // |    Big               |
        // |                      |
        // |    Big Man ----------|----- str
        // |                      |
        // |                      |
        // |                      |
        //-------------------------

        // --------------------

        // we can create string by two way
        // String literal
        String literal="KRAFT";

        // L
        // By new keyWord
        String byNew=new String("BootCamp");

        // String builder and string buffer mutable/değişken
        StringBuilder strBld=new StringBuilder("Boot");
        strBld.append("Camp");
        System.out.println("strBld = " + strBld); // BootCamp

        // method of String class
        // charAt()
    }
}
