package com.dummydata;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.account.Account;
import com.account.AccountTransaction;

public class DummyDataGenerator {

	public static Account getDummyDataGenerator() {
		Account data = new Account();
		data.setAccountCode((new Random(System.currentTimeMillis()).nextInt(100000) + "PS").toString());
		data.setAccountName("Exalt_" + System.currentTimeMillis());

		AccountTransaction accountTransaction1 = new AccountTransaction("BUY", new Random(System.currentTimeMillis()).nextInt(100));
		AccountTransaction accountTransaction2 = new AccountTransaction("SEL", new Random(System.currentTimeMillis()).nextInt(100));
		
		List<AccountTransaction> listOfAccountTransaction = new ArrayList<AccountTransaction>();
		listOfAccountTransaction.add(accountTransaction1);
		listOfAccountTransaction.add(accountTransaction2);
		data.setAccountTransactions(listOfAccountTransaction);
		return data;
	}
}
