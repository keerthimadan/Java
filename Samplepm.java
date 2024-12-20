package polymorphisms;
 class  Samplepm{
		int add(int a,int b) {
			return a+b;
		}
		int add(int a,int b,int c) {
			return a+b+c;
		}
		float add(int a,float b) {
			return a+b;
		}
		float add(float a,int b) {
			return a+b;
		}
		double add(int a,float b,double c) {
			return a+b+c;
		}
		double add(float a,int b,double c) {
			return a+b+c;
		}
		double add(float a,double b,int c) {
			return a+b+c;
		}
	}
	class overloading{
		@SuppressWarnings("unused")
		public static void main(String args[]) {
			int a=10,b=20,c=30;
			float a1=10.11f,b1=20.22f,c1=300.33f;
			double a2=10.11d,b2=20.22d,c2=300.33d;

			Sample s=new Sample();
			System.out.println(s.add(a,b));
			System.out.println(s.add(a1,b));
			System.out.println(s.add(a,b1,c2));
		}
	}