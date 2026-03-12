package Basic_programme;

public class reversenumber {
	public static void main(String[] args) {
		
		int num=121;
		int temp=num;
		int pal=0;
		while(num!=0) {
			int digit=num%10;
			pal=pal*10+digit;
			num=num/10;
		}
		if(temp==pal) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not palindrome number");
		}
		
		
		
	}
	
	make a java programme  that has default and parameterized constructor 

}
