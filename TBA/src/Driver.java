import java.util.Scanner;


public class Driver {


	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("You see two paths before you one leads to a castle the other " +
				"takes you to a small area with a few surprises. " +
				"Path 1 or path 2");

	      Scanner sc = new Scanner(System.in); 
	      String selection = sc.nextLine();
	      
	      if(selection.equals("path 1") || selection.equals("1") )
	      {
	    	  System.out.println("You  see an orc that does 80 base damage do you a fight or b run");
	      }
	

	      Scanner sc3 = new Scanner(System.in); 
	      String selection3 = sc.nextLine();
	      
	      if(selection3.equals("a"))
	      {
	    	  System.out.println("the orc is killed at the cost of 100 lifepoints");
	      }
	      
	      
	      
	   
	     Scanner sc2 = new Scanner(System.in); 
	     String selection2 = sc.nextLine();   
     	 
	           
	        if(selection2.equals("path 2") || selection.equals("2") )                
	     
	        {     
	          System.out.println(" You see a sword in a tree and a statue with a sword to be inserted, tree or hole ");  
	        }
	        
	  
	}        
	      
	
      
	
