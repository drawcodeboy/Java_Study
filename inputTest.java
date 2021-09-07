
import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner sc = new Scanner(System.in);

        String yourName = sc.nextLine();
        sc.close();
        System.out.println("Hello " + yourName);

    }

}