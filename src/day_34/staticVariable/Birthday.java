package day_34.staticVariable;

public class Birthday {
     static int cakeSlice=28;

    public void takeASlice(){
        cakeSlice--;
    }
    public void takeASlice(int count){
        cakeSlice-=count;
    }
}
class main2{
    public static void main(String[] args) {
        Birthday zafer =new Birthday();
        Birthday enes =new Birthday();
        Birthday ilyas =new Birthday();
        Birthday alp =new Birthday();
        Birthday ahmet =new Birthday();
        Birthday talha =new Birthday();
        zafer.takeASlice();
        enes.takeASlice();
        ilyas.takeASlice();
        alp.takeASlice();
        ahmet.takeASlice();
        talha.takeASlice();
        zafer.takeASlice(2);
        alp.takeASlice(3);
        //System.out.println(alp.cakeSlice);

        System.out.println(Birthday.cakeSlice);

    }
}
