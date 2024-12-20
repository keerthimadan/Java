package constructor;
public class Human {
	private String name;
	private String location;
	private int age;
	private double height;
	private double weight;
	Human(String a,String b,int c,double d,double e){
		this("Ramu","Bangulore",21,176.9);
		name=a;
		location=b;
		age=c;
		height=d;
		weight=e;
	}
	Human(String a,String b,int c,double d){
		this("Shanu","hyderabad",20);
			name=a;
			location=b;
			age=c;
			height=d;
		}
	Human(String a,String b,int c){
		name=a;
		location=b;
		age=c;
	}
	//add only getters
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	}
public class LanchAgain {
	public static void main(String args[]) {
		Human h=new Human("Sunny","Chennai",19,156.7,65);
		System.out.println(h.getName());
		System.out.println(h.getLocation());
		System.out.println(h.getAge());
		System.out.println(h.getHeight());
		System.out.println(h.getWeight());

	}

}
