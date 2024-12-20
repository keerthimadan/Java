package EvenOdd;
public class EvenOrOdd extends Thread{
	static int count=1;
	Object obj;
	
	public EvenOrOdd(Object obj)
	{
		super();
		this.obj=obj;
	}
	
	@Override
	public void run()
	{
			while(count<=10)
			{
			if(count % 2==0 && Thread.currentThread().getName().equals("even"))
			{
				synchronized(obj)
				{
				System.out.println("Thread name: "+Thread.currentThread().getName()+" Value: "+count);
				try {
				Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				count++;
				try {
					obj.wait();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			}
			if(count % 2 !=0 && Thread.currentThread().getName().equals("odd") && count<=10)
			{
				synchronized(obj)
				{
				System.out.println("Thread name: "+Thread.currentThread().getName()+" Value: "+count);
				try
				{
				Thread.sleep(2000);

			   }
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				count++;
				try {
					obj.notify();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
		}
		}
	}}
package EvenOdd;
public class Even {
	public static void main(String args[]) {
		for(int i=0;i<20;i++) {
			if(i%2==0) {
				System.out.println("The number is Even:"+i);
				
			}
			else if(i%2!=0) {
				System.out.println("The number is Odd:"+i);
			}
			else {
				System.out.println("The numbers are Even or Odd");
			}
			
		}
	}

}
package EvenOdd;

public class Begin {
	public static  void main(String[] args)throws InterruptedException {
		Object lock=new Object();
		EvenOrOdd r1=new EvenOrOdd(lock);
		EvenOrOdd r2=new EvenOrOdd(lock);
		
		
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.setName("even");
		t2.setName("odd");
		
		
		t1.start();
		t2.start();
//		new Thread(r1,"even").start();
//		new Thread(r2,"odd").start();
	


		}