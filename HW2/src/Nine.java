import java.util.Scanner;
public class Nine {

	public static void main(String[] args) {
		System.out.println("9������");
		//8. 1���� 9������ ���� �ϳ��� �Է� �޾� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(5�̸� 5���� ���)
		//9. ���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������,
		//�� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� 
		//�ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)
		int i;
		Scanner input=new Scanner(System.in);
		System.out.print("����� ������ :");
		i=input.nextInt();//Ű���忡�� ���� �Է�
		
		int p=1;
		while(p<10) {
			if (i>9) {
				System.out.print("�ٽ� �Է��Ͻÿ� :");
			i=input.nextInt();
			}
			else {
				System.out.println(p*i);
				p++;
			}
				
		}

	}

}
