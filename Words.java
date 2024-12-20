package sample;
import java.util.Scanner;
public class Words {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter the string");
		String input=sc.nextLine();
		for(int i=0;i<input.length();i++) 
		{
			if(input.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count+1);
		
		}
}
