package Threading;

class Greet1 extends Thread {
    public void run() {
        int a = 50;
        for (int i = 0; i < a; i++) {
            System.out.println("Good Morning");
        }
    }
}

class Greet2 extends Thread {
    public void run() {
        int a = 50;
        for (int i = 0; i < a; i++) {
            System.out.println("Welcome");
        }
    }

    public void sleep() {        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



public class SimpleGreets {
    public static void main(String[] args) {
        Greet1 g1 = new Greet1();
        g1.start();
        Greet2 g2 = new Greet2();
        g2.start();
        g2.sleep();
    }
}
