
public class Car {
	private String name;
	private String color;
	private int cost;
	private int speed;
	private String country;
	//parameterized Constructor
	Car(String a,String b,int c,int d,String e){
		super();
		name=a;
		color=b;
		cost=c;
		speed=d;
		country=e;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	public int getSpeed() {
		return speed;
	}
	public String getCountry() {
		return country;
	}
}
public class Begin {
	public static void main(String args[]) {
		//involking the constructor
		Car c=new Car("Civic","Red",500000,120,"japan");
		System.out.println(c.getName());
		System.out.println(c.getColor());
		System.out.println(c.getCost());
		System.out.println(c.getSpeed());
		System.out.println(c.getCountry());
	}

}