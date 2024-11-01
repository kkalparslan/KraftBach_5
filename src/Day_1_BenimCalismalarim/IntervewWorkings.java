package Day_1_BenimCalismalarim;

public class IntervewWorkings {

    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i+" nin karesi: "+i*i);
//
//        }

//        for(int i=1; i<100; i++){
//            System.out.print(" "+i);}

//        String str="Hatice";
//        String str2="";
//        for (int i=str.length()-1; i>=6;i-- ){
//            char c=str.charAt(i);
//            str2+=c;
//            System.out.println(str2);
//        }

//        for(int a=1; a<=5; a++) {
//            for(int b=1; b<=10; b++) {
//                System.out.print((b*a)+"\t");
//            }
//            System.out.println();
//        }

//        for(int a=10; a>=1; a--) {
//            for(int b=1; b<=a; b++) {
//                System.out.print("*");
//            }
//            System.out.println("- ");
//        }
//        String s="America";
//
//        for (int i =0 ; i<s.length() ; i++){
//
//            char c = s.charAt(i);
//
//            if (c=='c'){
//                break;
//            }
//            System.out.print(c);
//        }

//        for (int i = 14; i >5 ; i--) {
//            if(i%2==0){
//                System.out.print(i+" ");
//            }
        /**
         * String bir Array'de "Hanzel" ve "Hanzel" den onceki tum elemanlari ekrana yazdiriniz.
         * String arr [ ] = {"Betul", "Mustafa", "Hakan", "Hanzel", "Mete", "Mehmet"};
         */

//        String arr[] = {"Betul", "Mustafa", "Hakan", "Hanzel", "Mete", "Mehmet"};
//        for (String str : arr) {
//            System.out.print(str + " "); //
////"Hanzel" ismini gormek istemiyorsaniz sout'u en sona yazdirin.
//            if (str.equals("Hanzel")) {
//                break;
//            }
//        }
        /**
         * String bir Array olusturunuz ve "Hanzel" ve "Betul" haric tum elemanlari ekrana yazdiriniz.
         * String arr [ ] = {"Betul", "Mustafa", "Hakan", "Hanzel", "Mete", "Mehmet"};
         */

//        String arr[] = {"Betul", "Mustafa", "Hakan", "Hanzel", "Mete", "Mehmet"};
//        for (String str: arr) {
//            if(str.equals("Betul") || str.equals("Hanzel")){
//                continue;
//            }
//            System.out.println(str+" ");
//        }

        /**
         * SORU:Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.
         * "Cahile söz anlatmak, deveye hendek atlatmaktan zordur."
         */

//        String sentence = "Cahile söz anlatmak, deveye hendek atlatmaktan zordur.";
//
//        System.out.println(sentence);
//
//        sentence = sentence.replace(",","").replace(".","");
//        System.out.println(sentence);
//
//        //sentence.split(" ");
//
//        String words[] = sentence.split(" ");
//
//        Arrays.sort(words, Comparator.comparingInt(String::length));
//        System.out.println(Arrays.toString(words));
//
//        System.out.println(words[words.length-1]);

        /**
         * Size verilen bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol edem ve kac kere tekrarlandigini gosteren kodu yaziniz.
         *int arr [] = {2, 1, -3, 2};
         */
//        int arr [] = {2, 1, -3, 2};
//        int eleman = 3;
//        int counter = 0;
//        for (int i: arr) {
//            if (i==eleman) {
//                counter++;
//            }
//        } if (counter>0) {
//            System.out.println(eleman + ": array'de " + counter + " defa var");
//        } else {
//            System.out.println(eleman + ": array'de yok");
//        }
        /**
         * "Aysegul" String'ini "A-y-s-e-g-u-l-" String'ine ceviren kodu yaziniz
         */
//        String harf = "Aysegul";
//        for (int i =0; i<harf.length(); i++) {
//            System.out.print(harf.charAt(i) + "-");
//        }
//        System.out.println();

        /**
         * Size verilen String'de tekrarsiz characterleri ekrana yazdiriniz.
         * "Hababam siniffi tatillddee."
         */
//        String kelime = "Hababam siniffi tatillddee.";
//        for (int i = 0; i < kelime.length(); i++) {
//            char tekrarsiz = kelime.charAt(i);
//            if (kelime.indexOf(tekrarsiz) == kelime.lastIndexOf(tekrarsiz)) {
//                System.out.print(tekrarsiz);
//            }
//        }
        /**
         * 67'den 80'e kadar tam sayilarin toplamini bulan kodu yaziniz.
         */
        int sum = 0;
        for (int i = 67; i <81 ; i++) {
            sum = sum+i;
        }
        System.out.print(sum);
    }
}



