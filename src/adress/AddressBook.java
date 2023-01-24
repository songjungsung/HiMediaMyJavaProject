package adress;

import java.util.Scanner;

public class AddressBook {

	static Person[] people = new Person[100];
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isRun = true;
		while (isRun) {
			// 메뉴를 출력
			System.out.println("--------------------------------------------------");
			System.out.println("1.등록 | 2.조회 | 3.수정 | 4.삭제 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			System.out.print("------------ ");

			// 선택한 메뉴 번호에 맞는 기능(메서드)을 호출
			int menu = input.nextInt();
			switch (menu) {
			case 1:
				enrollment();
				break;
			case 2:
				lookup();
				break;
			case 3:
				revision();
				break;
			case 4:
				delete();
				break;
			case 5:
				isRun = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

	static void enrollment() {
		//제목 출력
		System.out.println("--------");
		System.out.println("등록");
		System.out.println("--------");
		
		// 이름, 전화번호, 학번/사번 입력
		System.out.println("이름 : ");
		String name = input.next();
		System.out.println("전화번호 : ");
		String phone = input.next();
		System.out.println("학생 여부 : ");
		String serialNo = input.next();
		
		// Person 생성 후 메소드 호출
		
	}

}
