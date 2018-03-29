package org.proj.BankApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositTest {

	
	Bank_details b=new Bank_details();
	@Test
	public void depostTest() 
	{
		assertEquals(1000,b.deposit(500,500));
	}
	
}
