import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		System.out.println("4������");
		//4. ����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		int a;
		
		Scanner input=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		a=input.nextInt();
		
		while(a>100) {
			System.out.println("100�� ������ ������ �Է��ϼ���");
			System.out.print("������ �Է��ϼ���:");
			a=input.nextInt();
		}
		
		if(a>=80) 
			System.out.println("������ A�Դϴ�");
		else if(a>=60)
			System.out.println("������ B�Դϴ�");
		else if(a>=40)
			System.out.println("������ C�Դϴ�");
		else if(a>=20)
			System.out.println("������ D�Դϴ�");
		else 
			System.out.println("������ E�Դϴ�");
		
		

	}

}
