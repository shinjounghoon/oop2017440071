public class Loop1 {

	public static void main(String[] args) {
		//1���� ���� 10���� ������ ȭ�鿡 ���
		int i=1; //i�� ��������, 1. �������� �ʱ�ȭ
		while(i<11) { // 2. ���� ���ǽ�
			System.out.println(i);// 3. ������
			i++; // 4. �������� ��ȭ
		}
		//���� ���ǹ���  for������ 
		for(i=1; i<11; i++)
			System.out.println(i);
		i=1;
		int sum=0;
		while(i<11) {
			sum=i+sum;
			i++;
		}
		System.out.println("1���� 10���� ���� " + sum);
		
		String str = "hello darknees my old friend";
		int count = 0;
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(i) !='l')
				continue;
			count++;
		}
		System.out.println("���忡�� �߰��� l�� ������" + count);
		
		System.out.println("==========���α׷� ����===========");
	}
	
} 
