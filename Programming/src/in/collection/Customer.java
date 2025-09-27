package in.collection;

import java.util.TreeSet;

public class Customer implements Comparable<Customer>{
	
	int cide;
	String name;
	double fee;

	public Customer(int cide, String name, double fee) {
		super();
		this.cide = cide;
		this.name = name;
		this.fee = fee;
	}

	@Override
	public int compareTo(Customer o) {
//	   if(this.cide>o.cide)
//	   {
//		   return 1;
//	   }else if(this.cide<o.cide)
//	   {
//		   return -1;
//	   }
//		return 0;
		String s=this.name;
		return s.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Customer [cide=" + cide + ", name=" + name + ", fee=" + fee + "]";
	}

}
class Customertest
{
	public static void main(String[] args) {
		TreeSet<Customer> ts=new TreeSet<>();
		Customer c=new Customer(1,"Shridhar",150000.00);
		Customer c1=new Customer(2,"Ammu",14000.00);
		ts.add(c1);
		ts.add(c);
		System.out.println(ts);
//		System.out.println(c1);
	}
}
