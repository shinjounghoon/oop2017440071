
public class Twentythree {

	public static void main(String[] args) {
		// 23.***** *
		//    *** ***
		//    * *****
		int ln=0;
		while (ln<3) {
			int i=0;
			while(i<7) {
				if(ln==0&&i==5||ln==1&&i==3||ln==2&&i==1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			
			System.out.println("");
			
			ln++;
		}


	}

}
