package org.login;

import org.openqa.selenium.WebElement;

public class Seleniummethods2 extends Seleniummethods1 {
	public static void main(String[] args) {
		 Seleniummethods2 name = new Seleniummethods2();
		name.browserlanuch("https://www.facebook.com/");
		
		WebElement webLocators = name.locators("id", "email");
		name.enterText(webLocators, "balla");
		WebElement webLocators1 = name.locators("name", "pass");
		name.enterText(webLocators1,"drfgerfv");
		String string = name.getCurrent();
		System.out.println(string);
	  	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
