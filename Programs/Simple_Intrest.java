package Programs;

import java.util.*;

public class Simple_Intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rate: ");
        float a = sc.nextInt();
        System.out.print("Enter the Principle amount: ");
        float p = sc.nextInt();
        System.out.print("Enter the time Period: ");
        float T = sc.nextInt();
        float IntRate = (p / 100) * a;
        if (a >= 0 && a <= 100) {
            System.out.println("Your Priciple Amount and Rate of Intrest is: " + (p + (IntRate * T)));
        } else {
            System.out.println("Enter Valid Rate between 1 to 100");
        }
    }
}
