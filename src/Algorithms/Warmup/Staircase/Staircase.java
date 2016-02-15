package Algorithms.Warmup.Staircase;
import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = num-1;
		for(int i=0; i<num; i++){
			for(int j=0; j<num; j++){
				if(k <= j){
					System.out.print("#");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
			k--;
		}
	}

}
