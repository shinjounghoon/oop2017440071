import java.util.Scanner;
public class Three {

	public static void main(String[] args) {
		// 3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		int a, b, c ;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ����(a)�� �Է��ϼ��� : ");
		a = input.nextInt(); // Ű���忡�� �����Է�
		System.out.print("�ι�° ����(b)�� �Է��ϼ��� : ");
		b = input.nextInt(); // Ű���忡�� �����Է�
		System.out.print("����° ����(c)�� �Է��ϼ��� : ");
		c = input.nextInt(); // Ű���忡�� �����Է�
		
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
