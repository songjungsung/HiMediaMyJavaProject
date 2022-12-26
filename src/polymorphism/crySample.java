package polymorphism;

class Animal {
	void cry() {
		System.out.println("ㅠㅠ");
	}
	class Bird extends Animal {
		void cry() {
			System.out.println("책책");
		}
	}
	class Cat extends Animal {
		void cry() {
			System.out.println("야옹");
		}
	}
	class Dog extends Animal {
		void cry() {
			System.out.println("");
		}
	}
}

public class crySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
