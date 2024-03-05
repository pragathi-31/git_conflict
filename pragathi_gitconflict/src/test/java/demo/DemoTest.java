package demo;

import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void gitConflict1() {
		System.out.println(" working");
	}
	public void gitConflict2() {
		System.out.println(" working");
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
