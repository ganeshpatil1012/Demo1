package crossBrowser;

import org.testng.annotations.Test;

public class homePage {
	@Test(invocationCount=1)
	public void home() {
		System.out.println("home page");
	}

}
