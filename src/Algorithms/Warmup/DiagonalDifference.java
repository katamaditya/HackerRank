package Algorithms.Warmup;
import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] a = new int[num][num];
		int l=0, r=num-1, pd = 0, sd = 0;
		for(int i=0; i< num; i++){
			for(int j=0; j< num; j++){
				a[i][j] = sc.nextInt();
				if(l==j) pd += a[i][j];
				if(r==j) sd += a[i][j];
			}
			l++;
			r--;
		}
		System.out.println(Math.abs(pd-sd));
	}

}
