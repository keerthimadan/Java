package constructor;

public class Shadowing {
	
		private String name;
		private String color;
		private int cost;
		private int size;
		//Constructor
		Shadowing(String name,String color,int cost,int size){
			this.name=name;
			this.color=color;
			this.cost=cost;
			this.size=size;
		}
		//add getters 
		public String getName() {
			return name;
		}
		public String getColor() {
			return color;
		}
		public int getCost() {
			return cost;	
		}
		public int getSize() {
			return size;
		}
	}	

public class Test {
	public static void main(String args[]) {
	    Shadowing veg=new Shadowing("Brinjal","pe`rpul",10,5);
		System.out.println(veg.getName());
		System.out.println(veg.getColor());
		System.out.println(veg.getCost());
		System.out.println(veg.getSize());
	}
}
