package thread_prog;

public class threadclass extends Thread 
{

	String name;
	int time;
	public threadclass(String name, int time) {
		// TODO Auto-generated constructor stub
		start();
		this.name=name;
		this.time=time;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	
	
	for(int i=0;i<10;i++)
	{
		System.out.println(name+"..........."+(i+1));
		try {
			sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}