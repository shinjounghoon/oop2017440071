
public class Teststring {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		int a =10; // int ���� ����a ����+ �� 10�� a�� ���� 1. ���ú���
		// string ��ü�������
		String str; // Ŭ�� ��Ʈ���� ��ü�� �����Ҽ� �ִ� 2. ���� ����(���۷��� ����)<- String�� Ŭ�� �̸�
		str = new String("Hello darkness my old friend."); // ��ü ���� 
		
		//string ��ü�� ���� 
		//�޼ҵ� ȣ�� ���: ��������.�޼ҵ�()
		int len = str.length();
		System.out.println("string length is " + len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1: "+ str1);
		
	}

}  
