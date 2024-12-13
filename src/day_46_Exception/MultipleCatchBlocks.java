package day_46_Exception;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
//        int arr []=new int[4];
//        System.out.println("program başladı");
//        try{
//            System.out.println(arr[5]); //exception ı aşağıda doğru tanımlamaz
//            // isek hatayı verip programdan çıkış yapıyor
//           // System.out.println(5/0);
//        }catch (ArithmeticException e){
//            System.out.println("aritmetik exception yakalandı");
//            System.out.println(e.getMessage());
//        }
//        System.out.println("program sonlandı");

        //int arr []=new int[4];
//        System.out.println("program başladı");
//        try{
//          //  System.out.println(arr[5]);
//            System.out.println(5/0);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException yakalandı");
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            System.out.println("Exception yakalandı");
//            System.out.println(e.getMessage());
//        }
//        System.out.println("program sonlandı");


        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException | IndexOutOfBoundsException e) { // aynı catch bloğunda birden fazla
//            exception tanımlanabilir. Ancak bu exceptionlarda is a ilişkisi olmamalıdır. Aksi takdirde
//                    compile hata verir.
            System.out.println("Exception yakalandı");
        } finally {
            System.out.println("finally bloğu çalıştı");
        }
    }
}
