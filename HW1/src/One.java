import java.util.Scanner;
public class One {

	public static void main(String[] args) {
		//1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ����(a)�� �Է��ϼ��� : ");
		a = input.nextInt(); // Ű���忡�� �����Է�
		System.out.print("�ι�° ����(b)�� �Է��ϼ��� : ");
		b = input.nextInt(); // Ű���忡�� �����Է�
		
		if (a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}

}
