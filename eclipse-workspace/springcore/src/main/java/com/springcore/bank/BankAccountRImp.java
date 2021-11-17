package com.springcore.bank;

public abstract class BankAccountRImp implements BankAccountR {
	
	private void BankAccRepositoryImpl() {
		BankAccount ba=new BankAccount();
		ba.setAccountHolderName("vinith");
		ba.setAccountId(101);
		ba.setAccountType("savings");
		ba.setAccountBalance((long)20345.5);
	}

}
