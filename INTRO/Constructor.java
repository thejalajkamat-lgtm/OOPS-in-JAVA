class Student{
    String name;
    int rno;
    double marks;

    Student(){
        name = "DOGLA";
        rno = 0;
        marks = 0;
    }

    //Constructor overloading 
    Student(String name, int rno, double marks){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rno);
        System.out.println("Marks: "+marks);
        System.out.println("---------------");
    }
}
public class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Dalal", 45, 78);
        s1.display();
        s2.display();
        
    }
}