package in.java_8_Functional_Intercae;

public interface Functional_interface_custom {
	
	String myname(String name);

}

class stud
{
	public static void main(String[] args) {
		
		Functional_interface_custom intt=s ->"my name is "+s;
		System.out.println(intt.myname("Shridhar"));
		
	}
}
