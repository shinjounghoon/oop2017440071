import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		System.out.println("7�� ����");
		//7. 0�� �Էµ� ������ ��� ������ �Է� �ް�,
		//�Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		
		int i;
		Scanner input=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�:");
		i=input.nextInt();
		
		int num=0;
		while(i!=0) {
			num=num+i;
			System.out.print("������ �Է��Ͻÿ�:");
			i=input.nextInt();
		}
		System.out.println(num);
	}

}
