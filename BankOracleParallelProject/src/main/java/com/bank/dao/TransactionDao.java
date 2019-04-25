package com.bank.dao;

public interface TransactionDao {
	
		public int withdraw(long accountNo, int amount,int amt);
		public int deposit(long accountNo, int amount,int amt);
		public int fundTransfer(long fromAccountNo,int amount,long toAccountNo,int amt);
	}



