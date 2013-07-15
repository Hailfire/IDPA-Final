import java.util.*;

public class Driver
{ 
	public static void main (String [] args)
	{
		int lvl = 8;
		System.out.println("you are lvl "+lvl);
		
		System.out.println("You see two paths, path 1 and path 2 which do you take, one leads to a castle the other leads to a small area");
		
		Scanner user = new Scanner (System.in);
		String path1 = "1";
		String path2 = "2";
		String userchoice = user.nextLine();
		if(userchoice.equals(path1))
		{
			System.out.println("an orc appears do you \n1 fight or \n2 run or \n3 surrender, \nthe orc is level 10 and deals 20 base damage plus 15 fire damge with no resistance while you are lvl 8 and do 30 base damage no elemental damage and resistance, your ring has a level 2 shock spell" );
			++lvl;
			System.out.println(lvl);	
		}
	
	}
	
}
	
	
	
	

