package mypackage;

public class MyClass {
	
	public static void main(String[] args) {
		
	
	private int privateInt;
	int packageInt;
	protected int protectedInt;
	public int publicInt;
	
	private void privateMethod() {
		System.out.println(privateInt);
		System.out.println(packageInt);
		System.out.println(protectedInt);
		System.out.println(publicInt);
	}
	
	void packageMethod() {
		
	}
	protected void protectedMethod() {	
	}
	public void publicMethod() {	
	}
}}
