import java.util.Scanner;
public class One {

	public static void main(String[] args) {
		//1. 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수(a)를 입력하세요 : ");
		a = input.nextInt(); // 키보드에서 숫자입력
		System.out.print("두번째 정수(b)를 입력하세요 : ");
		b = input.nextInt(); // 키보드에서 숫자입력
		
		if (a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}

}
