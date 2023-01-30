package day_34_static.staticVariable;

public class Student {
    static String name;

    public Student(String name){
       Student.name=name;
    }
    public void printName(){
        System.out.println("name = " + name);
    }

}

