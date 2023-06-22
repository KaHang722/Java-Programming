import java.util.Scanner;

public class BankAccount {
	private String name;
	private double accountBalance;
	private double deposit;
	private double withdraw;
	private int accountNumber;
	private static int assignAcctNo = 5000;

	Scanner keyboard = new Scanner(System.in);

	BankAccount(){
		accountNumber = ++assignAcctNo;
		name = "";
		accountBalance = 0;
	}

	public String toString() {
		return "Account Number " + accountNumber + " - Holder Name : " + name + " - Balance : " + accountBalance + "";
	}

	public void openAccount() {
		System.out.println("Please enter your name and account balance:");
		name = keyboard.next();
		accountBalance = keyboard.nextDouble();
		if (accountBalance <0) {
			System.out.println("Sorry, no account created with negative balance;");
		}else {
			System.out.println("Thank you, the account is ready");
		}	
	}

	public void depositAnAmount() {
		if (accountBalance<=0 && name=="") {
			System.out.println("You don’t have an account yet;");
		}else {
			System.out.println("How much would you like to add:");
			deposit = keyboard.nextDouble();
			if (deposit <0) {
				deposit = 0;}
			accountBalance+=deposit;
			System.out.println("Thank you, your new balance is " + accountBalance);
		}
	}

	public void withdrawAnAmount() {
		if (accountBalance<=0 && name=="") {
			System.out.println("You don’t have an account yet;");
		}else {
			System.out.println("How much would you like to get:");
			withdraw=keyboard.nextDouble();
			if (withdraw<=accountBalance) {
				accountBalance-=withdraw;
				System.out.println("Thank you, your new balance is "+accountBalance);
			}else {
				System.out.println("Sorry, you don’t have this amount");
			}
		}
	}

	public void exit() {
		System.out.println("Thank you for using our banking application");
	}

	public String getName() {
		return name;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public double getDeposit() {
		return deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public boolean equals(BankAccount bankAccountToCompare) {
		boolean result = false;
		if (accountNumber == bankAccountToCompare.getAccountNumber()
			&& name == bankAccountToCompare.getName()){
			result= true;
		}
		return result;
	}
}
