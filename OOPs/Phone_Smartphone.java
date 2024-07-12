package OOPs;

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Lift up");
    }
    public void disconnect(){
        System.out.println("Disconnected...");
    }
    public void Videocall(){
        System.out.println("Video call is going...");
    }
}

public class Phone_Smartphone {
    public static void main(String[] args) {
        SmartTelephone st = new SmartTelephone();
        st.ring();
        st.lift();
        st.disconnect();
        st.Videocall();
    }
}
