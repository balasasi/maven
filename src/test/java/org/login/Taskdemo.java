package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taskdemo {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
WebElement findElement = driver.findElement(By.xpath("//input[@ng-model ='FirstName']"));
findElement.sendKeys("N.bala");
WebElement findElement1 = driver.findElement(By.xpath("//input[@ng-model ='LastName']"));
findElement1.sendKeys("Murugan");
WebElement findElement2 = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
findElement2.sendKeys("Tiruvannamalai");
WebElement findElement3 = driver.findElement(By.xpath("//input[@ng-model ='Phone']"));
findElement3.sendKeys("908011239");
WebElement btnclick1 = driver.findElement(By.xpath("//input[@ng-model ='radiovalue']"));
btnclick1.click();
WebElement btnclick2 = driver.findElement(By.xpath("//input[@id ='checkbox1']"));
btnclick2.click();
WebElement email= driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
email.sendKeys("bala@26292@gmail.com");
WebElement languageselect = driver.findElement(By.id("msdd"));
languageselect.click();
WebElement languageselect1 = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
languageselect1.click();
WebElement outClick = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
outClick.click();
WebElement findElement12 = driver.findElement(By.xpath("//select[@id='Skills']"));
Select s= new Select(findElement12);
s.selectByIndex(7);//Autocad option
WebElement scountry = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
scountry.click();
WebElement scountry1 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
scountry1.click();
WebElement scountry2 = driver.findElement(By.xpath("//li[@class='select2-results__option'][5]"));
scountry2.click();
WebElement btnyear = driver.findElement(By.xpath("//select[@ng-model='yearbox']"));
btnyear.sendKeys("2000");
WebElement btnmonth = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
btnmonth.sendKeys("October");
WebElement btnday = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
btnday.sendKeys("1");
WebElement pass = driver.findElement(By.xpath("//input[@ng-model='Password']"));
pass.sendKeys("bala@2000");
WebElement cpass= driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
cpass.sendKeys("bala@2000");
}

}
