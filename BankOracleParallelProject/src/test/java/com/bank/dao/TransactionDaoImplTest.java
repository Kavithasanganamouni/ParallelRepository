package com.bank.dao;


import org.junit.Assert;

import org.junit.jupiter.api.Test;

import com.bank.model.Account;

class TransactionDaoImplTest {
	
	
	static TransactionDaoImpl transdao=new TransactionDaoImpl();
	static Account account=new Account();
	@Test
	void testWithdraw() {
		//fail("Not yet implemented");
		
		 Assert.assertEquals(0,transdao.withdraw(1001, 1000,14000));
	 

	}

	
	  @Test void testDeposit() {
	   Assert.assertEquals(1,transdao.deposit(1000,1000,9600)); }
	 
	
@Test
public void testFundtransfer()
{
	Assert.assertEquals(1,transdao.fundTransfer(1000,10000,1001,400));
}
}
