 package SavingsAccount;
import java.util.Scanner;

public class Account {
	int bal = 2000;

	void withdraw(int wamt) throws InsufficientFundsException, llegalBankTransctionException {
		
		if (wamt > bal)
		{
			throw new InsufficientFundsException("no sufficient amount to withdraw");
		}
		else if (wamt<0)
		{
			throw new llegalBankTransctionException("illegal bank exception");
			
		}
		else
		{
			bal = bal - wamt;
			System.out.println("bal" + bal);
		}
	}


	void deposits(int dmat) {
		bal = bal + dmat;
		System.out.println("After deposit:" + bal);
	}

	void balcheck() {
		System.out.println("bal amount:" + bal);
	}

	public static void main(String[] args) throws InvalidAccountNumberException, InsufficientFundsException, llegalBankTransctionException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account number");
		String accno = sc.next();
		if (accno.length() < 10) {
			throw new InvalidAccountNumberException("account number is not having 10 digits");
		} else {
			System.out.println("enter the account holder name");
			String name = sc.next();
			Account a = new Account();
			System.out.println("1.withdraw \n 2.deposit \n 3.balance check:");
			System.out.println("enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter withdraw amt");
				int wamt = sc.nextInt();
				a.withdraw(wamt);
				break;
			case 2:
				System.out.println("enter the amount to deposit:");
				int damt = sc.nextInt();
				a.deposits(damt);
				break;
			case 3:
				a.balcheck();
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}
}
