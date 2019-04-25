package com.bank.dao;

import com.bank.model.Account;

public interface RegistrationDao {
	
	
		public Account login(long accountNo,String password);
		public long registration(Account account);
		public int fundTransfer(Account account,int amount,long toAccountNo,int amt);
		public boolean validate(long aadharNo);
	}



