package com.Amazon.Step_definitions;

import static org.junit.Assert.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Amazon.pages.AmazonHomePage;
import com.Amazon.pages.BagPage;
import com.google.common.base.Verify;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BagStepDefin {
	
	 WebDriver driver;
    private AmazonHomePage homePage=new AmazonHomePage(driver);


	@Given("^User is on amazon home page$")
	public void user_is_on_amazon_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/Murodil Ruzimatov/Documents/Librares/drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	}

	@When("^User search for \"([^\"]*)\" and click search button$")
	public void user_search_for_and_click_search_button(String arg1) throws Throwable {
	   // AmazonHomePage homePage=new AmazonHomePage(driver);
	    homePage.searchBox.sendKeys("Bag"+Keys.ENTER);
	}

	@When("^User	takes note of the price of the top result$")
	public void user_takes_note_of_the_price_of_the_top_result() throws Throwable {
		BagPage bagPage=new BagPage(driver);
		String price1=bagPage.topPrice.getText();
		//System.out.println("topPrice result: "+bagPage.topPrice.getText());
	}

	@When("^User	clicks on the top result$")
	public void user_clicks_on_the_top_result() throws Throwable {
		  BagPage bagPage=new BagPage(driver);
		  bagPage.topResult.click();
	}

	@Then("^User verifies default number of items is (\\d+)$")
	public void user_verifies_default_number_of_items_is(int arg1) throws Throwable {
		  BagPage bagPage=new BagPage(driver);
		  Select select=new Select(bagPage.numberOfItem);
		 // String expectedQ="1";
		  String actualQ=select.getFirstSelectedOption().getText().trim();
		  System.out.println("act "+actualQ+"numb");
		  //String expected="2";
		  assertEquals("1", actualQ);
	    }
	
	@Then("^User	verifies that price is the same as the one from step (\\d+)$")
	public void user_verifies_that_price_is_the_same_as_the_one_from_step(int arg1) throws Throwable {
		  BagPage bagPage=new BagPage(driver);
		  String price2=bagPage.bagPagePrice.getText();
			String price1=bagPage.topPrice.getText();
		  assertEquals(price1, price2);
	}

	@Then("^User	verifies message \"([^\"]*)\" is visible$")
	public void user_verifies_message_is_visible(String arg1) throws Throwable {
		  BagPage bagPage=new BagPage(driver);
		  bagPage.add.click();
		  assertTrue(bagPage.addedToCard.isDisplayed());
	    
	}



}
