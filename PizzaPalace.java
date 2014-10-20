/**
 * Yoni Lavi 
 * 20 October, 2014 
 */
      
import java.util.Scanner; 
 
public class PizzaPalace {

	public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double people = 0;
      double slicesAllowed = 0;
      double numslices = 0;
      double numpizzas = 0;
      
      System.out.println("Please enter the number of people at the club.");
      people = scnr.nextInt();
      System.out.println("Please enter the number of slices each person is allowed to eat.");
      slicesAllowed = scnr.nextInt();
      System.out.println("Please enter the number of slices in each whole pie.");
      numslices = scnr.nextInt();
      
      numpizzas = (people * slicesAllowed)/numslices;
      numpizzas = Math.ceil(numpizzas);
      
      System.out.println("You would need to buy " + numpizzas + " pizzas to feed everyone at the party.");
		
	}

}
