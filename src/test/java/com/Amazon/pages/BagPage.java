package com.Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagPage {
	
	WebDriver driver;
	
	public BagPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[text()='$59.66']")
	public WebElement topPrice;
	
	@FindBy(css=".s-access-image.cfMarker")
	public WebElement topResult;
	
	@FindBy (id="quantity")
	public WebElement numberOfItem;
	
	@FindBy(css="#priceblock_ourprice")
	public WebElement bagPagePrice;
	
	@FindBy(id="add-to-cart-button")
	public WebElement add;
	
	@FindBy(id="huc-v2-order-row-confirm-text")
	public WebElement addedToCard;
}
