
public class Main{
     public static void main(String[] args){
          //data of 5 students: {roll no, name, marks}
          int[] rno = new int [5];
          String[] name = new String[5];
          float[] marks = new float[5];

          Student[] students = new Student[5];

          Student jalaj = new Student();
          Student niraj = new Student();
          
          jalaj.changeName("Hoes ka Masiha");
          jalaj.greeting();
          // jalaj.rno = 23;
          // jalaj.name  = "Dogla Dalal";
          // jalaj.marks = 69;
          System.out.println("Your roll no is : "+niraj.rno);
          System.out.println("Your name is : "+jalaj.name);
          System.out.println("Your marks are : "+jalaj.marks);

     }
}

//create a class
class Student{
     int rno;
     String name ;
     float marks;
     void greeting(){
          System.out.println("My name is "+name);
     }
     void changeName(String newName){
          name = newName;
     }
     Student(){
          this.rno = 23;
          this.name  = "Dogla Dalal";
          this.marks = 69;
     };
}

