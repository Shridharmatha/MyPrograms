package in.code_practice;

public class replace_charecters {
	
	public static void main(String[] args) {
		String s="gfgfFGDAADDgVBnhhgRFhuuJNNKIvVBBNNNjKm";
		System.out.println(s);
		String res=s.replaceAll("[^b-zB-Z]", "");
		String res1=s.replaceAll("[b-zB-Z]", "");
		String res3=s.replaceAll("[f-zF-Z]", "");//it will replace only before letters till f or F
		String res4=s.replaceAll("[^f-zF-Z]", "");//it will replace only at the position of the f or F letters till Z or z
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res3);
		System.out.println(res4);
		String res2=res.replaceAll("j", "//");
		System.out.println(res2);
	}

}
