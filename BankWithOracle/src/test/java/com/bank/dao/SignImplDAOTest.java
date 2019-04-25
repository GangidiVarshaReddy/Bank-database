package com.bank.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bank.beans.Signing;

class SignImplDAOTest {
	SignImplDAO dao = new SignImplDAO();
	Signing cust = new Signing();
	
	@Test
	void testRegistration() throws Exception  {
	
	cust.setFirstName("varsha");
	cust.setLastName("reddy");
	cust.setEmailId("varsha123@gmail.com");
	cust.setPassword("varsha123");
	cust.setAadharNo(987654321);
	cust.setPanCard(987637654);
	cust.setMobileNo(957345241);
	cust.setBalance(1000);
	
		Signing cust1=dao.registration(cust);
	
	 long i=cust1.getAadharNo();
	 assertEquals(i,987654321);
	
	}

	@Test
	
	  void testLogin() throws Exception {
		SignImplDAO dao = new SignImplDAO();
		/*
		 * Signing cust = new Signing(); cust.setAccountNo(1111100001);
		 * cust.setPassword("varsha123"); Signing cust1=dao.login(1111100001,
		 * "varsha123"); //long i=cust1.getBalance(); //assertEquals(i,1000); long
		 * i=cust1.getAadharNo(); assertEquals(i,987654321);
		 */
		
		//cust=dao.login(1111100001, "varsha07");
		//assertEquals(1111100001,cust.getAccountNo());
		
		assertEquals(null,dao.login(1111100001,"varsha07"));
		
   }

	

}
