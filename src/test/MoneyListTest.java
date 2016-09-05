package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tp1.DeviseException;
import tp1.Money;
import tp1.MoneyList;

public class MoneyListTest {

	@Test
	public void testEquals() throws DeviseException {
		MoneyList ml1 = new MoneyList();
		Money m1 = new Money(10,"EUR");
		Money m2 = new Money(5,"EUR");
		ml1.ajouterSomme(m1);
		ml1.ajouterSomme(m2);
	}

}
