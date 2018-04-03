
public class Teststring {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		int a =10; // int 형의 변수a 생성+ 값 10을 a에 저장 1. 원시변수
		// string 객체생성방법
		String str; // 클라스 스트링의 객체를 참조할수 있는 2. 참조 변수(레퍼런스 변수)<- String은 클라스 이름
		str = new String("Hello darkness my old friend."); // 객체 생성 
		
		//string 객체의 길이 
		//메소드 호출 방법: 참조변수.메소드()
		int len = str.length();
		System.out.println("string length is " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1: "+ str1);
		
	}

}  
