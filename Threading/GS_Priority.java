package Threading;

class GetSetPriority extends Thread {
    public void run() {
        int a = 50;
        for (int i = 0; i < a; i++) {
            System.out.println("Good Morning");
        }
    }
}

public class GS_Priority {
    public static void main(String[] args) {
        GetSetPriority thread = new GetSetPriority();
        int defaultPriority = thread.getPriority();
        System.out.println("Default Priority: " + defaultPriority);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }
}
