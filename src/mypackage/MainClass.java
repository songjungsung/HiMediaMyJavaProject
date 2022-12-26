package mypackage;

public class MainClass {
	
	public static void main(String[] args) {
		
	//MyClass의 인스턴스를 생성한 후 필드와 매서드에 접근
		MyClass mc = new MyClass();
		
		//mc.privateInt = 10;
		mc.packageInt = 10;
		mc.protectedInt = 10;
		mc.publicInt = 10;
		
		//mc.privateMethod();
		
}}
