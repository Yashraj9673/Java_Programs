import java.util.*;

public class Greet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + " have a good day!");
    }
}