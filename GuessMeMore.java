import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner myScanner = new Scanner(System.in);
		int guess;
		
		//set random number
		int range = rand.nextInt(201); //range
		int randNum = range - 100;
		
		//guess
		System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
		
		
		while(true) {
			System.out.print("Your guess: ");
			guess = myScanner.nextInt();
			System.out.println();
			
			if (guess < randNum) {
				System.out.println("Ha, nice try - too low! Try again!");
			}
			else if(guess > randNum) {
				System.out.println("Ha, nice try - too high! Try again!");
			}
			else {
				System.out.println("Wow, nice guess! That was it!");
				break;
			}
			
		}
		
		

	}

}
