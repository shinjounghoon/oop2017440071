public class Three {

	public static void main(String[] args) {
		System.out.println("3������");
		//3. 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� 
		//������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(while�� ���)
		int i;
		int num=0;
		i=1;
		while(i<=100) {
			if(i%3==0) {
				num=num+i;
				i++;
			}
			else
				i++;
		}
		System.out.println(num);
		
	}

}
