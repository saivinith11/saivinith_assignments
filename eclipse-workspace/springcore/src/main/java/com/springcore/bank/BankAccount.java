package com.springcore.bank;

public class BankAccount {
  private int accountId;
  private String accountHolderName;
  private String accountType;
  private long accountBalance;
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public long getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(long accountBalance) {
	this.accountBalance = accountBalance;
}
@Override
public String toString() {
	return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountType="
			+ accountType + ", accountBalance=" + accountBalance + "]";
}
public BankAccount() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
