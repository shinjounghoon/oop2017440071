import java.util.Scanner;
public class Two {

	public static void main(String[] args) {
		// 2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("정수(a)를 입력하세요 : ");
		a = input.nextInt(); // 키보드에서 숫자입력
		
		if (a%2==1) 
			System.out.println("홀수 입니다");
		else
			System.out.println("짝수 입니다");
	
		}
		
}
