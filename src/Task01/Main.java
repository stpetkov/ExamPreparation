package Task01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5 };
		int b[] = { 3, 2, 12, 8 };
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int j = 0; j < a.length; j++) {
			System.out.println();
			for (int i = 0; i <= n; i++) {
				if (i % a[j] == 0 && i % b[j] != 0) {
					System.out.print(i + " ");
				}

			}
		}
		sc.close();
	}

}
