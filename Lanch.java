package Abstract;
class CargoPlane extends Plane {

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("CargoPlane tookoff");
	}
}
abstract class Plane {
	void takeoff() {
		System.out.println("Plane tookoff");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane landed");
	}

}
public class Lanch {
	public static void main(String args[]) {
		CargoPlane p=new CargoPlane();
		p.takeoff();
		p.fly();
		p.land();
	}

}
