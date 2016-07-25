import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class budget_implementation
{
	public static void main(String [] args){
		salary_distribution obj = new salary_distribution();
		obj.menu();
	}
	public static void menu()
	{
		salary_distribution obj = new salary_distribution();
		  int choice,id;
		  
		  Scanner input = new Scanner(System.in);
		  System.out.println(" Before we start \n");
		  System.out.println("Please enter your ID :");
		  id = input.nextInt();
		  obj.input_detail(id);
		  
		  
		  System.out.println("----- Budget Implimentation -----");
		  System.out.println(" 1- Salary Distribution ");
 	      System.out.println(" 2- Financial Goals/Plans ");
 	      System.out.println(" 3- Setting a budget ");
 	      System.out.println(" 4- Changing details of any particular expense ");
		  System.out.println(" 5- Delete the current file of your expense details(if you have an exsisting one)");
   			System.out.print("Enter your choice : \n");
 	  		choice = input.nextInt();
 	  	do{	
 	  		switch(choice)
			{
   					case 1:
						//System.out.println("calling salary_distribution function");
						obj.salary_distribution(id);
  						choice = 0;
   						break;
 	  				case 2:
					    
						obj.goals_financial(id);
 	  					choice =0;
 	  					break;
 	  				case 3:
					   
						/*obj.budget_setting(id);
 	  					choice =0;*/
 	  					break;
					case 4:
					    
						//change_details();
 	  					
 	  					break;	
 	
 	  				case 0:
 	  					break;
   			}
   		}while(choice != 0);
	} 	
		public static void clear_screen()
		{
			for (int i = 0; i < 50; ++i) System.out.println();
		}
	
		
	public void input_detail(int id){
		
		char c,c1;
		
		  double[] expense_store = new double[7];
		  /*Charset utf8 = StandardCharsets.UTF_8;
		  String c_Dir;*/
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("A few questons to know you better: \n Do you own a house or you rent a house(Y/N)? \n");
		  c = input.next().charAt(0);
		  while(c != 'n' && c != 'N' && c != 'Y' && c != 'y')
		  {
			  c = ' ';
			  System.out.println("Please enter y/ Y or n/N: \n");
			   c = input.next().charAt(0);
			  
		  }
			  if(c == 'n' || c == 'N'){
			System.out.println("Please enter your monthly rent: \n");
			
			expense_store[0] = input.nextDouble();
			  }
			  if(c == 'y' || c == 'Y'){
			System.out.println("Please enter your monthly mortgage: \n");
			
			expense_store[0] = input.nextDouble();
			  }
			  
		  
		  
		  System.out.println(" Do you have your own car or a leased car (Y/N)? \n");
		  c1 = input.next().charAt(0);
		  while(c1 != 'n' && c1 != 'N' && c1 != 'Y' && c1 != 'y')
		  {
			  c1 = ' ';
			  System.out.println("Please enter y/ Y or n/N: \n");
			   c1 = input.next().charAt(0);
			  
		  }
		  
		
		
		System.out.println("Please enter your monthly expenditure on food: \n");
		expense_store[1] = input.nextDouble();
		
		System.out.println("Please enter your monthly expenditure on water: \n");
		expense_store[2] = input.nextDouble();
		
		System.out.println("Please enter your monthly expenditure on electricity: \n");
		expense_store[3] = input.nextDouble();
		
		if(c1 == 'y' || c1 == 'Y'){
			System.out.println("Please enter your monthly expenditure on your car: \n");
		    expense_store[4] = input.nextDouble();
		}
		if(c1 == 'n' || c1 == 'N'){
			System.out.println("Please enter your monthly expenditure on transport: \n");
		    expense_store[4] = input.nextDouble();
		}
		System.out.println("Please enter your monthly expenditure on your partner/wife/baby/family:  \n");
		expense_store[5] = input.nextDouble();
				
		System.out.println("Please enter your monthly miscellaneous expenditure: \n");
		expense_store[6] = input.nextDouble();
		
		
	/*List<String> lines = Arrays.asList(Double.toString(expense_store[0])+ "," +Double.toString(expense_store[1])+ "," + Double.toString(expense_store[2]) + ","+ Double.toString(expense_store[3])+ "," + Double.toString(expense_store[4]) + "," + Double.toString(expense_store[5]) + "," + Double.toString(expense_store[6]));	
	
		File file = new File("UserDetails" +  Integer.toString(id) + ".txt");
	   
 	    c_Dir = file.getAbsolutePath();
 	    System.out.println("Your salary details are in : "+ c_Dir);
 	  
 	    Path fileP = Paths.get(c_Dir);
 	    try {
 		
 			Files.write(fileP, lines, utf8);
 		
		  } catch (IOException e) {
 		
 		e.printStackTrace();
  	   }*/
	   String filename = "Userexpenses" + Integer.toString(id) + ".txt";
	   
	   try {
	   BufferedWriter outputWriter = null;
	   outputWriter = new BufferedWriter(new FileWriter(filename));
	   
	   for (int i = 0; i < expense_store.length; i++) 
	   {
       outputWriter.write(Double.toString(expense_store[i]));
       outputWriter.newLine();
	   }
		outputWriter.flush();  
	    outputWriter.close(); 
		
	    }catch(IOException e){}
	   
		
	}	
	
		  
	public void salary_distribution(int id)
	 {	
	     /*This is where I get the salary from the userprofile text file using the id number of the user.
			For now I am using a pre-defined salary variable*/
			//reading from the file
			//Reading the salary from the userinfo file
			
		Double[] expense_store = new Double[7];
		double salary = 50000.0;
		String filename = "Userexpenses" + Integer.toString(id) + ".txt";
		//String line;
		String str;
		String paths;
		double sum =0.0;
		
		/*try {
	    FileInputStream reader = new FileInputStream(filename);
        BufferedReader breader = new BufferedReader(new InputStreamReader(reader));
		
		while((line = breader.readLine()) != null){
		for(int i=0; i< expense_store.length; i++)
		 {
			expense_store[i] = breader.readLine();			
		 }
		 expense_store[0] = line;
		}
		reader.close();
		} catch(IOException e){}*/
		
		try{
		File file = new File(filename);
		
		paths = file.getAbsolutePath();
		BufferedReader in = new BufferedReader(new FileReader(paths));
      

        List<String> list = new ArrayList<String>();
        while((str = in.readLine()) != null){
            list.add(str);
        }

        String[] stringArr = list.toArray(new String[0]);
		
		for(int j=0; j<stringArr.length; j++)
		{
			expense_store[j] = Double.parseDouble(stringArr[j]);
		}
		} catch(IOException e){}
		
		
		/*double rent = 10000.0;
		double food = 5000;
		double water = 500.0;
		double electricity = 500.0;
		double gas = 475.0;
		double baby = 10000.0;
		double miscellaneous = 10000.0;
		double save = salary -(rent + food + water + electricity + gas + baby + miscellaneous);*/
		
		
		
		System.out.println(" Your salary distribution is as follows: \n");
		System.out.println(" You spend "+ expense_store[0]+ " on your our monthly rent/mortage, which is "+((expense_store[0]/salary)*100)+ "% of your salary  \n");
		System.out.println("You spend "+ expense_store[1]+ " on your monthly grocessery and other food, which is "+((expense_store[1]/salary)*100)+ "% of your salary  \n");
		System.out.println("You spend "+ expense_store[2]+ " on your water bill, which is "+((expense_store[2]/salary)*100)+ "% of your salary \n");
		System.out.println("You spend "+ expense_store[3]+ " on electricity, which is "+ ((expense_store[3]/salary)*100)+ "% of your salary  \n ");
		System.out.println("You spend "+ expense_store[4]+ " on your car /transport, which is "+ ((expense_store[4]/salary)*100)+ "% of your salary \n");
		System.out.println("You spend "+ expense_store[5] + " on your wife/baby/partner, which is "+ ((expense_store[5]/salary)*100)+ "% of your salary \n");
		System.out.println("You spend "+ expense_store[6]+ " on your miscellaneous items , which is "+((expense_store[6]/salary)*100)+ "% of your salary\n");
		
		for(int i=0; i<expense_store.length;i++)
		{
			 sum = sum + expense_store[i];
		}
		System.out.println("The amount you are currently able to save is : "+ (salary - sum) + " which is " + (((salary-sum)/salary)*100) + "% of your salary \n");
		
		
	 }
		
	public void goals_financial(int id)
	{
		Double[] expense_store = new Double[7];
		Double[] cut-down = new Double[4];
		//This is the part where I get the salary from the text file
		double salary = 50000.0;
		double sum =0.0;
		double save,months;
		double total-save =0.0;
		int choice;
		String filename = "Userexpenses" + Integer.toString(id) + ".txt";
		String str;
		String paths;
		
		try{
		File file = new File(filename);
		
		paths = file.getAbsolutePath();
		  BufferedReader in = new BufferedReader(new FileReader(paths));
      

        List<String> list = new ArrayList<String>();
        while((str = in.readLine()) != null){
            list.add(str);
        }

        String[] stringArr = list.toArray(new String[0]);
		
		for(int j=0; j<stringArr.length; j++)
		{
			expense_store[j] = Double.parseDouble(stringArr[j]);
		}
		} catch(IOException e){}
		
		System.out.println(" How much do you want to save? ");
		
		Scanner input = new Scanner(System.in);
		save = input.nextDouble();
		
		System.out.println(" How much time do you have to save it? ");
		months = input.nextDouble();
		
		for(int i=0;i<expense_store.length;i++)
		{
			sum = sum + expense_store[i];
			
		}
		System.out.println(" You current monthly saving is "+ (salary - sum)+ "\n" );
		
		if((save/months) > (salary - sum)){
			System.out.println(" You need to save "+ ((save/months) - (salary-sum))+ " more per month ");
			
		System.out.println(" Your non-fixed expenses each month are your expense on food, partner/wife and miscellaneous which are "+ expense_store[1]+","+expense_store[5]+","+expense_store[6]+ "respectively \n ");
		System.out.println(" Your other expenses are fixed. \n Please tell us your cut-down in each non-fixed category when asked :\n ");
		
		System.out.println("Please enter your cut-down on your food, partner/wife/baby/family and miscellaneous in order(one after the other) \n");
		
		cut-down[0] = input.nextDouble();
		cut-down[1] = input.nextDouble();
		cut-down[2] = input.nextDouble();
		
		
		for(int k=0; k< cut-down.length;k++){
			 total-save = total-save + cut-down[k];
		}
		System.out.println(" You are saving "+ total-save +" more per month , which makes your total saving "+ ((salary-sum)+total-save)+ "per month \n");
		
		if(((salary-sum)+total-save) >= (save/months) ){
			System.out.println(" You are good to go in terms of saving! \n");
		}
		if(((salary-sum)+total-save) < (save/months) )
			System.out.println(" You are still short by "+ ((save/months)-((salary-sum)+total-save))+ "\n would you like to enter any additional cut-down? enter 0 if you can't cut-down any further \n");
			cut-down[3] = input.nextDouble();
		
		} 
		else{
			System.out.println("  You already save more than the required amount per month, you should be good!");
		}
		
		
		//Still working on this function
	}	
	
	/*public void budget_setting(int id)
	{
		System.out.println(" I will work on this after I am done with the other ones ");
	}
	public void change_details()
	{
		
	}*/
		
		
	
		
		
		
	
}	