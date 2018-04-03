public class Loop1 {

	public static void main(String[] args) {
		//1에서 부터 10까지 정수를 화면에 출력
		int i=1; //i는 루프변수, 1. 루프변수 초기화
		while(i<11) { // 2. 루프 조건식
			System.out.println(i);// 3. 루프문
			i++; // 4. 루프변수 변화
		}
		//위의 조건문을  for문으로 
		for(i=1; i<11; i++)
			System.out.println(i);
		i=1;
		int sum=0;
		while(i<11) {
			sum=i+sum;
			i++;
		}
		System.out.println("1부터 10까지 합은 " + sum);
		
		String str = "hello darknees my old friend";
		int count = 0;
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(i) !='l')
				continue;
			count++;
		}
		System.out.println("문장에서 발견한 l의 갯수는" + count);
		
		System.out.println("==========프로그램 종료===========");
	}
	
} 
