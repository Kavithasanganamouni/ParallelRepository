package com.bank.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bank.model.Account;

import junit.framework.Assert;

class RegistrationDaoImplTest {
	 
	static RegistrationDaoImpl dao;
static 	Account account;

@BeforeAll  
public static void init()
{
	dao=new RegistrationDaoImpl();
	 account=new Account();
}
	@Test
	void testRegistration() {
		//fail("Not yet implemented");
		
		account.setFirstName("ram");
		account.setLastName("mudhiraj");
		account.setAadharNo(104009315635L);
		account.setAddress("hyderabad");
		account.setBalance(0);
		account.setEmailId("ram@gmail.com");
		account.setMobileNo(7512345678L);
		account.setPancardNo(123456);
		account.setPassword(123235);
		
		Assert.assertEquals(53,dao.registration(account));
	}

	@Test
void testLogin() {
		assertEquals(10700,dao.Login(1000,12345).getBalance());
	}

	@Test
	void testValidate() {
		long adhar=9877;
		assertEquals(false, dao.validate(adhar));
	}

}













