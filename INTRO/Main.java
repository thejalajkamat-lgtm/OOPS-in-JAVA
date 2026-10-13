public class Main{
      //create a class
     static class Student{
          int rno;
          String name;
          float marks;
          //we need a way to add the values of the above 
          //properties object by object
          //we need one word to access every object
          void greeting(){
               System.out.println("Hello Single Moms!!. I am "+this.name);
          }
          void changeName(String newName){
               name = newName;
          }
          Student(Student other){
               this.name = other.name;
               this.rno = other.rno;
               this.marks = other.marks;
          }
          // Student(){
          // this.rno = 69;
          // this.name = "Dogla Dalal";
          // this.marks = 99;
          // }
          Student(){
               //this is how we call a constructor from another constructor
               //internally: new Student(14, "Default person", 43);
               this(14, "Default person", 43);
          }
          Student(int rno, String name, float marks){
               this.rno = rno;
               this.name = name;
               this.marks = marks;        
          }  
     }
     public static void main(String[] args){
          //store 5 roll nos
          int[] numbers = new int[5];

          //store 5 names
          String[] names = new String[5];

          //data of 5 students: {roll no, name, marks}
          int[] rno = new int [5];
          String[] name = new String[5];
          float[] marks = new float[5];

          Student[] students = new Student[5];
          //just declaring
          // Student jalaj;
          Student jalaj = new Student(13, "Jalaj Kamat", 100);
          Student niraj = new Student();
          Student random = new Student();
          Student one = new Student();
          Student two = one;
          one.name = "Prajwal Ghugare";
          System.out.println(two.name);
          // jalaj.rno = 69;
          // jalaj.name = "Dalal";
          // jalaj.marks = 99;
          // jalaj.changeName("DOGLA DALAL");
          // jalaj.greeting();
          System.out.println("My name is: "+jalaj.name);
          System.out.println("I love "+jalaj.rno);
          System.out.println(jalaj.marks);
          System.out.println("My name is: "+niraj.name);
          System.out.println("I love "+niraj.rno);
          System.out.println(niraj.marks);
          System.out.println(random.name);

     }
}