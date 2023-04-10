package org.Pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPojo extends BaseClass{
	
	//Non parameterized constructor
	public FbloginPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Private WebElements
	//WebElement email = driver.findElement(By.id("email"));
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginBtn;
	
	//Getters to access WebElements outside the class

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	

}
