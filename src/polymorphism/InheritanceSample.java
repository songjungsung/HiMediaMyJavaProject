package polymorphism;

class A {
	void print1() {
		System.out.println("A 클래스 print1");
	}
	void print2() {
		System.out.println("A 클래스 print2");
	}
}
class B extends A { 
	void print1() {
		System.out.println("B 클래스 print1");
	}
	void print2(int a) {
		System.out.println("B 클래스 print2");
	}
}

public class InheritanceSample {
	public static void main(String[] args) {
		A a = new A();
		a.print1();
		a.print2();
		
		B b = new B();
		b.print1();			// 오버라이딩된 메서드
		b.print2();			// 부모 클래스의 메서드 <= 상속받은 메서드
		b.print2(100);		// 자기의 메서드 <= 오버로딩된 메서드
		
		A c = new B();
		c.print1();			// 오버라이딩된 메서드
		c.print2();			// 오버라이딩되지 않았기 때문에 부모 클래스의 메서드가 호출 
	}
}
