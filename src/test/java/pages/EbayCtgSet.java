package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.Lib;

public class EbayCtgSet extends Lib {
	
	public static void prtTitle(WebDriver driver) {
		
		System.out.println("This is Catagory selected ::::"+prtPageTitle(driver));
	}
	
	public static void spCatagory(WebDriver driver) throws InterruptedException, IOException {
		findEle(driver, redProp("seltMacbook")).click();
		Thread.sleep(1000);
}
}
