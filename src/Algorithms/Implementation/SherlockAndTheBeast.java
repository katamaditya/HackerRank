package Algorithms.Implementation;

import java.util.Scanner;

public class SherlockAndTheBeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		for (int i = 0; i < numTestCases; i++) {
			int numOfDigits = 6;// sc.nextInt();
			int temp = 0, num3 = 0, num5 = 0;
			if (numOfDigits < 3 || numOfDigits == 4 || numOfDigits == 7) {
				System.out.println(-1);
				continue;
			}
			while (temp < numOfDigits) {
				temp = temp + 3;
				num3++;
				if (temp > numOfDigits) {
					if (numOfDigits % 3 == 1) {
						temp = temp - 12;
						num3 -= 4;
						temp = temp + 5;
						num5++;
					}else {
						temp = temp - 6;
						num3 -= 2;
						temp = temp + 5;
						num5++;
					}
				}
			}
			System.out.println(temp);
			if (temp == numOfDigits) {
				StringBuilder stringBuilder = new StringBuilder();
				for (int j = 0; j < num3; j++) {
					stringBuilder.append("555");
				}
				for (int j = 0; j < num5; j++) {
					stringBuilder.append("33333");
				}
				System.out.println(stringBuilder);
			} else {
				System.out.println(-1);
			}
		}
	}

}
