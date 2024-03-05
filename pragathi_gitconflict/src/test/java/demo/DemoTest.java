package demo;

import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void oneTest() {
		System.out.println("oneTest--Executing");
	}
	@Test
	public void twoTest() {
		System.out.println("two--executing");
	}
	@Test
	public void threeTest() {
		System.err.println("three--executing");
	}
}
