package Syncronization;

public class Warrior extends Thread{
	String res1="Ak47";
	String res2="M416";
	String res3="AWM";
	public void run() {
		if(Thread.currentThread().getName().equals("Student1"))
		{
		Student1Acq();
		
		}
		else
		{
			Student2Acq();
		}
	}
	public void Student1Acq() {
		// TODO Auto-generated method stub
		try {
			synchronized(res1) {
				System.out.println("Student1 Acqired the resource1:"+res1);
				Thread.sleep(1000);
				synchronized(res2) {
					System.out.println("Student1 Acqired the resource2:"+res2);
					Thread.sleep(1000);
					synchronized(res3) {
						System.out.println("Student1 Acqired the resource3:"+res3);
						Thread.sleep(1000);
			}
		}
	}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void Student2Acq() {
		// TODO Auto-generated method stub
		try {
			synchronized(res1) {
				System.out.println("Student2 Acqired the resource1:"+res1);
				Thread.sleep(1000);
				synchronized(res2) {
					System.out.println("Student2 Acqired the resource2:"+res2);
					Thread.sleep(1000);
					synchronized(res3) {
						System.out.println("Student2 Acqired the resource3:"+res3);
						Thread.sleep(1000);
			}
		}
	}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
    
package Syncronization;

public class Launch {
	public static void main(String args[])throws InterruptedException {
		Warrior w1=new Warrior();
		Warrior w2=new Warrior();
		w1.setName("Student1");
		w2.setName("Student2");
		w1.start();
		w2.start();
		
		
	}

}
