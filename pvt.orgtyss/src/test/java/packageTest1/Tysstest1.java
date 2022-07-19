package packageTest1;

import org.testng.annotations.Test;


public class Tysstest1 {
	@Test
	public void TestMavenTest() {
		//get url
		String url = System.getProperty("URL");//enter url
		
		String browser = System.getProperty("BROWER");
		String username = System.getProperty("USERNAME");
		String password = System.getProperty("PASSWORD");
		System.out.println("URL"+url);
		System.out.println("BROWSER"+browser);
		System.out.println("USERNAME"+username);
		System.out.println("PSSWORD"+password);

	}

}
