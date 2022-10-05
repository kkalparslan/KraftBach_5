package day_35;

public class GameActivity {
    private double score;

    public double getScore() {
        return score;
    }
    public void setScore(double score){
        this.score=score;
    }
    public String getRank(){
        String rank;
        if(score>=800){
            rank="veteran";
        } else if (score>=500) {
            rank="advanced";
        }else if(score>=300){
            rank="undead";
        }else{
            rank="beginner";
        }return rank;
    }
}

