import java.util.Scanner;
public class Thirteen {

	public static void main(String[] args) {
		System.out.println("13�� ����");
		//13. month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (switch�� ���) 
		//1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		int m, d;
		Scanner input=new Scanner(System.in);
		System.out.print("��, ���� ������� �Է��Ͻÿ� : ");
		m=input.nextInt();//Ű���忡�� ���� �Է�
		d=input.nextInt();//Ű���忡�� ���� �Է�
		int sum=0;
		switch (m) {
		case 1 : sum= sum + d; break;
		case 2 : sum= sum + 31 +d; break;
		case 3 : sum= sum + 31 + 28 + d; break;
		case 4 : sum= sum + 31 + 28 + 31 + d; break;
		case 5 : sum= sum + 31 + 28 + 31 + 30 + d; break;
		case 6 : sum= sum + 31 + 28 + 31 + 30 + 31 + d; break;
		case 7 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + d; break;
		case 8 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + 31 + d; break;
		case 9 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d; break;
		case 10 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d; break;
		case 11 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d; break;
		case 12 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d; break;
		}
		System.out.print(sum);
	}

}
