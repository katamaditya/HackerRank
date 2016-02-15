package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			arrayList.add(sc.nextInt());
		}
		int min, value;
		while(arrayList.size() > 0){
			System.out.println(arrayList.size());
			min = Collections.min(arrayList);
			for (Integer integer : arrayList) {
				value = integer - min;
				if(value > 0) newList.add(integer-min);
			}
			arrayList.clear();
			arrayList = new ArrayList<Integer>(newList);
			newList.clear();
		}
	}

}
