package polymorphisms;
class Bank{
	int getS() {
		return 0;
	}
}
class AxisBank extends Bank{
	int getS() {
		return 8;
	}
}
class SBIBank extends Bank{
	int getS() {
		return 9;
	}
}
class HDFCBank extends Bank{
	@Override
	int getS() {
		return 6;
	}
}
class overriding{
	public static void main(String args[]) {
		SBIBank s=new SBIBank();
		AxisBank a=new AxisBank();
		HDFCBank h=new HDFCBank();
		System.out.println(s.getS());
		System.out.println(a.getS());
		System.out.println(h.getS());
	}
}
