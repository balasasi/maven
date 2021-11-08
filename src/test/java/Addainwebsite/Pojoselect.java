package Addainwebsite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoselect extends BaseclassKey {
	public Pojoselect() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement noofrooms;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkindate;
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkoutdate;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement apr;
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement cpr;	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement submit;
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radio;
	@FindBy(xpath="//input[@name='continue']")
	private WebElement search;
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoofrooms() {
		return noofrooms;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getApr() {
		return apr;
	}
	public WebElement getCpr() {
		return cpr;
	}
	
	
	
	
	
	
	
	
}
