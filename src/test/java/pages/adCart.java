package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utility.Lib;

public class adCart extends Lib {
	
	public static void prtTitle(WebDriver driver) {
		System.out.println("MacBook selected :::"+prtPageTitle(driver));

}
	
	public static void aadCaart(WebDriver driver) throws IOException, InterruptedException {
		findEle(driver, redProp("protPlan")).click();
		takeScShots(driver, "aCart");
		Thread.sleep(3000);
		findEle(driver, redProp("addTcart")).click();
	}
}
