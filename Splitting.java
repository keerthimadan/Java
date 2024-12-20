package sample;

public class Spliting {
	public static void main(String args[]) {
		String input="Hello good morning";
		String output="";
		String temp="";
		String arr[]=input.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			temp="";
			for(int j=arr[i].length()-1;j>=0;j--) {
				temp+=arr[i].charAt(j);
			}
			output=output+temp+" ";
		}
		System.out.println(output);
	}

}
