import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("5������");
		//5. �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//choose one of the following.
		 //apple
		 //orange
		 //banana
		 //peach

		 //enter your choice here : (����� �Է�)orange

		 //--------------
		 //Your choice is ��orange��.
		String a;
		System.out.println("choose one of the following");
		System.out.println("apple,orange,banana,peach");
		Scanner input=new Scanner(System.in);
		a=input.next();
		System.out.print("enter your choice here:"+ a);
	}
}