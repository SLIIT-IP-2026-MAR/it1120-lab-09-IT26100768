public class IT26100768Lab9Q3{
	public static void main(String[] args){
		
		int answer1=square(add(multiply(3,4),multiply(5,7)));
		int answer2=add(square(add(4,7)),square(add(8,3)));
		
		System.out.print("Result of (3 * 4 + 5 * 7)²: "+answer1);
		System.out.print("\nResult of (4 + 7)² + (8 + 3)²: "+answer2);
		 
	}
	
	
	public static int add(int num1,int num2){
		return num1+num2;
	}
	
	public static int multiply(int num1,int num2){
		return num1*num2;
	}
	
	public static int square(int num){
		return num*num;
	}
}