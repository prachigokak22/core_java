//day 3 - 11-0-26

package Basic_programme;

public class armstrong {
	
	public static void main(String[] args) {
		int num = 378;
		int temp = num;
		int sum = 0;
		while (num != 0) {
			int digit = num%10;
			 sum =sum+digit*digit*digit;
		   num = num /10;
			
		}
		
		if (temp == sum) {
			System.out.println(temp + ""+ "is an armstrong number");
			
		}else {
			System.out.println(temp +""+ "Is not an armstrong number");
		}
		
	}

}
