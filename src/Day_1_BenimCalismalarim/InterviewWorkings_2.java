package Day_1_BenimCalismalarim;

public class InterviewWorkings_2 {

    public static void main(String[] args){

        /**
         * Verilen bir Listteki elemanlari tekrarsiz olarak yaziniz.List<Integer> a = new ArrayList<>();
         * a.add(2);
         * a.add(3);
         * a.add(2);
         * a.add(2);
         * a.add(5);
         *
         * List<Integer> yeni = new ArrayList<>();
         *
         * for (int w : a) {
         *
         * if (!yeni.contains(w)) {
         *
         * yeni.add(w);
         * }
         * }
         * System.out.println(yeni);
         *             [2, 3, 2, 2, 5] ==> [2, 3, 5 ]
         *
         *             List<Integer> a = new ArrayList<>();
         * List<Integer> yeni = new ArrayList<>();
         *
         * for (int w : a) {
         *
         * if (!yeni.contains(w)) {
         *
         * yeni.add(w);
         * }
         * }
         * System.out.println(yeni);
         */
//        List<Integer> list=new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(2);
//        list.add(5);
//        System.out.println(list);
//        List<Integer> yeni = new ArrayList<>();
//
//        for (int i:list) {
//            if(!yeni.contains(i)){
//                yeni.add(i);
//                }
//        }System.out.println(yeni+" ");

        /**
         * Write code to print below pattern (code to be written & run using eclipse)
         *  1
         *  3 3
         *  5 5 5
         *  7 7 7 7
         */

//        int lines=4;
//        int numbers=1;
//        for (int i = 1; i <=lines ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(numbers+" ");
//            }
//            numbers+=2;
//            System.out.println(" ");
//
//        }

        /**
         * swap two numbers with and without using temporary variable.
         */

//        int a=5;
//        int b=10;
//        System.out.println("a: "+a +"\t"+"b: "+b);
//
//        int toplam=a+b;
//        b=toplam-b;
//        a=toplam-a;
//        System.out.println("a: "+a +"\t"+"b: "+b);
//        System.out.println("___________________________");
//
//        int first=6;
//        int second=8;
//
//        first=first-second;
//        second=first+second;
//        first=second-first;
//
//        System.out.println("first: "+first);
//        System.out.println("second: "+second);

        /**         //int değeri Stringe çevirmek
         *         int first=6;
         *         int second=8;
         *
         *         String str=Integer.toString(first);
         *         String dtr1=String.valueOf(second);
         *         System.out.println("dtr1 = " + dtr1);
         *         System.out.println("str = " + str);
         *
         *         //String bir değeri int değere
         *         int third=Integer.parseInt("6");
         *         System.out.println("third = " + third);
         *         System.out.println("first: "+first);
         *         System.out.println("second: "+second);
         */






    }
}
