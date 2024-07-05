import java.util.Scanner;
public class Template {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String str = sc.nextLine();
        String str2 = "Dear <|name|> Thnaks a lot";
        str2 = str2.replace("<|name|>", str);
        System.out.println(str2);
        sc.close();
    }
}
