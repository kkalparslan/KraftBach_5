package Day_9_CFS_IfStatement;

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

        if (x == 10) { // true olduğu için
            y = 20; // y ye 20 sayısı atandı
        }
        System.out.println("y = " + y);*/

        //System.out.println("-----------------------------");
        //Task 2:
        /*int temp = 10; // sıcaklık 20 ve üzeri derece ise kelebekler uçar yazısını konsola
        yazdırın. burada 20 dereceden küçük olduğu için if değil else bloğunu çalıştırır.
        if (temp >= 20) {

            System.out.println("kelebekler uçar");
        } else {
            System.out.println("kelebekler bu sıcaklıkta uçamaz"); // 10 derece olduğu için burası çalıştı.

            System.out.println("................");*/

        // Task 3:
        // ayşenin harçlığı 5 liradan az ise babası ona 10 lira versin.

                /*int harclık = 7;
        if (harclık < 5) { // harçlık 5 dereceden büyük olduğu için if değil yine else bloğuna girecek
        ve mevcut harçlığı ile okula gideceğini yazdıracak
            harclık = harclık + 10;

        }else{
            System.out.println("ayşe bugün okula " + harclık + " lira ile gitmek durumunda kalacak");
            // konsola burasını yazdırdı..
        }
        System.out.println("harclık = " + harclık);*/

// Task 4: hesaptaki paranın takım elbiseyi alıp alamayacağını ele alan bir if sorusu..
            /*double hesap=2000;
            double takım=1999;
            if(takım<hesap){ // hesaptaki para takımın fiyatından büyük olduğu için bu bloğa girecek
             ve mesajı yazdıracak
                System.out.println("takım satın alınabilir... ");
            }else{
                System.out.println("takım satın alınamaz..yetersiz bakiye mevcut");

        // Task 5:

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
*/
        int a = 80;
        int b = 50;
        int c = 50;
        if (a + b + c == 180) {
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("bu bir dik üçgendir");
            } else {
                System.out.println("bu bir üçgendir");
            }
        } else {
            System.out.println("bu bir üçgen olamaz");
        }
    }


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

        Scanner scan = new Scanner(System.in);
        System.out.print("  lütfen sayıyı girin ");
        int num = scan.nextInt();

       if (num > 5) {
            System.out.println("sayı 5 ten büyüktür");
            if (num > 25) {
                System.out.println("sayı 25 ten büyüktür");
                if (num > 50) {
                    System.out.println("sayı 50 den büyüktür");
                } else {
                    System.out.println("sayı malesef 50 den küçük olduğu için bu else bloğuna da uğramıştır");
                }
            } else {
                System.out.println("sayı 5 ten büyük ama 25 ve 50 den küçüktür");
            }
        } else {
            System.out.println("sayı 5 ten küçük olduğu için işlem dışında kalmıştır");
        }



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

        }

         */
        }







































