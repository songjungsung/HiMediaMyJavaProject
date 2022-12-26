package test_graphic;

public class Graphic_A implements Graphic {
	private void brightness_A(int value) {
		System.out.println("밝기를" + value + "로 설정");
	}
	private void contrast_A(double value) {
		System.out.println("콘트라스를" + value + "로 설정");
	}
	
	private void display_A() {
		System.out.println("화면을 출력");
	}
	@Override
	public void brightness(int value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void contrast(double value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	
}
