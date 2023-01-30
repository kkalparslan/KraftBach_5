package Day_15_MethodOverloading;

import java.util.Scanner;

public class Benim_Method_Calismalari {
    public static void main(String[] args) {

        /*  Düğün kartı bastıran bir program yazın.
        Kullanıcıdan 2 adet kelime isteyen bir metodunuz olsun. Bu metot
        kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun. Eğer
        kullanıcı cümleleri yanlışlıkla aynı girerse. Başka bir metot çağrılsın ve
        kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
        istesin. Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
        bağlayıp(concat) önünü ve arkasını yıldızlarla süsleyip versin.*/

//startingProcess("lütfen düğün kartı için iki isim giriniz");


    }

    public static void startingProcess(String message){
        Scanner scan=new Scanner(System.in);
        System.out.println(message);
        String name1= scan.nextLine();
        String name2= scan.nextLine();
        if(name1.equals(name2)){
            goingProcses();


        }else{
            goingProcess(name1,name2);

        }

    }
    public static void goingProcses(){
        String message= "girdiğiniz isimler aynı,,lütfen farklı iki isim giriniz";
        startingProcess(message);
    }
    public static void goingProcess(String str1, String str2){
        System.out.println("-------------------------------------");
        System.out.println("*************************************");
        System.out.println(" *******  "+str1+" && "+str2+"   ****** ");
        System.out.println("** mutluluğumuza davetlisiniz **");
        System.out.println("*********************************");
        System.out.println("----------------------------------");
    }

}
