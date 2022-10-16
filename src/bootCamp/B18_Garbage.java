package bootCamp;

public class B18_Garbage {
    public static void main(String[] args) {
        // two ways
        // 1- reassign
        String str="Car"; //garbage
        str="truck";

        // 2- assig null
        String str2="cat"; // garbage---referansını kaybederse garbage a gidiyor
        str2=null;
         // how/when an object send to garbage collection..
        // if an object being without referance, it will thrown garbage collection..

    }


}
