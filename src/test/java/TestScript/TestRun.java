package TestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.EbayCtgSet;
import pages.EbayHome;
import pages.MacBook;
import pages.adCart;

public class TestRun {
	public static WebDriver driver;

	@BeforeClass
	public static void bRun() {

		System.setProperty("webdriver.chrome.driver", "/Users/mdhasan/eclipse-workspace/POM_Project/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);

	}

	@Test
	public void test() throws InterruptedException, IOException {
		System.out.println("This is POP model with JUnit");
		EbayHome.prtTitle(driver);
		EbayHome.spCatagory(driver);

		EbayCtgSet.prtTitle(driver);
		EbayCtgSet.spCatagory(driver);

		MacBook.prtTitle(driver);
		MacBook.setMacBook(driver);

		adCart.prtTitle(driver);
		adCart.aadCaart(driver);

	}

	@AfterClass
	public static void teardown() {
		driver.manage().deleteAllCookies();
		driver.close();

	}

}
