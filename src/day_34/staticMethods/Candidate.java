package day_34.staticMethods;

public class Candidate {
    String name;
    int schoolID;
    static String branch;
    static int counter;

    public Candidate(String name) {
        this.name = name;
        schoolID = setNumber();
    }
    public static int setNumber(){
        counter++;
        return counter;
        }
    public static void setBranch(String str){
        branch=str;
    }
    public void getInfo(){
        System.out.print(" "+name);
        System.out.print(" "+schoolID);
        System.out.println(" "+branch);
    }
}
class main3{
    public static void main(String[] args) {
        Candidate cd1=new Candidate("alp");
        Candidate cd2=new Candidate("beytullah");
        Candidate cd3=new Candidate("yaşar");
        Candidate.setBranch("JAVA");
        cd1.getInfo();
        cd2.getInfo();
        cd3.getInfo();

    }
}
