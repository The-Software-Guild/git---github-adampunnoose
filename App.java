import java.util.Scanner;

public class App {
	//presents calculator to user
	
	App(){

		
		
	}
	
	public void prompt() {
		boolean again = true;
		float num1, num2;
		Scanner myScanner = new Scanner(System.in);
		while(again == true) {
			System.out.println("What operation would you like to perform?");
			System.out.println("(1 = Addition, 2 = Subtraction, 3 = Multiplication, "
					+ "4 = Division, 5 = Exit Program\n");
			int operation = myScanner.nextInt();
			
			if(operation >= 1 && operation <= 4) {
				System.out.println("op: "+ operation);
				System.out.print("Operand 1: ");
				num1 = myScanner.nextFloat();
				System.out.print("operand 2: ");
				num2 = myScanner.nextFloat();
				
				switch(operation) {
					case 1:
						System.out.println("Answer is: " +SimpleCalculator.addition(num1, num2));
						break;
					case 2: 
						System.out.println("Answer is: " +SimpleCalculator.subtraction(num1, num2));
						break;
					case 3:
						System.out.println("Answer is: " +SimpleCalculator.multiplication(num1, num2));
						break;
					case 4:
						System.out.println("Answer is: " +SimpleCalculator.division(num1, num2));
						break;
				}
						
			}
			else {
				System.out.println("Program has been ended");
				again = false;
			}
			
		}
		
		
		
		
	}
}
