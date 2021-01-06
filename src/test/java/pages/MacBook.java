package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utility.Lib;

public class MacBook extends Lib {
	
	public static void prtTitle(WebDriver driver) {
		System.out.println("MacBook select page TiTTle :::"+prtPageTitle(driver));
	}
		
	public static void setMacBook(WebDriver driver) throws IOException, InterruptedException {
		findEle(driver, redProp("mcBook")).click();
		
		Thread.sleep(3000);
		
	}
	
	

}
