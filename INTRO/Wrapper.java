
public class Wrapper{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        Integer num = 45;
        swap(a,b);
        // System.out.println(a+ " "+b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    // Student kunal = new Student("Jalaj Kamat");
}
class A{
    final int num = 10;
    String name;
    public A(String name){
        this.name = name;
    }

}