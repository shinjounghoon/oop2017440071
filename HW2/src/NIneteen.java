import java.util.Scanner;
public class NIneteen {

	public static void main(String[] args) {
		//19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int m;
		Scanner input=new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		m=input.nextInt();//Ű���忡�� ���� �Է�
		int i=2;
		if (m<=1)
			System.out.print("�Ҽ��� �ƴմϴ�");
		else {
			while(m>i) {
				if (m%i==0) {
					break;
				}
				else
					i++;
			}
			if(i==m)
				System.out.print("�Ҽ� �Դϴ�");
			else
				System.out.print("�Ҽ��� �ƴմϴ�");
				
		}

	}

}
