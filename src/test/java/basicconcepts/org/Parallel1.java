package basicconcepts.org;

import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	public void tc1() {
		System.out.println("Tc1..."+"Thread ID:--->>"+Thread.currentThread().getId());
	}
	@Test
	public void tc2() {
		System.out.println("Tc2..."+"Thread ID:--->>"+Thread.currentThread().getId());
	}
	@Test
	public void tc3() {
		System.out.println("Tc3..."+"Thread ID:--->>"+Thread.currentThread().getId());
	}

}
