package basicconcepts.org;

import org.testng.annotations.Test;

public class Parallel3 {
	@Test
	public void tc1000() {
		System.out.println("Tc1000..."+"Thread ID:--->>"+Thread.currentThread().getId());
	}
	@Test
	public void tc2000() {
		System.out.println("Tc2000..."+"Thread ID:--->>"+Thread.currentThread().getId());
	}
	@Test
	public void tc3000() {
		System.out.println("Tc3000..."+"Thread ID:--->>"+Thread.currentThread().getId());
	}

}
