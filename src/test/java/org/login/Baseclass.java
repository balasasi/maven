package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {// method 1same method different object creation to get  n times of url

	private void testId(String url) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(url);}
//inst variable
	WebDriver driver;
private void method2(String url ) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
}
private void dummymethodoffacebook(String text) {
	WebElement findElement = driver.findElement(By.id("email"));
	findElement.sendKeys(text);

}

public static void main(String[] args) {
	Baseclass name = new Baseclass();
name.testId("https://www.instagram.com/");//method1

//method 2 object create
Baseclass name2 = new Baseclass();
name2.method2("https://www.facebook.com/");
//dummy method facebook

name2.dummymethodoffacebook("bala");//wecan use same obj ref


}
}
