import java.util.Scanner;
public class TwentyOne {

	public static void main(String[] args) {
		// 21. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int n;
		Scanner input=new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		n=input.nextInt();//Ű���忡�� ���� �Է�
		int sum=0;
		int k=2;
		while(n>=k) {
			int i=2;
			while(k>i) {
				if (k%i==0) 
					break;				
				else
					i++;
			}
			if(k==i) {
				sum=k+sum;
				k++;
			}
			else 
				k++;
				
		}
		
		System.out.print(sum);
	}

}
