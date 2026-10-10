package LEC2;

public class InnerClasses{
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Jalaj");
        Test b = new Test("Niraj");
        System.err.println(a.name);
    }
}