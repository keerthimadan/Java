public class CargoPlane1 {

	void fly() {
		// TODO Auto-generated method stub
		System.out.println("CargoPlane tookoff");
	}
}
public class Lanch1 {
	public static void main(String args[]) {
		CargoPlane p=new CargoPlane();
		p.takeoff();
		p.fly();
		p.land();
		Plane1 ref=new Plane1() {
			@Override
			void fly() {
				System.out.println("Plane flew");
			}
		};
		ref.fly();
	
	}
abstract class Plane1 {
	void takeoff() {
		System.out.println("Plane1 tookoff");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane1 landed");
	}

}


