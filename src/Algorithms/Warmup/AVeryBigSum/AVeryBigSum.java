package Algorithms.Warmup.AVeryBigSum;
import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); long sum =0;
		for(int i=0; i< num; i++){
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}

}
