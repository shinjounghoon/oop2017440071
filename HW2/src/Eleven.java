import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		System.out.println("11�� ����");
		//10. �Ҽ�(prime-number) �˻�� ����ϰ� ����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//8 => 2 4 
		//12 => 2 3 4 6
		//11. ���� ������ 0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.
		int i=1;
		
		Scanner input=new Scanner(System.in);
		
		while(i!=0) {
			System.out.print("������ �Է��ϼ���:");
			i=input.nextInt();
			int num=2;
		while(i>num) {
			if(i%num==0) {
				System.out.println(num);
				num++;
			}
			else {
				num++;	
		}

	}
	
	}
}
}
