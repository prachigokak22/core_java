package Basic_programme;

import java.util.Iterator;

public class pattern {
	public static void main(String[] args) {
		
//		 int num = 1;
//
//	        for(int i = 1; i <= 3; i++) {
//
//	            for(int j = 1; j <= i; j++) {
//	                System.out.print(num);
//	                num++;
//	            }
//
//	            System.out.println();
//	        }
		
		
		for (int i =0; i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
