package day_35;

public class Challenge extends GameActivity{
    private final int shootOption;
    private final int pointOfShoot;
    private final int shootSucces;

    public Challenge(int shootOption, int shootSucces) {
        int point;
        this.shootOption = shootOption;
        this.shootSucces = shootSucces;
        pointOfShoot=1000/shootOption;
        point=pointOfShoot*shootSucces;

        // score=point score değişkeni parent classda privite
        // olarak tanımlandığı için doğrudan erişilemez.
        setScore(point); // setter metodu o yüzden kullanıldı

    }
}
