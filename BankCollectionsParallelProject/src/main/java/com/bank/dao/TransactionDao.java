package com.bank.dao;

import com.bank.model.Account;

public interface TransactionDao {
	
		public int withdraw(Account account,int amt);
		public int deposit(Account account,int amt);
//		public int fundTransfer(Account account,int amount,long toAccountNo,int amt);
	}



