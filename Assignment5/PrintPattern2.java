package Assignment5;

import java.util.Scanner;

class PrintPattern2 {

	public static void printpattern(int num) {
		for (int i = 1; i <= num; i++) {
			int k = 1;
			for (int j = 1; j <= num; j++) {
				if ((i + j) < (num + 1)) {
					System.out.print(" ");
				} else {
					System.out.print(k);
					if (k == i) {
						for (int p = k; p > 1; p = p) {
							p--;
							System.out.print(p);
						}
					} else {
						k++;
					}
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number :");
		int num = sc.nextInt();

		printpattern(num);

		sc.close();
	}

}
