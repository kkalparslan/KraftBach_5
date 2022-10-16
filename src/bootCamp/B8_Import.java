package bootCamp;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.max; // static import static üyelere doğrudan erişebiliriz.

public class B8_Import {
    // normal
    // import packageName.className;----> any importing
    // import packageName.* ---> all classes

    // static import
    // static packageName.className.staticMember;
    // static packageName.className.*;
    // benefit of static import is I can reach static member of library without typing class name
    // faydası: kütüphanelerdeki veya classlardaki  static üyelere class adını yazmadan
    // doğrudan erişim sağlar

    Scanner scan = new Scanner(System.in);// normal import

    public static void main (String [] args){
        max(5,5); // static import is needed..max metoduna doğrudan erişmiş olduk..
        max(5,7);


    }
}
