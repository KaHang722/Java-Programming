import java.util.Scanner;

public class AccountInterface {
	
	public static void menu() {
		System.out.println("Please select one option:");
		System.out.println("1- open new account;");
		System.out.println("2- deposit an amount;");
		System.out.println("3- withdraw an amount;");
		System.out.println("4- check the account;");
		System.out.println("0- exit");
	}
		
	public static void displayMenuAndGetInfo() {
		BankAccount ba1 = new BankAccount();
		Scanner keyboard = new Scanner(System.in);
		int option;

		do {
			menu();
			option = keyboard.nextInt();
			switch (option)
			{
			case 1:
				ba1.openAccount();
				break;
			case 2:
				ba1.depositAnAmount();
				break;
			case 3:
				ba1.withdrawAnAmount();
				break;
			case 4:
				System.out.println(ba1);
				break;
			case 0:
				ba1.exit();
				break;
			}
		}while(option != 0);
	}
}

