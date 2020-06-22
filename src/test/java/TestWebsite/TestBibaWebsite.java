package TestWebsite;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.utility.BibaWebsite;
public class TestBibaWebsite {

		BibaWebsite f = new BibaWebsite();
	

	@BeforeSuite
	public void testOpenBrowser() throws Exception {
		
		f.reportGenerate();
		f.openBrowser();
		
	}
	
	@AfterSuite
	public void testCloseBrowser() throws InterruptedException {
		f.closeBrowser();
	}
	
	@AfterMethod
	public void Screenshot(ITestResult result) throws IOException {
	f.captureScreenshot(result);
	}
	
	@Test(priority = 0 , description = "TC001--signin--This Testcase Verifies that User is able to Login with  Valid Credentials which are taken from excel sheet")
	public void testSignInPage() throws Exception{
		Thread.sleep(2000);
		f.signInPage();
		//Thread.sleep(3000);
	}
	
	@Test(priority = 1 , description = "TC002--searchItem--This Testcase Verifies User is able to search the particular item which is taken from Excel sheet. ")
	public void testSearchItem() throws Exception {
		
		f.searchItem();
	}
	
	@Test(priority = 2 , description = "TC003--addToCart--This Testcase Verifies User is able to add the searched item to Cart" )
	public void testAddToCart() throws Exception{
		
		f.addToCart();
	}
	
	@Test(priority = 3 , description = "TC004--logout--This Testcase Verifies User is able to logout from website")
	public void testLogOut() throws Exception{
		
		f.logout();
	}
	





}
