package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassreturn {
  WebDriver driver; //inst varabile declared
	private void google(String url) {
		WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          driver.get(url);}
	
	public  WebElement webLocators(String  locatorstype,String value) {
		if(locatorstype.equals("id")) {
		WebElement findElement = driver.findElement(By.id(value));
		return findElement;}
		else if (locatorstype .equals("name")) {
	//public  WebElement webLocators1(String  locatorstype,String value) {
		WebElement findElement = driver.findElement(By.name(value));
		return findElement;}
		else{
	//public  WebElement click(String  locatorstype,String value) {
		WebElement findElement = driver.findElement(By.name(value));
		return findElement;}}
	public void entertext(WebElement element,String text ) {
		element.sendKeys(text);

	}
	public void buttonclick(WebElement element) {
		element.click();

	}
	
	public static void main(String[] arg) {
		
	Baseclassreturn name = new Baseclassreturn();
	name.google("https://www.facebook.com/");
	
	WebElement webLocators = name.webLocators("id", "email");
	name.entertext(webLocators, "balla");
	WebElement webLocators1 = name.webLocators("name", "pass");
	name.entertext(webLocators1,"drfgerfv");
	WebElement click = name.webLocators("name", "login");
	name.buttonclick(click);
	
	}

	



	
	
}
