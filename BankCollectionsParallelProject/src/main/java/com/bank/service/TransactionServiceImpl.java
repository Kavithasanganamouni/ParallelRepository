package com.bank.service;

import com.bank.dao.TransactionDao;
import com.bank.dao.TransactionDaoImpl;
import com.bank.model.Account;

public class TransactionServiceImpl implements TransactionService{
	
	

		static TransactionDao transdao=new TransactionDaoImpl();
		
		
		public int withdraw(Account account,int amt) {
			int m=transdao.withdraw(account,amt);
			return m;
		}

		public int deposit(Account account,int amt) {
			int n=transdao.deposit(account,amt);
			return n;
		}


		public boolean validateAadhar(long aadharNo) {
			long n=aadharNo;
			
			if(Long.toString(n).length()==12)
				
				return true;	
			
			
		else
			return false;
		}

	}



