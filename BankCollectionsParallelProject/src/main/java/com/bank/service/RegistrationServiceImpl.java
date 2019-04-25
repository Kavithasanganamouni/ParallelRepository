package com.bank.service;

import java.util.Random;

import com.bank.dao.RegistrationDao;
import com.bank.dao.RegistrationDaoImpl;
import com.bank.model.Account;

public class RegistrationServiceImpl implements RegistrationService {
	
		static RegistrationDao dao=new RegistrationDaoImpl(); 
		static Account account=new Account(); 
		
		public Account login(long accountNo, String pwd) {
			account= dao.login(accountNo,pwd);
			return account;
		}

		public long registration(Account account) {
			Random r=new Random();
			long accountNo= Math.abs(r.nextLong());
			account.setAccountNo(accountNo);
			long accNo=dao.registration(account);
			return accNo;
		}
		public boolean validate(long aadharNo) {
			boolean bl=dao.validate(aadharNo);
			return bl;
		}
		public int fundTransfer(Account account,int amount,long toAccountNo,int amt) {
			int k=dao.fundTransfer(account,amount,toAccountNo,amt);
			return k;
		}
	}

	

	
		