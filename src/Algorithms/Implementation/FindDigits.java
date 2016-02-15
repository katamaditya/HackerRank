package Algorithms.Implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		int n, temp, mod, count = 0;
		for (int i = 0; i < numTestCases; i++) {
			n = sc.nextInt();
			temp = n;
			count = 0;
			while(temp>0){
				mod = temp%10;
				temp = temp/10;
				if (mod == 0) continue;
				if(n % mod == 0) count++;
			}
			System.out.println(count);
		}
	}

}
