package Day_22_String_Class_Cont;

public class Lab_2_Cont {
    public static void main(String[] args) {
        //System.out.println(nokta("alp"));
        //System.out.println(twoLetterEnd("KAfka"));
        // System.out.println(" soy isminiz "+surname("alparslan can öztürk")+" 'dır");
        //System.out.println(yinelenenKarakterAt("alparslan"));
        //System.out.println(yinelenenHarfBul("javva"));



    }

    public static String shortLongShort(String str1, String str2) {
        String result = "";
        if (str1.length() < str2.length()) {
            for (int i = 1; i <= 2; i++) {
                System.out.print(str1);
            }
            for (int j = 1; j <= 30; j++) {
                System.out.print(str2);
            }
            for (int k = 1; k <= 2; k++) {
                System.out.print(str1);
            }
        } else if (str1.length() > str2.length()) {
            for (int i = 1; i <= 2; i++) {
                System.out.print(str2);
            }
            for (int j = 1; j <= 30; j++) {
                System.out.print(str1);
            }
            for (int k = 1; k <= 2; k++) {
                System.out.print(str2);
            }
        }
        return result;

    }

    public static String nokta(String kelime) {
        if (kelime.length() >= 5) {
            return kelime.substring(0, 5);
        } else {
            String result = "";
            for (int i = 0; i < 5 - kelime.length(); i++) {
                result += ".";
            }

            return kelime + result;
        }
    }

    public static boolean twoLetterEnd(String str) {
        String str1 = str.toLowerCase();
        return str1.substring(0, 2).equals(str1.substring(str1.length() - 2));
    }

    public static String surname(String str) {
        // 1. çözüm
        //String str1=str.trim();
        //return str1.substring(str1.lastIndexOf(" ")+1);

        // 2. çözüm yolu
        String str1 = str.trim();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                count = i;
            }
        }
        if (count == 0) {
            return "";
        } else {
            return str1.substring(count + 1);
        }
    }

    public static String yinelenenKarakterAt(String str) {
        String result = "";
        while (!str.isEmpty()) {
            result += str.charAt(0);
            str = str.replace(str.substring(0, 1), "");
        }
        return result;
    }

    public static String yinelenenHarfBul(String str) {
        str = str.replace(" ", "");
        String result = "";
        while (!str.isEmpty()) {
            if (str.substring(1).contains(str.substring(0, 1))) {
                result += str.substring(0, 1);
            }
            str = str.replace(str.substring(0, 1), "");
        }
        return result;
    }


}



