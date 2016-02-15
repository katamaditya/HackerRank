package Algorithms.Implementation.ChocolateFeast;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		int myMoney, chocolateCost, minWrappers, numChocolates, numWrappers;
		for (int i = 0; i < numTestCases; i++) {
			myMoney = sc.nextInt();
			chocolateCost = sc.nextInt();
			minWrappers = sc.nextInt();
			numChocolates = myMoney / chocolateCost;
			numWrappers = numChocolates;
			while (numWrappers >= minWrappers) {
				numWrappers = numWrappers - minWrappers;
				numChocolates++;
				numWrappers++;
			}
			System.out.println(numChocolates);
		}
	}
}
