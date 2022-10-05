package Day_21_String_Class;

public class Lab3 {
    public static void main(String[] args) {
        // System.out.println(sonİkiHarf("alparslan"));
        //System.out.println(defa("---", "**"));
        //System.out.println(nokta("alp"));
        //System.out.println(twoLetterEnd("alparslal"));

    }
    // 3. çözüm
    public static String defa(String str1, String str2) {
        String result = "";
        for (int i = 0; i < 2; i++) {
            result += str1 + str1;
            for (int j = 0; j < 30; j++) {
                if (i == 1) {
                    return result;
                }
                result += str2;
            }
        }
        return result;
    }
    //        String result = "";
//        if (str1.length() < str2.length()) {
//            for (int i = 1; i <= 2; i++) {
//                result += str1;
//            }
//            for (int i = 1; i <= 30; i++) {
//                result += str2;
//            }
//            for (int k = 1; k <= 2; k++) {
//                result += str1;
//            }
//        }
//        else if(str1.length() > str2.length()) {
//            for (int i = 1; i <= 2; i++) {
//                result += str2;
//            }
//            for (int i = 1; i <= 30; i++) {
//                result += str1;
//            }
//            for (int k = 1; k <= 2; k++) {
//                result += str2;
//            }
//        }
//        return result;
//   }  2. çözümmmmm.............................................
//        String result = "";
//        result += str1 + str1;
//        for (int i = 0; i < 30; i++) {
//            result = str2;
//        }
//        result += str1 + str1;
//        return result;
    public static String nokta(String kelime) {
        if (kelime.length() >= 5) {
            return kelime.substring(0, 5);
        } else {
            String result = "";
            for (int i = 0; i < 5 - kelime.length(); i++) {
                result += ".";
            }
            return kelime.concat(result);
        }

    }

    //11. SORU
    public static boolean twoLetterEnd (String str){
        String str1=str.toLowerCase();
        //return str1.substring(0,2).equals(str1.substring(str1.length()-2)); 2. yol aşağıda
        return str1.endsWith(str1.substring(0,2));




    }



}











