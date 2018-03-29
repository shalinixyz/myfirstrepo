package org.proj.BankApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultipleofhundredTest {
	Bank_details b=new Bank_details();
	@Test
	public void test()
	{
		assertTrue(b.ismultiplesofHundred(500));
	}
	 
}
