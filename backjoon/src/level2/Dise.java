package level2;

import java.util.Scanner;

public class Dise {
	// 2480
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a, b, c, money = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a != b && b !=c && a != c) {
			if (a > b && b > c || a > c && c > b) {
				money = a * 100;
			}else if (b > a && a > c || b > c && c > a) {
				money = b * 100;
			}else {
				money = c * 100;
			}
		}else if (a==b || b==c || a == c){
			if (a==b) {
				money = 1000 + (a * 100);
			}else if (b == c) {
				money = 1000 + (b * 100);
			}else {
				money = 1000 + (c * 100);
			}
			if(a == b && b == c && a == c) {
				money = 10000 + (a * 1000);
			}
		}
		
		System.out.println(money);

	}

}
