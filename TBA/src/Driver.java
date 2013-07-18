import java.util.Scanner;

public class Driver
{

		/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Player man = new Player();

		System.out.println("You see two paths before you one leads to a castle the other " + "takes you to a small area with a few surprises. "
				+ "Path 1 or path 2");

		Scanner sc = new Scanner(System.in); // takes input from console
		String selection = sc.nextLine();

		if (selection.equals("path 1") || selection.equals("1"))
		{
			System.out.println("You  see an orc that does 80 base damage do you a fight or b run");

			selection = sc.nextLine();
			if (selection.equals("a"))
			{
				System.out.println("the orc is killed at the cost of 100 lifepoints");
				man.Health -= 100;
				System.out.println("Your health is now " + man.Health);
			   man.money += 2825;
                System.out.println("Your money is now" + man.money); 
			
			}    
                {
			 System.out.println("you come across a full health potion and recieve full health, you arrive at the entrace to the castle but you also see a dungeon where wi.l you go, both hold unknown surprises and dangers d, dungeon or c castle");
			 man.Health += 100;
			 System.out.println("Your health is now " + man.Health);
			 man.lvl += 2;
			 System.out.println("Your lvl is now" + man.lvl);
			}
			  
			{
			selection = sc.nextLine(); 
		    if (selection.equals("d"));
			}
        
			{
			  System.out.println("You go down the hole and into the dungeon where a troll with 100 base damge and 35 dark damage awaits you, ");
			
			}
	   	
		}
		else if (selection.equals("path 2") || selection.equals("2"))
		{
			System.out.println(" You see a sword in a tree and a statue with a sword to be inserted, tree or hole ");

			selection = sc.nextLine();
			if (selection.equals("tree"))
			{
				System.out.println("The bog giant appears and you know nothing of its power do you either fight or scream like a little baby");

				selection = sc.nextLine();
				if (selection.equals("fight"))
				{
					
				System.out.println("the bog giant is killed with no damage taken but it now evolves into a moss golem(scary!!!!) do you a, confront it or b, piss your pants and run away");
				man.money += 3000;             
				System.out.println("Your money is now" + man.money);             
				
            }

		}
	}
	
	}		
	
}			
