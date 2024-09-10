package level2;

import java.util.Scanner;

public class LeapYear {
	// 2753
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		a = sc.nextInt();
		System.out.println((a % 4 == 0 && a % 100 !=0 || a % 400 == 0) ? 1:0);

	}

}
