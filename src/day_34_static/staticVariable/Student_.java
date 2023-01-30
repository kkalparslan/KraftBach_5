package day_34_static.staticVariable;

public class Student_ {
    int number;
    String name;
    static String shcoolName ="KARAFT";
    //static int counter;


    public Student_(int number, String name) {
        this.number = number;
        this.name = name;
    }


    public String getInfo() {
        return "Student_{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", scoolName='" + shcoolName + '\'' +
                '}';
    }
}
