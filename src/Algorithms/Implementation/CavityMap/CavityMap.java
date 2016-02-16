package Algorithms.Implementation.CavityMap;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String map;
		int[][] actualMap = new int[n][n];
		for (int i = 0; i < n; i++) {
			map = sc.next();
			for (int j = 0; j < n; j++) {
				actualMap[i][j] = Integer.parseInt(Character.toString(map.charAt(j)));
			}
		}
		int temp;
		for (int i = 1; i < n-1; i++) {
			for (int j = 1; j < n-1; j++) {
				temp = actualMap[i][j];
				if(temp > actualMap[i-1][j] && temp > actualMap[i][j+1] && temp > actualMap[i+1][j] 
						&& temp > actualMap[i][j-1]){
					actualMap[i][j] = 'X';
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(actualMap[i][j] == 88){
					System.out.print("X");
					continue;
				}
				System.out.print(actualMap[i][j]);
			}
			System.out.println();
		}
	}

}
