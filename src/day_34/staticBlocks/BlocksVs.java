package day_34.staticBlocks;

public class BlocksVs {
    static int i=10;

    public BlocksVs() {
        i = i;
        System.out.println("constructor çalıştı");

    }
    static {
        System.out.println("statik blok çalıştı");
        i=i*10;
        System.out.println(i);
    }
    {
        System.out.println("instance blok çalıştı");
    }
}
