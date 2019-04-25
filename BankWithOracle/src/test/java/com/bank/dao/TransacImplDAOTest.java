package com.bank.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bank.beans.MoneyTransfer;
import com.bank.beans.Signing;

class TransacImplDAOTest {

	@Test
	void testWithdraw() throws Exception {
		TransacImplDAO trans=new TransacImplDAO();
		MoneyTransfer transfer=new MoneyTransfer();
		Signing cust=new Signing();
		cust.setBalance(100);
		cust.setAccountNo(1111100001);
		int cust1=trans.withdraw(200,1111100001);
		assertEquals(9100,trans.withdraw(100, 1111100001));
	}

	private void AssertEquals(int i, int withdraw) {
		
	}
	@Test
	void testDeposit() throws Exception {
		TransacImplDAO trans=new TransacImplDAO();
		MoneyTransfer transfer=new MoneyTransfer();
		Signing cust=new Signing();
		cust.setBalance(100);
		cust.setAccountNo(1111100001);
		int cust1=trans.deposit(100,1111100001);
		
		assertEquals(2900,trans.deposit(100, 1111100001));
		
	}

	@Test
	void testFundTransfer() throws Exception {
		TransacImplDAO trans=new TransacImplDAO();
		MoneyTransfer transfer=new MoneyTransfer();
		Signing cust=new Signing();
		
		int cust2=trans.fundTransfer( 1111100002, 1111100001, 100);
		AssertEquals(0,trans.fundTransfer( 1111100001, 1111100003, 200));
		
	}

}
