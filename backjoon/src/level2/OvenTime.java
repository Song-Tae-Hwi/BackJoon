package level2;

import java.util.Scanner;

public class OvenTime {
	// 2525
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if ((b + c) >= 60) {
			a = a + ((b + c)/60);
			b = ((b + c)%60);
			if (a >=24) {
				a = Math.abs(24-a);
			}
		}else {
			b = b + c;
		}
		
		System.out.println(a + " " + b);

	}

}
