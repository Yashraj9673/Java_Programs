package Programs;

import java.util.*;

public class KM_MILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Kilometer: ");
        double km = sc.nextDouble();
        double mile = (km * 0.62137);
        System.out.println("Miles: " + mile);
    }
}
