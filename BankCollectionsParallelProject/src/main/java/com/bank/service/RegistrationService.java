package com.bank.service;

import com.bank.model.Account;

public interface RegistrationService {
	
	
		public Account login(long accountNo,String password);
		public long registration(Account account);
		public boolean validate(long aadharNo);
		public int fundTransfer(Account account,int amount,long toAccountNo,int amt);
	}

		
	



