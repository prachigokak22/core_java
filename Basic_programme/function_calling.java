// 12-3-26  function 
package Basic_programme;

public class function_calling {
	// function has 4 types 
	//no parameter no return 
	
	void  test() {
		System.out.println("No retuen no parameter");
	}
	
	// no return and with parameter
	void test1(int i) {
		System.out.println(i);
	}
	
	// with return no parameter 
	int test_in() {
		return 1;
	}
	
	// with return and with parameter
	int test_ret(int i) {
		return i;
	}
	
	public static void main(String[] args) {
	// class h   variable fun = new function_calling(); ek object h 
		function_calling  fun = new function_calling();
		 fun.test();
		 fun.test1(5);
		 int i = fun.test_in();
		 System.out.println(i);
		 
		 System.out.println(fun.test_ret(12));
		
	}
	
	
}
