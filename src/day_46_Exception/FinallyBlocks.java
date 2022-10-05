package day_46_Exception;

public class FinallyBlocks {
    public static void main(String[] args) {
        System.out.println("programa giriş yapıldı");
        try{
            System.out.println("try bloğunun içi");
            int x=5/0;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("catch blok içi");
        }finally {
            System.out.println("finally blok çalıştı");
        }
        System.out.println("program bitti");
    }
}
