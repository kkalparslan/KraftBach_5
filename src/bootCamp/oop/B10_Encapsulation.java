package bootCamp.oop;

public class B10_Encapsulation {
    // encapsulation: data hidding/ private access modifier
    // use getter and setter methods
    // getter: read only ---> return private data--> no parameter
    // setter: write only---> does not return---> has parameter
    // pojo: test otomasyondan sonra encapsulation ı pojo da
    // kullandığımızı söyleyebilecğiz

    private String rank="quarter";
    private int score=10;

    public String getRank(){
        return rank;
    }
    public void setRank(String newRank){
        rank=newRank;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        score=newScore;
    }
}
class Main{
    public static void main(String[] args) {
        B10_Encapsulation soldier=new B10_Encapsulation();
        boolean hit=false;
        int score = soldier.getScore();
        if(hit){
            soldier.setScore(score+10);
            soldier.setRank("upperQuarter");
        }
        System.out.println("soldier.getScore() = " + soldier.getScore());
        System.out.println("soldier.getRank() = " + soldier.getRank());
    }
}
