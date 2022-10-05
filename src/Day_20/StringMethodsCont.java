package Day_20;

import java.util.Scanner;

public class StringMethodsCont {
    public static void main(String[] args) {
       // System.out.println(findFirstCharInSecond("talip","tıraş"));
        //System.out.println(countY("javayı seviyor muyum"));
        // System.out.println(sesliHarf("javayı seviyor muyum"));
        //bayram();
        //lastThree("Alparslan");
        //System.out.println(mediumThree("alparslan"));
        //System.out.println(simulateNames("alparslan", "öztürk"));
        //withoutFirst("atalip","öztürk");
        //System.out.println(nickNameGen("alparslan", "öztürk"));


    }

    public static int findFirstCharInSecond(String str1, String str2) {
        return str2.indexOf(str1.charAt(0));
    }

    public static int countY(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                count++;
            }
        }
        return count;

    }

    public static String sesliHarf(String str) {
        String holder = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'ü':
                case 'u':
                case 'ı':
                case 'o':
                    holder += str.charAt(i);
                    break;
                default:

            }

        }
        return holder;

    }

    public static void bayram() {
        System.out.println(" bayram ile ilgili bir cümle giriniz");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.contains("sev")) {
            System.out.println("what a lovely person");
        } else {
            System.out.println(" you are a rude person");
        }
    }

    public static void lastThree(String str) {
        String holder = "";
        for (int i = 0; i < 3; i++) {
            holder += str.substring(str.length() - 3);


        }
        System.out.println(holder);

    }

    public static String mediumThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);

    }

    public static String simulateNames(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1.substring(0, str2.length()).concat(str2);

        } else if (str2.length() > str1.length()) {
            return str1.concat(str2.substring(0, str1.length()));

        } else {
            return str1.concat(str2);
        }

    }
    public static String withoutFirst(String str1, String str2) {
        String empty = "";
        char birincininİlkHarfi = str1.charAt(0);
        for (int i = 0; i < str1.length(); i++) {
            if (str2.charAt(i) != birincininİlkHarfi) {
                empty += str2.charAt(i);
            }

        }
        System.out.println(empty);
        return empty;
    }
    public static String nickNameGen(String name, String surname){
        String nickname= name.substring(0,3).concat(surname.substring(surname.length()-3));
        return nickname;
    }


       }




