package Algorithms.Implementation;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String string = sc.next();
		int key = sc.nextInt();
		if(key > 26) key = key % 26;;
		char ch[] = new char[length];
		char temp;
		for(int i =0; i<length; i++){
			ch[i] = string.charAt(i);
			if(Character.isLetter(ch[i])){
				temp = ch[i];
				ch[i] = (char) (ch[i] + key);
				if((!Character.isLetter(ch[i])) || (Character.isLowerCase(temp) != Character.isLowerCase(ch[i]))){
					ch[i] = temp;
					ch[i] = (char) (ch[i] - 26 + key);
				}
			}
		}
		System.out.println(new String(ch));
	}
}
