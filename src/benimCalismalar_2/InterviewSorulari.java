package benimCalismalar_2;

import java.util.ArrayList;

public class InterviewSorulari {

//    public static ArrayList<Object> separateList(String string) {
//        ArrayList<Object> list = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        boolean isNumber = Character.isDigit(string.charAt(0));
//        for (char c : string.toCharArray()) {
//            if (Character.isDigit(c) == isNumber) {
//                sb.append(c);
//            } else {
//                list.add(isNumber ? Integer.parseInt(sb.toString()) : sb.toString());
//                sb.setLength(0);
//                sb.append(c);
//                isNumber = !isNumber;
//            }
//        }
//        list.add(isNumber ? Integer.parseInt(sb.toString()) : sb.toString());
//        return list;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(separateList("125klm89dyhr41"));
//        // Output: [125, "klm", 89, "dyhr", 41]
//    }

    /**
     * stringBuilder kullanmadan verilen metin dizesinde her karakteri için kontrol eder.
     * Rakamları sayı olarak ve harfleri metin olarak aynı liste içine ekler. Sonuç olarak,
     * tek bir listeyi geri döndürür
     */
    public static ArrayList<Object> separateList(String string) {
        ArrayList<Object> list = new ArrayList<>();
        String control = "";
        boolean isNumber = Character.isDigit(string.charAt(0));
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isDigit(c) == isNumber) {
                control += c;
            } else {
                list.add(isNumber ? Integer.parseInt(control) : control);
                control = "";
                control += c;
                isNumber = !isNumber;
            }
        }
        list.add(isNumber ? Integer.parseInt(control) : control);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(separateList("125klm89dyhr41"));
        // Output: [125, "klm", 89, "dyhr", 41]


    }


}








