
//12-3-26 class and object  
// make a java programme that has default and paramerized constructor

package Basic_programme;



public class class_object {
	
	// constructor name shoulb be same as class name 
	// type -> default cons(no param)
	// parameteried constructor 
	public class_object (){
		System.out.println("Hello");
	}
	
	class_object(int i , int j){
		System.out.println(i+j);
	}
	
public static void main(String[] args) {
	
	class_object co = new class_object(); //heap memory 
	class_object co1 = new class_object(12,12); // heap memory
	
}
}
