import java.util.Scanner;

public class IT26100768Lab9Q1{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		double upperPart=0;
		double root1=0;
		double root2=0;
		
		System.out.print("Enter value a: ");
		double a=sc.nextDouble();
		
		System.out.print("Enter value b: ");
		double b=sc.nextDouble();
		
		System.out.print("Enter value c: ");
		double c=sc.nextDouble();
		
		upperPart=Math.sqrt(Math.pow(b,2)-(4*a*c));
		
		root1=(-b+upperPart)/(2*a);
		root2=(-b-upperPart)/(2*a);
		
		System.out.println("");
		System.out.println("Roots are real and different:");
		System.out.printf("Root 1: %.2f",root1);
		System.out.printf("\nRoot 2: %.2f",root2);
		
		
	}
}