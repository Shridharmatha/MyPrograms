package in.collection;

import java.util.ArrayList;

public class single_threaded {
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<Integer> lst=new ArrayList<>();
		
		Runnable r=()->
		{
			for(int i=0;i<1000;i++)
			{
				lst.add(i);
			}
		};
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(lst.size());
	}

}
