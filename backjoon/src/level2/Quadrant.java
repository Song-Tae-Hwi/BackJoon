package level2;

import java.util.Scanner;

public class Quadrant {
	// 14681
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println((a>0 && b>0) ? 1 : (a>0 && b<0) ? 4 : (a<0 && b >0)? 2 : 3 );
	}

}
