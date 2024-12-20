package sample;
import java.util.Scanner;
public class Reverse {
		@SuppressWarnings({ "unused", "resource" })
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int count=0;
			System.out.println("enter the string");
			String input=sc.nextLine();
			for(int i=input.length()-1;i>=0;i--) {
				System.out.print(input.charAt(i));
			}
		}
	}

