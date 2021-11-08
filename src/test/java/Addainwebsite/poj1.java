package Addainwebsite;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class poj1 extends BaseclassKey{
	public static void main(String[] args) throws IOException, InterruptedException {
		browserLanuch("http://adactinhotelapp.com/");
		PojoClass y	=new PojoClass();
		
		WebElement username = y.getUsername();
		String txrUserName = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 0);
		entertext(username,txrUserName);
		
	    WebElement password = y.getPassword();
	    String txtpassword = y.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 1);
	    entertext(password, txtpassword);
	    
	    WebElement btnClick = y.getLogin();
	    click(btnClick);
	    
	    Pojoselect p=new Pojoselect();
	    WebElement location = p.getLocation();
	    String select = p.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 2);
	    int parseInt = Integer.parseInt(select);
	    selectby(location, parseInt);
	    
	    WebElement hotels = p.getHotels();
	    String excelRead = p.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 3);
	    int parseInt2 = Integer.parseInt(excelRead);
	    selectby(hotels, parseInt2);
	    
	    WebElement locationrm = p.getRoomType();
		String  icrt1 = p.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 4);
		int parseInt33 = Integer.parseInt(icrt1);
		selectby(locationrm, parseInt33);
		
		WebElement locationrm1 = p.getNoofrooms();
		String  icrt11 = p.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 5);
		int parseInt21 = Integer.parseInt(icrt11);
		selectby(locationrm1, parseInt21);
		
		WebElement datecheck = p.getCheckindate();
		datecheck.clear();
		Thread.sleep(3000);
		String username1 = p.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 7);
		entertext(datecheck, username1);
		
		WebElement datecheckout = p.getCheckoutdate();
		datecheckout.clear();
		Thread.sleep(4000);
		String username2 = p.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 8);
		entertext(datecheckout, username2);
	    Thread.sleep(4000);	
		WebElement locationapr = p.getApr();
		String  icapr1 = p.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 6);
		int parseInt3 = Integer.parseInt(icapr1);
		selectby(locationapr, parseInt3);
		
		WebElement locationcr = p.getCpr();
		String  iccr1 = p.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 6);
		int parseInt4 = Integer.parseInt(iccr1);
		selectby(locationcr, parseInt4);	
	
	
		WebElement search = p.getSubmit();
		click(search);
		WebElement radio = p.getRadio();
		click(radio);
		WebElement clickcontinue = p.getSearch();
		click(clickcontinue);
		pojofinal f=new pojofinal();
		
		WebElement txtfirst = f.getFirstName();
		String first = f.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 9);
		entertext(txtfirst, first);
		
		WebElement txtlast = f.getLastName();
		String last = f.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 10);
		entertext(txtlast, last);
		
		WebElement txtaddres = f.getAddress();
		String address = f.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 11);
		entertext(txtaddres, address);
		
		WebElement txtcredit = f.getCcno();
		String credit = f.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 12);
		entertext(txtcredit, credit);
		
		WebElement locationcc = f.getCctype();
		String  icccc = f.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 13);
		int parseIntc = Integer.parseInt(icccc);
		selectby(locationcc, parseIntc);
		
		WebElement locationcc1 =f.getExpiryemonth();
		String  icccc1 = f.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 14);
		int parseIntc1 = Integer.parseInt(icccc1);
		selectby(locationcc1, parseIntc1);
		
		WebElement locationcc2 = f.getExpiryyear();
		String  icccc2 = f.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 15);
		int parseIntc2= Integer.parseInt(icccc2);
		selectby(locationcc2, parseIntc2);
		
		WebElement txtusername222 = f.getCvvnumber();
		String username222 = f.excelRead("E:\\my documents\\abcd1.xlsx", "Sheet1", 0, 16);
		entertext(txtusername222, username222);
		WebElement clickcontinue1 =f.getClick();
		click(clickcontinue1);
		
	
	
	
	
	
	
	
	}
	
	
	
	
}
