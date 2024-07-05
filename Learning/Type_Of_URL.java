import java.util.Scanner;
public class Type_Of_URL {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter URL : ");
        String Entry = sc.nextLine();
        if (Entry.endsWith(".com")) {
            System.out.println("Commercial Website");
        }
        else if (Entry.endsWith(".org")) {
            System.out.println("Organization Website");
        }
        else if (Entry.endsWith(".in")) {
            System.out.println("Indian Website");
        }
        sc.close();
    }
}
