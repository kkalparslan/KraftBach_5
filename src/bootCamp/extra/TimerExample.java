package bootCamp.extra;

import java.util.Scanner;

public class TimerExample {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number of minute");
        int minute = sc.nextInt();
        for (int i = minute; i > 0; i--) {
            if (i < 0) {
                break;
            }
            for (int z = 59; z >= 0; z--) {

                for (int j = 99; j >= 0; j--) {
                    System.out.print("\r" + (i - 1) + " minutes and " + z + " seconds " + j + " cs"); //cs
                    // santisaniye demek saniyenin 100 de 1
                    Thread.sleep(10);
                }
            }
        }
        System.out.println("\n");
        System.out.println("|----------------|");
        System.out.println("|   TIME IS UP   |");
        System.out.println("|----------------|");
    }
}
