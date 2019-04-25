package com.bank.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bank.model.Account;

class TransactionDaoImplTest {
	static TransactionDaoImpl transdao=new TransactionDaoImpl();

	@Test
	void testWithdraw() {
		Account account=new Account();
		 assertEquals(0, transdao.withdraw(account, 500));

	}

	@Test
	void testDeposit() {
		//fail("Not yet implemented");
		Account account=new Account();
		 assertEquals(1, transdao.deposit(account, 100));

	}

}
