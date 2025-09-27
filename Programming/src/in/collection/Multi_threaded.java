package in.collection;

import java.util.Vector;

public class Multi_threaded {
	
	public static void main(String[] args) throws InterruptedException {
		
		Vector<Integer>  lst1=new Vector<>();
		
		Runnable r=()->
		{
			for(int i=0;i<1000;i++)
			{
				lst1.add(i);
			}
		};
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(lst1.size());
	}

}
