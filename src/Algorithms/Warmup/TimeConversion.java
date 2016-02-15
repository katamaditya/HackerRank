package Algorithms.Warmup;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Integer hour = Integer.parseInt(Character.toString(s.toCharArray()[0]))*10 + 
				Integer.parseInt(Character.toString(s.toCharArray()[1]));
		Integer min = Integer.parseInt(Character.toString(s.toCharArray()[3]))*10 + 
				Integer.parseInt(Character.toString(s.toCharArray()[4]));
		Integer sec = Integer.parseInt(Character.toString(s.toCharArray()[6]))*10 + 
				Integer.parseInt(Character.toString(s.toCharArray()[7]));
		String ampm = new String(Character.toString(s.toCharArray()[8])+Character.toString(s.toCharArray()[9]));
		if(hour==12 && ampm.equals("AM")){
			hour = 0;
		}
		boolean flag = false;
		if(hour==12 && ampm.equals("PM")){
			hour = 12;
			flag = true;
		}

		if(ampm.equals("PM") && !flag){
			hour += 12;
		}
		System.out.println(new DecimalFormat("00").format(hour)+":"+new DecimalFormat("00").format(min)+":"+
				new DecimalFormat("00").format(sec));
	}
}
