package Addainwebsite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojofinal extends BaseclassKey {
	public pojofinal() {
		PageFactory.initElements(driver, this);
	}@FindBy(xpath="//input[@name='first_name']")
	private WebElement FirstName;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement LastName;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement Address;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement ccno;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cctype;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expiryemonth;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expiryyear;
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvnumber;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement click;
	public WebElement getClick() {
		return click;
	}
	public void setClick(WebElement click) {
		this.click = click;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCcno() {
		return ccno;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpiryemonth() {
		return expiryemonth;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	
	
	
	
	
	
	
	
	
}
