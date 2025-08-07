import java.util.Scanner;
class ExceptionDivision{
	public static void main(String args[]){
		try{
			Scanner input=new Scanner(System.in);
			System.out.println("Enetr a first number to division operation:");
		    double a=input.nextDouble();
		    input.nextLine();
		    System.out.println("Enetr a second number to division operation:");
		    double b=input.nextDouble();
			System.out.println(a/b);
		} catch(Exception e){
			System.out.println("invalid input or division by zero");
		}
	}
}