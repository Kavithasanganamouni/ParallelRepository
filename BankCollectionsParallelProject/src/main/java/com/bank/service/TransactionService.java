package com.bank.service;

import com.bank.model.Account;

public interface TransactionService {
	
		public int withdraw(Account account,int amt);
		public int deposit(Account account,int amt);
		//public int fundTransfer(Account account,int amount,long toAccountNo,int amt);
		public boolean validateAadhar(long aadharNo);
	}


