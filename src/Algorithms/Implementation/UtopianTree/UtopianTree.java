package Algorithms.Implementation.UtopianTree;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		long height = 1; int n;
		for (int i = 0; i < numTestCases; i++) {
			height = 1;
			n = sc.nextInt();
			if(n == 0){
				System.out.println(1);
				continue;
			}
			for(int j=1; j<=n; j++){
				if(j%2 == 0){
					height++;
				}else {
					height = height*2;
				}
			}
			System.out.println(height);
		}
	}

}
