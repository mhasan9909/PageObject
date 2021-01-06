package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.Lib;

public class EbayHome extends Lib {
	
	public static void prtTitle(WebDriver driver) {
		
		System.out.println("This is Home Page Title ::::"+prtPageTitle(driver));
	}
	
	public static void spCatagory(WebDriver driver) throws InterruptedException, IOException {
		findEle(driver, redProp("clikCatagory")).click();
		Thread.sleep(1000);
		
		findEle(driver, redProp("selCatagory")).click();
		Thread.sleep(5000);
	}
	
	

}
