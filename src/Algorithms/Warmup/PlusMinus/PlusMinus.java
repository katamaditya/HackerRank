package Algorithms.Warmup.PlusMinus;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float num = sc.nextInt();
		float pos = 0, neg = 0, zeros = 0;
		for(int i=0; i<num; i++){
			int current = sc.nextInt();
			if(current > 0) pos++;
			else if (current < 0) neg++;
			else zeros++;
		}
		System.out.println(pos/num);
		System.out.println(neg/num);
		System.out.println(zeros/num);
	}

}
