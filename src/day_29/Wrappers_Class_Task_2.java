package day_29;

public class Wrappers_Class_Task_2 {
    public static void main(String[] args) {
        String str = "|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>" +
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*" +
                "*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||";
        String empty = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || str.charAt(i) == ' ') {
                empty += str.charAt(i);
            }
        }
       System.out.println("empty = " + empty);
    }

}
