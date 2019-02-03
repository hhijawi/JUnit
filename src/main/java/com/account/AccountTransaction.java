package com.account;

public class AccountTransaction {
	
	// BUY or SELL
	private String transactionType;
	// max value 100
	private int amount;
	
	public AccountTransaction(String transactionType, int amount) {
		this.setAmount(amount);
		this.setTransactionType(transactionType);
	}
	
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
