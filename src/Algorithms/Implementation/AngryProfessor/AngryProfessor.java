package Algorithms.Implementation.AngryProfessor;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		for(int i=0; i<numTestCases; i++){
			int studentsInClass = sc.nextInt();
			int cancellationThreshold = sc.nextInt();
			int onTimeStudents = 0;
			for(int j=0; j < studentsInClass; j++){
				int n = sc.nextInt();
				if(n<=0) onTimeStudents++;
			}	
			if(onTimeStudents < cancellationThreshold) System.out.println("YES");
			else System.out.println("NO");	
		}
	}

}
