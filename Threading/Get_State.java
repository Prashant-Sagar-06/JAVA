package Threading;

class MyThread extends Thread {
    public void run() {
        // Thread logic here
        System.out.println("Thread is running");
    }
}

public class Get_State {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread.State state = myThread.getState();
        System.out.println("Thread state: " + state);
    }
}
