package LEC3;
public class Box{
    double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    //cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public class Boxweight extends Box{
        double weight;
        public Boxweight(){
            this.weight = -1;       
        }
        public Boxweight(double l, double h, double w, double weight){
            super(l, h, w); //call the parent class constructor
            this.weight = weight;       
        }
    }

    public static void main(String[] args) {
        Box box1 = new Box(4, 5 , 6);
        Box box2 = new Box(box1);
        Boxweight box3 = new Boxweight(2,3,4);

        System.out.println(box1.l +" "+box1.h+" "+box1.w);
        System.out.println(box2.l +" "+box2.h+" "+box2.w);
        System.out.println(box3.l +" "+box3.h+" "+box3.w+" "+box3.weight);

    }
}