package Algorithms.Implementation;

import java.util.Scanner;

public class SherlockandSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		double a,b, sqrtFloorA, sqrtFloorB, sqrtCeilA, sqrtCeilB, max, min, maxnum, minnum;
		int count =0;
		for (int i = 0; i < numTestCases; i++) {
			count = 0;
			a = sc.nextInt();
			b= sc.nextInt();
			maxnum = Math.max(a, b);
			minnum = Math.min(a, b);
			sqrtFloorA = Math.floor(Math.sqrt(a));
			sqrtFloorB = Math.floor(Math.sqrt(b));
			sqrtCeilA = Math.ceil(Math.sqrt(a));
			sqrtCeilB = Math.ceil(Math.sqrt(b));
			min = Math.min(sqrtFloorA, sqrtFloorB);
			max = Math.max(sqrtCeilA, sqrtCeilB);
			double tempmin = min, square;
			for(int j=0; j<(Math.abs(max-min)+1); j++){
				square = tempmin*tempmin; 
				if(square >= minnum && square <= maxnum){
					count++;
				}
				tempmin++;
			}
			System.out.println(count);
		}
	}
	
	//this solution didnt work
	public static void solution2(){
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		double a,b, sqrtCeil, sqrtFloor, maxnum, minnum; int count =0;
		for (int i = 0; i < numTestCases; i++) {
			count = 0;
			a = sc.nextInt();
			b= sc.nextInt();
			maxnum = Math.max(a, b);
			minnum = Math.min(a, b);
			sqrtFloor = Math.floor(Math.sqrt(minnum));
			sqrtCeil = Math.ceil(Math.sqrt(maxnum));
			count = (int) (Math.abs((int)sqrtFloor-(int)sqrtCeil)+1);
			System.out.println(count);
		}
	}

}
