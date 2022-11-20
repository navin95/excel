package failedtestcases.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void tc1() {
		System.out.println("Tc1..");
	}
	@Test
	public void tc2() {
		System.out.println("Tc2..");
	}
	@Test
	public void tc3() {
		Assert.assertTrue(false);
		System.out.println("Tc3..");
	}

}
