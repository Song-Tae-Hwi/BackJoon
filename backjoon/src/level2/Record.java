package level2;

import java.util.Scanner;

public class Record {
	// 9498
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ;
		a = sc.nextInt();
		System.out.println(a >=90 ? "A" : a >=80 ? "B" : a>=70 ? "C" : a>=60 ? "D" : "F");

	}

}
