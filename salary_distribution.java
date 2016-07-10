public class expenses
{
	public static void main(String args[])
	{
		//Get User salary and other expense details
		/* Ask use user if he owns house or not;If yes, ask mortage details
		  If no, ask rent*/
		  
		  
		double salary= 50000;
		double rent = 10000.0;
		double food = 5000;
		double water = 500.0;
		double electricity = 500.0;
		double gas = 475.0;
		double baby = 10000.0;
		double miscellaneous = 10000.0;
		double save = salary -(rent + food + water + electricity + gas + baby + miscellaneous);
		
		System.out.println(" Your salary distribution is as follows \n");
		System.out.println(" You spend "+ ((rent/salary)*100)+ "% of your salary on your monthly rent \n");
		System.out.println("You spend "+ ((food/salary)*100)+ "% of your salary on your monthly grocessery and other food \n");
		System.out.println("You spend "+ ((water/salary)*100)+ "% of your salary on water \n");
		System.out.println("You spend "+ ((electricity/salary)*100)+ "% of your salary on electricity \n ");
		System.out.println("You spend "+ ((gas/salary)*100)+ "% of your salary on gas \n");
		System.out.println("You spend "+ ((baby/salary)*100)+ "% of your salary on your baby's items \n");
		System.out.println("You spend "+ ((miscellaneous/salary)*100)+ "% on miscellaneous items \n");
		System.out.println("The amount you are currently able to save is : "+ save + " which is " + ((save/salary)*100) + "% of your salary");
		
		
		
		//Ask travel expenses, if any including car lease and gas
	
		
		
		
	}
}	