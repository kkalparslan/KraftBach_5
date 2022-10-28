package Day_11_Loops;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {

        //for(int x=0; x<5; x++){
        //  System.out.println(x);
        //}

        //for(char i= 'A'; i<='Z'; i++){
        //System.out.print(i+ " ");
        //}

       /* for(int i=1; i<=10; i++){
          System.out.println("9 x "+i+ " = "+(i*9));
        }
*/
        Scanner scan = new Scanner(System.in);
        String sifre = "alp";
        System.out.println("*** şifreyi bulmak için 5 hakkın var ***");
        for (int i = 0; i < 5; i++) {
            System.out.println("lütfen bir kelime giriniz: ");
            String kullaniciKelimesi = scan.nextLine();
            if(kullaniciKelimesi.equals(sifre)){
                System.out.println("tebrikler kelimeyi buldunuz");
                break; // break kullanmaz isek doğru kelimeyi bulsa da
                // for döngüsündeki dönüş kadar dönmeye devam eder
            }else{
                System.out.println("kelimeyi bulamadınız");
            }
        }





    }
}
