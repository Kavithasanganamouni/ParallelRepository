package com.bank.service;

import com.bank.model.Account;

public interface RegistrationService {


		public Account Login(long accountNo,int password);
		public long registration(Account account);
		public boolean validate(long aadharNo);
	}



