import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		System.out.println("6������");
		//6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
		//����� �Է� : �� ���� �� �ڸ� ����
		 //��� : �ڸ����� ������ �ݴ�� �� ����
		int a;
		int b,c;
		Scanner input=new Scanner(System.in);
		System.out.print("���ڸ� ������ �Է��Ͻÿ�:");
		a=input.nextInt();
		b=a/10;
		c=a%10;
		a=b+c*10;
		System.out.print("�ڸ����� ������ �ݴ�� �� ����:"+a);
		
		
	}

}
