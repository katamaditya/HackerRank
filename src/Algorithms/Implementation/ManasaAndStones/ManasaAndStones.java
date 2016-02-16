package Algorithms.Implementation.ManasaAndStones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManasaAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		int numOfStones, a, b;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < numTestCases; i++) {
			numOfStones = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			int temp;
			for (int j = 0; j < numOfStones; j++) {
				temp = 0;
				temp += (numOfStones-j-1) * a;
				temp += (j) * b;
				if(!arrayList.contains(temp))	arrayList.add(temp);
			}
			Collections.sort(arrayList);
			for (int j = 0; j < arrayList.size(); j++) {
				System.out.print(arrayList.get(j)+" ");
			}
			System.out.println();
			arrayList.clear();
		}
	}

}
