package basicconcepts.org;

import org.testng.annotations.Test;

public class Test1 {
	
	//1
	@Test(priority=-2)
	public void tc3() {
		System.out.println("tc3");
	}
	
	//5
	@Test(priority=2)
	public void tc2() {
		System.out.println("tc2");
	}
	
	//2
	@Test(priority=-1)
	public void tc8() {
		System.out.println("tc8");
		}
	
	//7
	@Test(priority=4)
	public void tc4() {
		System.out.println("tc4");
	}
	
	//3
	@Test(priority=0)
	public void tc5() {
		System.out.println("tc5");
	}
	
	//4
	@Test(priority=1)
	public void tc1() {
		System.out.println("tc1");
	}
	
	//6
	@Test(priority=3)
	public void tc7() {
		System.out.println("tc7");
	}
	
	//8
	@Test(priority=5)
	public void tc6() {
		System.out.println("tc6");

	}


}
