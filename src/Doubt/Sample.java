package Doubt;

public class Sample {
	
	public static void main(String[] args) {
	
		String s1="hello";
		String s2="hello";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println();
		String s3=s1.concat(s2);
		System.out.println(s3);
		System.out.println(System.identityHashCode(s3));
		System.out.println();
		
		StringBuffer s4 = new StringBuffer("hello");
		StringBuffer s5 = new StringBuffer("hello");
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println();
		StringBuffer s6 = s4.append(s5);
		System.out.println(s6);
		System.out.println(System.identityHashCode(s6));
		
		System.out.println("Hi");
		
	}
}