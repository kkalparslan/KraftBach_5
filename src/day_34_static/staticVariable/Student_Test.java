package day_34_static.staticVariable;

public class Student_Test {
    public static void main(String[] args) {


        Student_ student_1=new Student_(150,"talip");
        Student_ student_2=new Student_(150,"alp");
        Student_ student_3=new Student_(150,"bahar");
        Student_ student_4=new Student_(150,"hatice");

        Student_.shcoolName ="NEWKRAFT";
        Student_.shcoolName="NEWKRAFT";

        System.out.println(student_1.getInfo());
        System.out.println(student_2.getInfo());
        System.out.println(student_3.getInfo());
        System.out.println(student_4.getInfo());

    }
}
