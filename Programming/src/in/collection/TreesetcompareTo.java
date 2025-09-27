package in.collection;

import java.util.Collections;
import java.util.TreeSet;

public class TreesetcompareTo implements Comparable<TreesetcompareTo> {
	
	int id;
	String name;
	double sal;
	public TreesetcompareTo(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public int compareTo(TreesetcompareTo o) {
//	String ids=this.name;
//	
//		return ids.compareTo(o.name);
		
		if(this.id>o.id)
		{
			return 1;
		}else if(this.id<o.id)
		{
			return -1;
		}
		return 0;
		
		
		
	}
	
	@Override
	public String toString() {
		return "TreesetcompareTo [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}

class Treetest
{
	public static void main(String[] args) {
		TreesetcompareTo t1=new TreesetcompareTo(1,"shri",500000000.0);
		TreesetcompareTo t2=new TreesetcompareTo(2,"aksh",50000000.0);
		TreesetcompareTo t3=new TreesetcompareTo(3,"don",50000000.0);
		
		
		//for reverse order we can use reverse order method
		
		TreeSet<TreesetcompareTo> t=new TreeSet<>(Collections.reverseOrder());
		t.add(t1);
		t.add(t2);
		t.add(t3);
		
		System.out.println(t);
		
	}
}
