package Doubt;


public class Doubt {
	int a=10;
	static int b=30;
	
	public void sri() {
		a=20;
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(Doubt.b);
	}
	public static void main(String[] args) {
		Doubt d = new Doubt();
		d.sri();
		System.out.println(b);
		
		
	}
}
