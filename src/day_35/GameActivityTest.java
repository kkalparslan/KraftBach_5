package day_35;

import java.util.Scanner;

public class GameActivityTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("kaç hedefle karşılaştınız");
        int düsman= scan.nextInt();
        System.out.println("kaç hedef vurdunuz");
        int isabet=scan.nextInt();
        Challenge challenge=new Challenge(düsman,isabet);
        System.out.println(challenge.getRank());
        System.out.println(challenge.getScore());


    }
}
