import java.util.Scanner;
import java.util.InputMismatchException;
class ExceptionHandling{
	public static void main(String args[]){
		try{
			Scanner input=new Scanner(System.in);
			System.out.println("Enetr a first number to division operation:");
			double a=input.nextDouble();
			input.nextLine();
			System.out.println("Enetr a second number to division operation:");
			double b=input.nextDouble();
			input.nextLine();
			try{
				System.out.println("now we add elements in array,how many values you want to add:");
				int size=input.nextInt();
				input.nextLine();
				String[] values={"1","2","3","4","5","6"};
				for(int i=0;i<size;i++){
					System.out.println("Enter the values");
					String val=input.nextLine();
					values[i]=val;
				}
				System.out.println("Enter the index number which did you want to print:");
				int ind=input.nextInt();
				System.out.println("The index value ofarray is:"+values[ind]);
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array Index Out Of Bounds Exception");
			}
			System.out.println("The value a/b is:"+a/b);
		}catch(ArithmeticException i){
			System.out.println("division by zero");
		}catch(InputMismatchException j){
			System.out.println("invalid input.");
		}finally{
			System.out.println("End of program.");
		}
	}
}