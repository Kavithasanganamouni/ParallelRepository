package com.bank.service;

import com.bank.dao.RegistrationDaoImpl;
import com.bank.model.Account;

public class RegistrationServiceImpl implements RegistrationService {
	
		static RegistrationDaoImpl dao=new RegistrationDaoImpl(); 
		static Account account=new Account(); 
		
		public Account Login(long accountNo, int password) {
			account= dao.Login(accountNo,password);
			return account;
		}

		public long registration(Account account) {
			long accNo=dao.registration(account);
			return accNo;
		}
		public boolean validate(long aadharNo) {
			boolean bl=dao.validate(aadharNo);
			return bl;
		}

		
	}


