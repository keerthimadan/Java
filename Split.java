package sample;
import java.util.Scanner;
public class Split {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	System.out.println("enter the string");
	String input=sc.nextLine();
	String output="";
	String words[]=input.split(" ");
	for(int i=0;i<words.length;i++) {
		for(int j=words[i].length()-1;j>=0;j--) {
			output+=words[i].charAt(j);
		}
		System.out.print(output +" ");
	}
}
}

