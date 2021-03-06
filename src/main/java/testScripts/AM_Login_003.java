package testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

 
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AM_Login_003 extends BaseTest {

	@Test
	public void AM_Login_003() throws InterruptedException, IOException {

		LoginPage lp = new LoginPage(driver);
		lp.login("AM_LG01");

		HomePage hp = new HomePage(driver);
		hp.searchProduct("AM_HP01");

		ProductPage pp = new ProductPage(driver);
		pp.productDiscription();
	 
	}
}
