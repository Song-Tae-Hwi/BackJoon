package level2;

import java.util.Scanner;

public class Alarm {
	// 2884
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = 60 - Math.abs(b-45);
		if(b - 45 < 0) {
			a -= 1;
			b = c;
			if (a < 0) {
				a = 24 + a;
			}
		}else {
			b = b - 45;
		}
		System.out.println(a + " " + b);

	}

}
