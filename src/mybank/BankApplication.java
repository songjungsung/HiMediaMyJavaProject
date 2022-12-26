package mybank;

import java.util.Scanner;

public class BankApplication {

	// 필드를 정의
	// => main 메서드에서 인스턴스 생성 없이 바로 사용할 수 있도록 static으로 정의
	private static Account[] accounts = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean isRun = true;
		while (isRun) {
			// 메뉴 출력
			System.out.println("-------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------");
			System.out.println("선택 >");
			// 선택한 메뉴 번호에 맞는 기능을 호출
			int menu = scan.nextInt();
			switch (menu) {
			case 1:

				break;
			case 2:
				showAccounts();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				isRun = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

	private static void createAccount() {
		
	}
