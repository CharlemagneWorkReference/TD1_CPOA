package test;

import static org.junit.Assert.*;

import org.junit.Assert;

import tp1.DeviseException;
import tp1.Money;

public class Test {
	
	@org.junit.Test()
	public void testAdd(){
		Money m1 = new Money(10,"EUR");
		Money m2 = new Money(5,"EUR");
		Money m3 = null;
		try {
			m3 = m1.add(m2);
		} catch (DeviseException e) {
			e.printStackTrace();
		}
		assertEquals("Devrait être égal à 15",m3.getMontant(),15);
	}
	
	@org.junit.Test
	public void testEquals(){
		Money m1 = new Money(10,"EUR");
		Money m2 = new Money(10,"EUR");
		assertTrue("Devrait être vrai",m1.equals(m2));
	}
	
	@org.junit.Test
	public void testEqualsFalse(){
		Money m1 = new Money(10,"EUR");
		Money m2 = new Money(10,"USD");
		assertFalse("Devrait être faux",m1.equals(m2));
	}
	
	@org.junit.Test(expected=DeviseException.class)
	public void testException() throws DeviseException{
		Money m1 = new Money(10,"EUR");
		Money m2 = new Money(10,"USD");
		m1.add(m2);		
	}
}
