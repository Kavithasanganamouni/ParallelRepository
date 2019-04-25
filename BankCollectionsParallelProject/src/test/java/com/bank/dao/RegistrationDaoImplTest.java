package com.bank.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bank.model.Account;

class RegistrationDaoImplTest {
	static RegistrationDaoImpl dao=new RegistrationDaoImpl();
	
	
	@Test
	void testRegistration() {
		//fail("Not yet implemented");


Account account=new Account();
account.setAccountNo(123456790);
account.setFirstName("kavitha");
account.setLastName("sanganamouni");
account.setAadharNo(123456789012L);
account.setAddress("hyderabad");
account.setBalance(100);
account.setEmailId("kavitha@.com");
account.setMobileNo(7285999009L);
account.setPancardNo("12345");
account.setPassword("kavitha");
//	customerDetails=null;
Assert.assertEquals(123456790,dao.registration(account));
	}

	@Test
	void testLogin() {
	
		Account account=new Account();
		assertEquals(null,dao.login(31,"123235"));
	}

	@Test
	void testValidate() {
		assertEquals(false, dao.validate(12356788L));
	}
	 @Test
	 void testFundTransfer() {
		 Account account=new Account();
	 assertEquals(0, dao.fundTransfer(account, 300, 10000060, 100));
	 }


}
