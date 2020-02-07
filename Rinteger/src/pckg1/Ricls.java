package pckg1;

public class Ricls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Using While Loop
				int num = 12345; //54321
				int rev = 0;
				
				while(num != 0)
				{
					rev = rev * 10 + num % 10; //5432
					num = num / 10; //12
				}
				System.out.println(rev);
				
				//Using StringBuffer Class
				int num1 = 23456;
				System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
		

	}

}
