import java.util.Scanner;
public class Fifteen {

	public static void main(String[] args) {
		System.out.println("15�� ����");
		//15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��),10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.
		//(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)
		//��) ���� 49�� ���:
		//���ڸ� �Է��Ͻÿ�: 36
		//�Է��Ͻ� ���ں��� Ů�ϴ�.
		//���ڸ� �Է��Ͻÿ�: 51
		//�Է��Ͻ� ���ں��� �۽��ϴ�.
		//���ڸ� �Է��Ͻÿ�: 49
		//�����Դϴ�!
		int a = 30;
		int m;
		Scanner input=new Scanner(System.in);
		int count=0;
		
		while(count<10) {
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		m=input.nextInt();//Ű���忡�� ���� �Է�
		if(a<m) 
			System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�");
		else if (a>m)
			System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�");
		else 
			break;
		count++;
		}
		if (count == 10)
			System.out.println("Game over");
		else
			System.out.println("�����Դϴ�");

		

	}
}
