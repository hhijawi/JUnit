package com.services;

import java.util.ArrayList;
import java.util.List;

import com.account.Account;
import com.account.AccountTransaction;
import com.dummydata.DummyDataGenerator;

public class AccountService {
	
	public static Account getAccountDetails(){
		return DummyDataGenerator.getDummyDataGenerator();
	}
	
	public List<Account> getListOfAccounts() {
		List<Account> listOfAccounts = new ArrayList<Account>();
		listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator());
		listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator());
		listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator());
		return listOfAccounts;
		
	}
	
	public List<AccountTransaction> getAccountTransactions(Account account){
		return DummyDataGenerator.getDummyDataGenerator().getAccountTransactions();
	}

	public static void main(String []args) {

		getAccountDetails();
	}
}
