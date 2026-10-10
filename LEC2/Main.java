package LEC2;
public class Main{
    public static void main(String[] args){
        Human Jalaj = new Human(22, "Jalaj", 10000, false);
        Human Niraj = new Human(23, "Niraj", 11000, true);

        System.out.println(Jalaj.age);
        System.out.println(Niraj.salary);
        System.out.println(Human.population);
         //static method and only access static data 
       // non static data belongs to an instance 
        Main fun = new Main();
        fun.fun2();

    }
    static void fun(){
        Main obj = new Main();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }
    void greeting(){
        fun();
        System.out.println("Hello World");
    }
}