
public class Point {
	
	private double x; //필드의 유효 범위 : 클라스 전체, 지역변수의 유효범위 : 메소드 내부
	private double y; // public/private + 자료형 + 변수
	
	public void setX(double xx) {
		this.x=xx;
	}
	public void setY(double yy) {
		this.y=yy;
	}
	public double distance() {
		//반환할 변수 선언
		double result;
		
		//거리 계산
		result = Math.sqrt(x*x+y*y);
		
		//거리 반환
		return result;
	}
		
	public Point move(Point p) {
	
		//temp 변수 선언
		double a, b;
		
		//포인트 p 만큼 이동
		a=this.x+p.x; // this : 필드변수임을 강조
		b=this.y+p.y;             
		
		//새로운 포인트 생성                            
		Point pnt = new Point();
		pnt.x=a;
		pnt.y=b;
		
		//새로운 포인트 반환
		return pnt;
	}
}
