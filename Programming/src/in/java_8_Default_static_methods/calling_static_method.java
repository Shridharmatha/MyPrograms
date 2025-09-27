package in.java_8_Default_static_methods;

public interface calling_static_method {
	
	static int log(int x)
	{
		return x *x;
	}

}


class tests
{
	public static void main(String[] args) {
		System.out.println(calling_static_method.log(40));
	}
}