import java.util.Scanner;

public class main{
	
    public static void main(String[] args) {
		int option;
		Scanner input = new Scanner(System.in);
		//TODO: Replace int with User class type
		int usr = getUser();
			
		do{
			clearScreen();
			printMenu();
			option = input.nextInt();
			
			switch(option){
				case 1:
					System.out.println("callBudgetPlanner");
					break;
				case 2:
					System.out.println("callFinanceCalc");
					break;
				case 3:
					System.out.println("callUserProfiler");
					break;
				case 0:
					break;
			}
		}while(option != 0);

    }
	
	//Prints Main Menu
	public static void printMenu(){
		System.out.println("--- FINANCE PLANNER ---");
		System.out.println("------ MAIN MENU ------");
		System.out.println("(1) Budget Planner");
		System.out.println("(2) Finance Calculators");
		System.out.println("(3) User Directory");
		System.out.println("(0) Quit");
		System.out.println();
		System.out.print("Choice: ");
	}

	//TODO: Remove prototypes once User Profiler and other features are implemented.
	public static int getUser(){
		System.out.println("GET USER FUNCTION");
		return 1;
	}
	
	//TODO: Add to Utility Engine
	public static void clearScreen() {
		for (int i = 0; i < 50; ++i) System.out.println();
	}
}