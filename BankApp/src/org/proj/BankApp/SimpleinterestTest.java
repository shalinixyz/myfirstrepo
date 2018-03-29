package org.proj.BankApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleinterestTest {
	Bank_details b=new Bank_details();
	@Test
	public void simpleinterestTest() 
	{
		assertEquals(300,b.Simpleinterest(2000,3,5));
	}

}
