package sample;
import java.util.Scanner;
public class Vowel {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter the string");
		String input=sc.nextLine();
		for(int i=0;i<input.length();i++) 
		{
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'||input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U') {
				count++;
			}
		}
		System.out.println(count);
	}

}
