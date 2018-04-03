import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		int score;
		int good = 0;
		int bad = 0;
		System.out.print("성적을 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		score = input.nextInt(); // 키보드에서 숫자입력

		System.out.println("성적은 " + score + "점 입니다.");
		//성적이 60점 이상이면 합격입니다, 60점 미만이면 불합격 입니다 를 출력
		//비교 >=: 관계연산자
		//if (조건식){참일경우 수행} else {거짓일 경우 수행}
		if(score<60) {
			System.out.println("불합격입니다");
			bad++;
		}//복합문 여려문장을 중괄호로 묶어 하나의 문장으로 처리
		else {
			System.out.println("합격입니다");
			good++;
		}
		//성적이 80이상이면 A, 60점 이상이면 B, 60점 미만이면 F
		if(score>=80)
			System.out.println("A");
		else if (score>=60)
			System.out.println("B");
		else 
			System.out.println("F");
			 
		//0은 없음, 1은 하나, 2는 둘 나머지는 많음
	
		switch(score) {
		case 0:
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		default:
			System.out.println("많음");
			break;
		}
		System.out.println("==========프로그램 종료===========");	
	}

}
