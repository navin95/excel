package basicconcepts.org;

import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	public void tc100() {
		System.out.println("Tc100..."+"Thread ID:--->>"+Thread.currentThread().getId());
	}
	@Test
	public void tc200() {
		System.out.println("Tc200..."+"Thread ID:--->>"+Thread.currentThread().getId());
	}
	@Test
	public void tc300() {
		System.out.println("Tc300.."+"Thread ID:--->>"+Thread.currentThread().getId());
	}


}
