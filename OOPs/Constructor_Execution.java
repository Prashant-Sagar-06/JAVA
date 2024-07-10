package OOPs;
class base{
    base(){
        System.out.println("I am constructor of class base");
    }
}
class derived1 extends base{
    derived1(){
        System.out.println("I am constructor of class derived1");
    }
}
class derived2 extends derived1{
    derived2(){
        System.out.println("I am constructor of class derived2");
    
    }
}
public class Constructor_Execution {
    public static void main(String[] args) {
        derived2 obj = new derived2();
    }
}
