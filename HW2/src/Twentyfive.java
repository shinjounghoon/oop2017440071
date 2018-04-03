
public class Twentyfive {

	public static void main(String[] args) {
		// 25.다음과 같은 출력이 나오도록 프로그램을 작성하시오.
		//(1)            (2)
		//***********    54321012345
		//*********      432101234
		//*******        3210123
		//*****          21012
		//***            101
		//*              0
		//***            101 
		//*****          21012 
		//*******        3210123 
		//*********      432101234 
		//***********    54321012345
		int i;
		int count=9;
		while(count>0) {
			i=1;
			while(i<=count) {
				System.out.print("*");
				count=count-2;
			}
			System.out.println("");
			i++;
		}
		while(count<10) {
			i=1;
			while(i<=count) {
				System.out.print("*");
				count=count+2;
			}
			System.out.println("");
			i++;
		}
		
			
			


	}

}
