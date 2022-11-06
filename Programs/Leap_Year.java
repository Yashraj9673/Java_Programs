package Programs;

import java.util.*;

public class Leap_Year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int a = sc.nextInt();
		if (a % 400 == 0) {
			System.out.println(a + " is a leap year");
		} else if (a % 100 == 0) {
			System.out.println(a + " is a not a leap year");
		} else if (a % 4 == 0) {
			System.out.println(a + " is a leap year");
		} else {
			System.out.println(a + " is not a leap year");
		}
	}
}
