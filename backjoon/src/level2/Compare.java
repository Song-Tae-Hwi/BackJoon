package level2;

import java.util.Scanner;

public class Compare {
	// 1330
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a>b ? ">" : a<b ? "<" : "==");

	}

}
