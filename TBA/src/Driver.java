import java.util.Random;
import java.util.Scanner;

public class Driver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Random rand = new Random();
		Player person = new Player();

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
				person.Health -= 100;
				System.out.println("Your health is now " + person.Health);
				person.money += 2825;
				System.out.println("Your money is now" + person.money);

			}
			
			System.out
					.println("you come across a full health potion and recieve full health, you arrive at the" +
							" entrace to the castle but you also see a dungeon where wi.l you go, both hold unknown " +
							"surprises and dangers d, dungeon or c castle");
			person.Health += 100;
			System.out.println("Your health is now " + person.Health);
			person.lvl += 2;
			System.out.println("Your lvl is now" + person.lvl);
			
			if (selection.equals("d"))
			{
				System.out
						.println("You go down the hole and into the dungeon where a troll with 100 base damge and 35 dark damage awaits you, do you battle or flee");
			}


			selection = sc.nextLine();
			if (selection.equals("run") || selection.equals("b"))
			{
				System.out.println("Your cowardice has cost you 120 hp, well done(sarcasm)");
				person.Health -= 120;
				System.out.println("Your health is now " + person.Health);
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

					System.out.println("the bog giant is killed with no damage taken but it now evolves into a moss golem(scary!!!!) " +
							"do you a, confront it or b, piss your pants and run away");
					person.money += 3000;
					System.out.println("Your money is now" + person.money);

				}

				selection = sc.nextLine();
				if (selection.equals("confront"))
				{
					int golemHealth = 200;
					while(person.Health > 0 && golemHealth > 0)
					{
						System.out.println("1. attack ; 2. defend ");
						int sel = sc.nextInt();
						int golemAttack = rand.nextInt(21);
						if(sel == 1)
						{
							int randAttack = rand.nextInt(person.attack);
							golemHealth -= randAttack;
							System.out.println("You attack the golem for " + randAttack + " damage");
						}
						else if (sel == 2)
						{
							golemAttack /= 2;
							System.out.println("You defend");	
						}
						
						person.Health -= golemAttack;
						System.out.println("golem attacks you for " + golemAttack + " damage");
						System.out.println("Your Health is now" + person.Health);
					}
					
				}
				person.lvl += 4;

			}
		}

	}

}
