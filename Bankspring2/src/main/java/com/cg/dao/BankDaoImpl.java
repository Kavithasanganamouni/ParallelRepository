package com.cg.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.model.CustomerDetails;

@Repository
@Component
public class BankDaoImpl implements BankDao {

	public CustomerDetails setInfo() {
		// TODO Auto-generated method stub
		CustomerDetails customer = new CustomerDetails();
		customer.setFirstName("kavitha");
		customer.setLastName("Sanganamouni");
		customer.setEmailId("kavitha@gmail.com");
		customer.setAadharNo("123409876534");
		customer.setMobileNo("9098765860");
		customer.setPancardNo(1234986);
		customer.setPassword("kavitha");
		customer.setAddress("Hyderabad");
		customer.setBalance(0);
		customer.setAccountNo(101);
		return customer;
	}

	public CustomerDetails register(@RequestBody CustomerDetails cd) {
		// TODO Auto-generated method stub
		return cd;
	}

	public int login(ArrayList<CustomerDetails> custList, CustomerDetails c) {
		// TODO Auto-generated method stub
		int accNo = 0;
		System.out.println(c.getAccountNo());
		for (CustomerDetails customerDetails : custList) {
			if(customerDetails.getAccountNo() == c.getAccountNo() && customerDetails.getPassword().equals(c.getPassword())) {
				accNo = c.getAccountNo();
			}
		}
		return accNo;
	}
}
