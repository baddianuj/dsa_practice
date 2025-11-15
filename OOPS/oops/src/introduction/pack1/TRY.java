package introduction.pack1;

public class TRY {
    public static class Student{
        int rno;
        String name;
        int marks;

        Student(){
            this (1, "default", 100);
        }

        Student(int rno, String name, int marks){
            this.rno= rno;
            this.name = name;
            this.marks=marks;
        }
        void greet(){
            System.out.println("hi " + this.name);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        Student r = new Student(12, "Baddi", 100);
        s.greet();
        r.greet();
    }
}
