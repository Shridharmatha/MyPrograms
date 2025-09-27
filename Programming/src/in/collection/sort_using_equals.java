package in.collection;

import java.util.HashSet;
import java.util.Set;

public class sort_using_equals {
	
	int id;
	String name;
	double sal;
	public sort_using_equals(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public  boolean equals(Object obj)
	{
		sort_using_equals e=(sort_using_equals)obj;
		if(this==e)
		{
			return true;
		}else if(this.name.equals(e.name))
		{
			return true;
		}else
		{
		return false;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "sort_using_comparaTo [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	@Override
	public int hashCode()
	{
		int val=id+name.hashCode();
		return val;
	}

}


 class sorttest
{
	public static void main(String[] args) {
		
		Set<sort_using_equals>  s=new HashSet<>();
		
		sort_using_equals t=new sort_using_equals(1,"shri",10000.0);
		sort_using_equals t1=new sort_using_equals(2,"akash",1000.0);
		sort_using_equals t2=new sort_using_equals(3,"mallesh",100.0);
		sort_using_equals t3=new sort_using_equals(3,"mallesh",100.0);
		sort_using_equals t4=new sort_using_equals(4,"aa",10.0);
		s.add(t3);
		s.add(t);
		s.add(t1);
		s.add(t2);
		s.add(t4);
		
		System.out.println(s);
		
	}
}

