package Programs;

import java.util.*;

public class CBSC_Percentage {
    public static void main(String[] args) {

        float total = 0;
        System.out.println("WELCOME TO THE CBSE PERCENTAGE GENERATOR");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Total Marks of the subjects (Out of 100): ");
        int total_marks = scan.nextInt();

        System.out.print(" Enter Marks of Subject 1: ");
        float s1 = scan.nextFloat();
        total = total + s1;

        System.out.print(" Enter Marks of Subject 2: ");
        float s2 = scan.nextFloat();
        total = total + s2;

        System.out.print(" Enter Marks of Subject 3: ");
        float s3 = scan.nextFloat();
        total = total + s3;

        System.out.print(" Enter Marks of Subject 4: ");
        float s4 = scan.nextFloat();
        total = total + s4;

        System.out.print(" Enter Marks of Subject 5: ");
        float s5 = scan.nextFloat();
        total = total + s5;

        float grandTotal = total * 100 / (total_marks * 50);
        System.out.println("Your Total Percentage = " + grandTotal + " Percent");
        System.out.println("***Made By Yashraj Chaudhari***");
    }
}
