package com.bank.dao;

import com.bank.model.Account;

public interface RegistrationDao {
		public Account Login(long accountNo,int password);
		public long registration(Account account);
		
	}



