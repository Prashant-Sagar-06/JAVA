package OOPs;

abstract class Pen {
    abstract void Write();{
        System.out.println("Pen write");
    }
    abstract void refill();{
        System.out.println("Pen refill");
    }
}
class FountainPen{
    public void Write(){
        System.out.println("Pen write");
    }
    public void refill(){
        System.out.println("Pen refill");
    }
    public void changenib(){
        System.out.println("Changing the nib");
    }
}

public class Pen_Abst_Class {

    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.Write();
        fp.refill();
        fp.changenib();
    }
}