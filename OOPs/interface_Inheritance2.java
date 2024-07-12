package OOPs;

interface TVremote{
    void on();
    void off();
}

interface SmartRemote extends TVremote{
    void on();
    void off();

}
class TV implements TVremote{
    public void on(){
        System.out.println("On");
    }
    public void off(){
        System.out.println("Off");
    }
}

public class interface_Inheritance2 {
    public static void main(String[] args) {
        TV  t = new TV();
        t.on();
        t.off();
    }
}
