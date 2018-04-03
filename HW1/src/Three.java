import java.util.Scanner;
public class Three {

	public static void main(String[] args) {
		// 3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오
		int a, b, c ;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수(a)를 입력하세요 : ");
		a = input.nextInt(); // 키보드에서 숫자입력
		System.out.print("두번째 정수(b)를 입력하세요 : ");
		b = input.nextInt(); // 키보드에서 숫자입력
		System.out.print("세번째 정수(c)를 입력하세요 : ");
		c = input.nextInt(); // 키보드에서 숫자입력
		
		if (a<b) {
			if(b<c)
				System.out.println(c);
			else
				System.out.println(b);
		}
		else {
			if(a<c)
				System.out.println(c);
			else
				System.out.println(a);
		}
		
	}

}
