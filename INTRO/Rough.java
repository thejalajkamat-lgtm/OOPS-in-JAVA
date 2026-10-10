class Student{
    int rno ;
    String name ;
    float marks = 90;

    void greet(){
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }
    
    Student(){
        this.rno = 45;
        this.name = "Dogla Dalal";
        this.marks = 69;
    }
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
public class Rough {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student jalaj = new Student(13, "Dalali", 6969);
        // jalaj.changeName("Niraj");
        Student niraj = new Student();
        
        jalaj.greet();

        // jalaj.rno = 45;
        // jalaj.name = "Dogla Dalal";
        // jalaj.marks = 69;
        System.out.println(niraj.rno);
        System.out.println(jalaj.name);
        System.out.println(jalaj.marks);

    }
}
