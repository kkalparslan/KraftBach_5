package Day_9;

import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {

      /*  int hız = 10;
        boolean isMoving = true;

        if (isMoving) {
            hız++;
        }
        System.out.println("hız = " + hız);*/

        /*System.out.println("-----------------------------");


       int x = 10;
        int y = 105;

        if (x == 10) {
            y = 20;
        }
        System.out.println("y = " + y);*/

        System.out.println("-----------------------------");
        //task 2

        /*int temp = 10;
        if (temp >= 20) {

            System.out.println("kelebekler uçar");
        } else {
            System.out.println("kelebekler bu sıcaklıkta uçamaz");

            System.out.println("................");*/

                /*int harclık = 7;
        if (harclık < 5) {
            harclık = harclık + 10;

        }else{
            System.out.println("ayşe bugün okula " + harclık + " lira ile gitmek durumunda kalacak");
        }
        System.out.println("harclık = " + harclık);*/



            /*double hesap=1000;
            double takım=1999;
            if(takım<hesap){

                System.out.println("takım satın alınabilir... ");

            }else{
                System.out.println("takım satın alınamaz..yetersiz bakiye mevcut");


        // task 5

        Scanner scan = new Scanner(System.in);
        int a;
        int b;

        System.out.print("lütfen sayıları girin");
        a = scan.nextInt();
        b = scan.nextInt();

        if (a == b) {
            System.out.println("sayılar eşittir");

        } else {
            System.out.println("sayılar malesef eşit değildir");
        }*/


//task ÖDEV AŞAĞIDA YAPILDI...

        /*Scanner scan = new Scanner(System.in);

        int a;
        int b;
        int c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a > b && a > c) {
            System.out.println("a " + "büyük sayıdır");

        } else if (b > a && b > c) {
            System.out.println("b " + "büyük sayıdır");

        } else if (c > a && c > b) {
            System.out.println("c " + "büyük sayıdır");

        } else {
            System.out.println("işlem doğru değildir");*/

        //Scanner scan = new Scanner(System.in);

        /*int a;
        int b;
        int c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

            if((a+b)>c){
                c=(a-b);
                System.out.println("c = "+ c);*/

        /*int a;                               ;
        int b;

        a = scan.nextInt();
        b = scan.nextInt();

        if(a>b){
            System.out.println("a "+ " büyük sayıdır");
        } else if (a<b) {

            System.out.println("b " + "büyük sayıdır");

        }else{
            System.out.println(" a ve b eşit sayılardır");


        int number=scan.nextInt();
        if(number%2==0){
        System.out.println("bu bir çift sayıdır");
        }else {
            System.out.println("bu bir tek sayıdır");


            if (a1+b1+c1==180){
            if (a1 == 90 || b1 == 90 || c1 == 90) {
                System.out.println("bu bir dik üçgendir");
            } else {
                System.out.println("bu bir üçgendir");
            }
        } else {
            System.out.println("bu bir üçgen olamaz");*/


        /*System.out.println("lütfen not aralıklarını giriniz");
        double a;
        double b;
        double c;
        double d;
        double e;
        a= scan.nextDouble();
        b= scan.nextDouble();
        c= scan.nextDouble();
        d= scan.nextDouble();
        e= scan.nextDouble();
        double sonuc=


            // cuma günü ilk örneği yap burada

        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        if (a > 5) {
            System.out.println("a " + "beşten büyüktür");
            if (a > 25) {
                System.out.println(a");
                if () {

                }
            }
        }

        System.out.println("lütfen sayıları girin");

        int num;

        System.out.print("  lütfen sayıyı girin ");
        num = scan.nextInt();

       if (num > 5) {
            System.out.println("sayı 5 ten büyüktür");
            if (num > 25) {
                System.out.println("sayı 25 ten büyüktür");
                if (num > 50) {
                    System.out.println("sayı 50 den büyüktür");
                } else {
                    System.out.println("sayı malesef 50 den küçük olduğu için bu else bloğuna da uğramıştır.");
                }
            } else {
                System.out.println("sayı 5 ten büyük ama 25 ve 50 den küçüktür");
            }
        } else {
            System.out.println("sayı 5 ten küçük olduğu için işlem dışında kalmıştır");
        }*/




        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif bir sayı tahmin et ");
        int num = 40;
        int tah = scan.nextInt();


        if (tah<num) {
            if(tah>num/2){
                System.out.println("tahmininiz çok yaklaştı ama biraz daha büyük bir sayı söyleyin");
            }else if(tah<num/2){
                System.out.println("tahmininiz yakın değil daha büyük bir sayı söyleyin");
            }else{
                System.out.println("tahminini 2 ile çarparsan doğru sonucu bulursun");
            }

        }else if(tah>num){
            if(tah<num+num/2){
                System.out.println("tahmininiz çok yaklaştı ama biraz daha küçük bir sayı söyleyin");
            }else if(tah>num+num/2){
                System.out.println("tahmininiz yakın değil daha küçük bir sayı söyleyin");
            }else{
                System.out.println("tahminini 2 ye bölersen doğru sonucu bulursun");
            }

        }else{
            System.out.println("tahmininiz doğrudur,,,TEBRİKLER");
        }











            //Scanner scan = new Scanner(System.in);


//System.out.println("pozitif bir sayı girin");

        /*int a1=60;
        int b1=30;
        int c1=90;*/


        }
    }





































