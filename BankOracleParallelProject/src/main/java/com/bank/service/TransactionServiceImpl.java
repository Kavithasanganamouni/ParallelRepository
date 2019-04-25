package com.bank.service;

import com.bank.dao.TransactionDaoImpl;

public class TransactionServiceImpl implements TransactionService{
	
		static TransactionDaoImpl transdao=new TransactionDaoImpl();
		
		
		public int withdraw(long accountNo, int amount,int amt) {
			int m=transdao.withdraw(accountNo,amount,amt);
			return m;
		}

		public int deposit(long accountNo, int amount,int amt) {
			int n=transdao.deposit(accountNo,amount,amt);
			return n;
		}

		public int fundTransfer(long fromAccountNo, int amount, long toAccountNo,int amt) {
			int k=transdao.fundTransfer(fromAccountNo,amount,toAccountNo,amt);
			return k;
		}

		public boolean validateAadhar(long aadharNo) {
			long n=aadharNo;
			
			if(Long.toString(n).length()==12)
				
				return true;	
			
			
		else
			return false;
		}

	}



