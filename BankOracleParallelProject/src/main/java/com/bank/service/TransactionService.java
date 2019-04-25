package com.bank.service;

public interface TransactionService {

		public int withdraw(long accountNo, int amount,int amt);
		public int deposit(long accountNo, int amount,int amt);
		public int fundTransfer(long fromAccountNo,int amount,long toAccountNo,int amt);
		public boolean validateAadhar(long aadharNo);
	}



