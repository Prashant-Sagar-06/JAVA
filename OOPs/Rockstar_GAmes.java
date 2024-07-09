package OOPs;
    import java.util.Scanner;
    class Tomvecitte{
        String Fire;
        String Run;
        String Hit;
        public String Hitting(String Hit){
            System.out.println("Player is hitting");
            return Hit;
        }
        public String Running(String run){
            System.out.println("Player is running");
            return run;
        }
        public String Firing(String Fire){
            System.out.println("Player is Firing");
            return Fire;
        }
    }
public class Rockstar_GAmes {
    public static void main(String[] args) {
        Tomvecitte guest = new Tomvecitte();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in the game (Write your name) : ");
        String move = sc.nextLine();
        guest.Firing(move);
        guest.Hitting(move);
        guest.Running(move);
        sc.close();
    }
}
