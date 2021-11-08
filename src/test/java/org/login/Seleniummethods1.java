package org.login;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniummethods1 {
    WebDriver driver;
     public void browserlanuch(String url) {
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		driver.get(url);

	}
     
	public WebElement	locator(String locatorType,String value) {
    	   
    		  WebElement findElement = driver.findElement(By.id(value));
    	  
		return findElement;}
      public WebElement locators(String locatorsType,String value){
    	  WebElement findElement = driver.findElement(By.name(value));
    	  return findElement;}
    	  
    public WebElement locators1 (String locatorsType,String value){
		WebElement findElement = driver.findElement(By.xpath(value));
		return findElement;
	}  public String getCurrent() {
		String currentUrl = driver.getCurrentUrl();
		 return currentUrl;	
   } 
  
    public void maximize() {
	driver.manage().window().maximize();}		
	public void closebrowser() {
	driver.close();}
    public void closeallBrowser() {
	 driver.quit();}
     public void actionbymove(WebElement element) {
    	 Actions a=new  Actions(driver);
 		a.moveToElement(element).perform();

	}public void actionbycontextclick(WebElement element) {
	
		Actions a=new  Actions(driver);
		a.contextClick(element).perform();

	}public void actionbydoubleclick(WebElement element ) {
		Actions a=new  Actions(driver);
		a.doubleClick(element).perform();
}public void bydraganddrop(WebElement element) {
	Actions a=new  Actions(driver);
	a.dragAndDrop(element, element);}
public void byaccept() {
	Alert a=driver.switchTo().alert();
	a.accept();}
public void bydismiss() {
	Alert a=driver.switchTo().alert();
	a.dismiss();

}public void bysendkeys(String data) {
	Alert a=driver.switchTo().alert();
	a.sendKeys(data);

}public void getScreenshort(String path) throws IOException {
	TakesScreenshot ts= (TakesScreenshot)driver;
	File screenshotAs=ts.getScreenshotAs(OutputType.FILE);
	File f =new File(path);
	FileUtils.copyFile(screenshotAs, f);

}public void selectByindex(WebElement element,int a) {
	Select s = new Select(element);
	s.selectByIndex(a);
}public void selectbyvalue(WebElement element,String  data) {
	Select s = new Select(element);
	s.selectByValue(data);;
}public void selectbyvisible(WebElement element,String data) {
	Select s = new Select(element);
	s.selectByVisibleText(data);;
}public void deselectByindex(WebElement element,int a) {
	Select s = new Select(element);
	s.deselectByIndex(a);;
}	public void deselectbyvalue(WebElement element,String data) {
	Select s = new Select(element);
	s.deselectByValue(data);;
}public void deselectall(WebElement element,String data) {
	Select s = new Select(element);
	s.deselectAll();;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void enterText(WebElement element,String text) {
    	  element.sendKeys(text);}
      
	

		
    	  
    	  
    	  
	

















}