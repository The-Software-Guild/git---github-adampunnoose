import java.util.Scanner;

public class Factorizer {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("What number would you like to factor? ");
		int num = myScanner.nextInt();
		double numm = num;
		int count = 0;
		int perfCheck = 0;
		
		System.out.println("The factors of " + num + " are: ");
		
		for(int i = 1; i < (num/2 + 1) ; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
				count +=1;
				perfCheck += i;
			}
		}
		System.out.print(num + "\n");
		count += 1;
		
		System.out.println(num + " has " + count + " factors.");
		
		//perfect num check 
		if(perfCheck == num) {
			System.out.println(num + " is a perfect number");
		}
		else {
			System.out.println(num + " is NOT a perfect number");
		}
		
		//prime check 
		if(count == 2) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is NOT a prime number");
		}
		

	}

}
