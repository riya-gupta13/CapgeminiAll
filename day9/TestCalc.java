package day9;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class TestCalc {
	Calc calc;
	
	@Before
	public void setUp() {
		calc = new Calc();
	}

	@Test
	public void test() {
		
		int result = calc.sum(3, 4);
		
		assertSame("3 + 4 should be 7 ", 7, result);
	}
	
	
	@Test
	public void testWithNegatieValues() {
//		Calc calc = new Calc();
		int result = calc.sum(-3, -4);
		
		assertSame("-3 + -4 should be -7 ", -7, result);
	}

}
