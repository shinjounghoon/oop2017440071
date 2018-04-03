
public class Point {
	
	private double x; //�ʵ��� ��ȿ ���� : Ŭ�� ��ü, ���������� ��ȿ���� : �޼ҵ� ����
	private double y; // public/private + �ڷ��� + ����
	
	public void setX(double xx) {
		this.x=xx;
	}
	public void setY(double yy) {
		this.y=yy;
	}
	public double distance() {
		//��ȯ�� ���� ����
		double result;
		
		//�Ÿ� ���
		result = Math.sqrt(x*x+y*y);
		
		//�Ÿ� ��ȯ
		return result;
	}
		
	public Point move(Point p) {
	
		//temp ���� ����
		double a, b;
		
		//����Ʈ p ��ŭ �̵�
		a=this.x+p.x; // this : �ʵ庯������ ����
		b=this.y+p.y;             
		
		//���ο� ����Ʈ ����                            
		Point pnt = new Point();
		pnt.x=a;
		pnt.y=b;
		
		//���ο� ����Ʈ ��ȯ
		return pnt;
	}
}
