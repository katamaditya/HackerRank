package Algorithms.Implementation.LibraryFine;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int actualDate = sc.nextInt();
		int actualMonth = sc.nextInt();
		int actualYear = sc.nextInt();
		int expectedDate = sc.nextInt();
		int expectedMonth = sc.nextInt();
		int expectedYear = sc.nextInt();
		if (actualYear == expectedYear) {
			if (actualMonth == expectedMonth) {
				if (actualDate <= expectedDate) {
					System.out.println(0);
				} else {
					System.out.println((actualDate - expectedDate) * 15);
				}
			} else if (actualMonth < expectedMonth) {
				System.out.println(0);
			} else {
				System.out.println((actualMonth - expectedMonth) * 500);
			}
		} else if (actualYear < expectedYear) {
			System.out.println(0);
		} else {
			System.out.println(10000);
		}
	}

}
