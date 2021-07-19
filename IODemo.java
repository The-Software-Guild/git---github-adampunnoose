import java.util.Scanner;

public class IODemo implements UserIO {

	Scanner MS = new Scanner(System.in);
	public void print(String message) {
		// print message to console
		System.out.print(message);
		
	}

	@Override
	public String readString(String prompt) {
		// display message to console and return their input
		print("\n");
		print(prompt);
		return MS.next();
	}

	@Override
	public int readInt(String prompt) {
		print("\n");
		print(prompt);
		return MS.nextInt();
	}

	@Override
	public int readInt(String prompt, int min, int max) {
		// keep prompting the user until input is within range
		print("\n");
		print(prompt);
		
		int num =  MS.nextInt();
		while(num < min || num > max) {
			System.out.print("\nplease try again ");
			num = MS.nextInt();
		}
		
		
		
		return num;
	}

	
	
}
