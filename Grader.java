/**
*  Yoni Lavi
*  20 October, 2014
*/ 

import java.util.Scanner;

public class Grader {
  
  public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     double examItems = 0;
     double missedItems = 0;
     double percent = 0;
     
     System.out.println("Please enter the number of points on the exam.");
     examItems = scnr.nextInt();
     while (missedItems >=0) {
         System.out.println("Please enter the number of points missed on the exam.");
         missedItems = scnr.nextInt();
         percent = ((examItems - missedItems)/examItems) * 100;
         System.out.println("Missing " + missedItems + " points on the exam results in a score of " + percent);
         }
     System.out.println("Thank you, have a great day!"); 
      
  }
    
}
