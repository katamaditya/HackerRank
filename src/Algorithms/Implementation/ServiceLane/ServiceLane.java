package Algorithms.Implementation.ServiceLane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numTestCases = sc.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> subList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arrayList.add(sc.nextInt());
		}
		int entry, exit, max, min;
		for (int i = 0; i < numTestCases; i++) {
			entry = sc.nextInt();
			exit = sc.nextInt();
			subList = arrayList.subList(entry, exit+1);			
			System.out.println(Collections.min(subList));
		}
	}

}
