package Day_1_BenimCalismalarim;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_2_PasswordControl {
    static boolean control;
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            passwordConrol(generateRandomString());
//            if (control){
//                System.out.println(generateRandomString());
//                control=false;
//            }
//        }

        String str="Ahmet";
        str=str.replaceAll("[^a-z]","");
        System.out.println(str);
    }
    public static void passwordConrol(String password){
        String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
        //String regex2 = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d\\p{Punct}]{8,16}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Password is  valid..");
        } else {
            control=true;
            System.out.println("Password is not valid..");
        }
    }
    public static String generateRandomString2() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 8 + random.nextInt(9); // 8 ile 16 arasında bir sayı üret
        for (int i = 0; i < length; i++) {
            int type = random.nextInt(3);
            char c;
            if (type == 0) { // Büyük harf
                c = (char) (random.nextInt(26) + 'A');
            } else if (type == 1) { // Küçük harf
                c = (char) (random.nextInt(26) + 'a');
            } else { // Sayı
                c = (char) (random.nextInt(10) + '0');
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static String generateRandomString() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String punctuation = "!@#$%^&*()_+-=[]{};:'\"<>,.?/\\|"; // Noktalama işaretleri
        int length = 8 + random.nextInt(9); // 8 ile 16 arasında bir sayı üret
        for (int i = 0; i < length; i++) {
            int type = random.nextInt(4);
            char c;
            if (type == 0) { // Büyük harf
                c = (char) (random.nextInt(26) + 'A');
            } else if (type == 1) { // Küçük harf
                c = (char) (random.nextInt(26) + 'a');
            } else if (type == 2) { // Sayı
                c = (char) (random.nextInt(10) + '0');
            } else { // Noktalama işareti
                c = punctuation.charAt(random.nextInt(punctuation.length()));
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
