import java.util.Random;

public class Opinionator {

	public static void main(String[] args) {
		Random rand = new Random();
        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide FOR ME!");

        int x = rand.nextInt(5);
        
        
        System.out.println("the number we chose was: " + x);
        switch (x) {
        case 0:
        	System.out.println("Llamas are the best!");
        	break;
        case 1:
        	System.out.println("Dodos are the best!");
        	break;
        case 2:
        	System.out.println("Wooly mammoths are Definitly the best!");
        	break;
        case 3: 
        	System.out.println("sharks are the greatest");
        	break;
        case 4:
        	System.out.println("Cockatoos are awesome");
        	break;
        case 5:
        	System.out.println("molerates are great");
        	break;
        }
        
        System.out.println("Thank you ransom!");
        
        
        
        
        
      }

}


