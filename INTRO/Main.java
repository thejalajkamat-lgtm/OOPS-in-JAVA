import java.util.Scanner;

class Student{
     String name;
     int rno;
     double marks;

     //Parameterized constructor
     Student(String name, int rno,double marks ){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
     }
     void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll no:  "+rno);
        System.out.println("Marks: "+marks);
        System.out.println("--------------- ");
     }
}
public class Main{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       //Input of Student 1
       System.out.println("Enter name of student1: ");
       String name1 = sc.nextLine();
       System.out.println("Enter roll no of student1: ");
       int rno1 = sc.nextInt();
       System.out.println("Enter marks of student1: ");
       double marks1 = sc.nextDouble();
       sc.nextLine();

       //Input of Student 2
       System.out.println("Enter name of student2: ");
       String name2 = sc.nextLine();
       System.out.println("Enter roll no of student2: ");
       int rno2 = sc.nextInt();
       System.out.println("Enter marks of student2: ");
       double marks2 = sc.nextDouble();
       sc.nextLine();

       //Input of Student 3
       System.out.println("Enter name of student3: ");
       String name3 = sc.nextLine();
       System.out.println("Enter roll no of student3: ");
       int rno3 = sc.nextInt();
       System.out.println("Enter marks of student3: ");
       double marks3 = sc.nextDouble();

       Student s1 = new Student(name1, rno1, marks1);
       Student s2 = new Student(name2, rno2, marks2);
       Student s3 = new Student(name3, rno3, marks3);

       //Displaying Information
       System.out.println("\n Student Details: ");
       s1.display();
       s2.display();
       s3.display();
       sc.close();
   }
}