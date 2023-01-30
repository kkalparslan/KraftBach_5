package day_34_static.staticMethods;

public class Team {
    String name;
    static int team;

    public Team(String name) {
        this.name = name;
    }
    public static void teamChangeTo(int i){
       team=i;

    }


    public void getInfo() {
        System.out.println( "Team{" +
                "team="+team+
                " name= " + name+'}');
    }
}
class main {
    public static void main(String[] args) {
        Team member1=new Team("bahar");
        Team member2=new Team("bilge");
        Team member3=new Team("hatice");
        Team member4=new Team("ciğdem");
        member1.getInfo();
        Team.teamChangeTo(1);
        member1.getInfo();
        member2.getInfo();
        member3.getInfo();
        member4.getInfo();

    }
}
