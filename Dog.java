package encapsulation;

public class Dog {
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}
	public int getCost() {
		return cost;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public String getBreed() {
		return breed;
		
	}}
	
import java.util.*;
@SuppressWarnings("unused")
public class Start {
	public static void main(String args[]) {
		Dog d=new Dog();
		d.setName("Tommy");
		d.setColor("Black");
		d.setCost(10000);
		d.setAge(1);
		d.setBreed("Shitzu");
		System.out.println("Name:" +d.getName());
		System.out.println("Color:" +d.getColor());
		System.out.println("Cost:" +d.getCost());
		System.out.println("Age:" +d.getAge());
		System.out.println("Breed:" +d.getBreed());

	}

}
