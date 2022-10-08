package Day_1_benimCalısmalarim;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        System.out.println("bir rakam giriniz");
        Scanner scan =new Scanner(System.in);
        // 15:30:11 PM

        int hour =scan.nextInt();
        int minute=scan.nextInt();
        int second= scan.nextInt();
        scan.nextLine();
        String amOrPm=scan.nextLine();

        System.out.println(hour+":"+minute+":"+second+" "+amOrPm);



    }
}
