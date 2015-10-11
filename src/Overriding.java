import java.util.Scanner;

public class Overriding {

	public static void main(String[] args) {
		
		Entity addNum = new IntNum();
		Entity addInt = new FloatNum();
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Choose 1 for multiplying numbers, 2 for multiplying floats");
		int choice = user_input.nextInt();
		
		if (choice==1) {
			System.out.println("Enter the number 1 : ");
			int number1 = user_input.nextInt();
			
			System.out.println("Enter the number 2 : ");
			int number2 = user_input.nextInt();
			
			System.out.println(addNum.Add(number1, number2));
			}
			
		if(choice==2) {
				
			System.out.println("Enter the float number 1 : ");
			float number1 = user_input.nextFloat();
				
			System.out.println("Enter the float number 2 : ");
			float number2 = user_input.nextFloat();
				
			System.out.println("The answer is " + addInt.Add(number1,number2));
				
			}		
	}

}
