package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.Calculators;



public class Steps {
	 
	public WebDriver driver;
	Calculators cals;
	
	@When("^enter the url \"([^\"]*)\"$")
	public void open_the_browser(String url) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D://CumrSelm//CucrSelm//Drivers//chromedriver.exe");//D:\CumrSelm\CucrSelm\Drivers
	    driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("^click on menu item$")
	public void click_on_menu_item() throws Throwable {
		//cals = new Calculators(driver);
		Thread.sleep(3000);
		cals.clickOnCustomermenu();
		

	}

	@When("^click on how much i borrow link$")
	public void click_on_how_much_i_borrow_link() throws Throwable {
		Thread.sleep(3000);
		cals.clickOnCustomermenu_item();
		
		
		
	
	}

	@When("^enter all the details$")
	public void enter_all_the_details() throws Throwable {
		cals.account_type();
		cals.dropdown_noOfDependents("0");
		cals.property_buy();
		cals.setAnvlIncome("80000");
		cals.setAnvlOtherIncome("10000");
		cals.setMonthlyLivingExpense("500");
		cals.setCurrentHomeLoan("0");
		cals.setOtherLoanRepay("100");
		cals.setOtherCommitments("0");
		
		
	    
	}

	@Then("^click on the how much i borrow button$")
	public void click_on_the_how_much_i_borrow_button() throws Throwable {
		
		cals.setClickOnSUbmitt();
	    
	}

	@And("^compare the result$")
	public void compare_the_result(String string ) throws Throwable {
			Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
					.contains("We estimate you could borrow"));
		}
	    
	
	@And("^close browser$")
	public void close_browser() {
	driver.quit();
}

	// scinario 2 : reset start over button to clear the form
	
	
	@Then("^User clickon start over button$")
	public void user_clickon_start_over_button() throws Throwable {
	    Thread.sleep(3000);
	    cals.setStartOver();
	}
	
	
	// scinario 3 : enter only 1 value and verify the result
	
	@When("^enter only the living expense field$")
	public void enter_only_the_living_expense_field() throws Throwable {
		cals.setMonthlyLivingExpense("1");
		cals.setClickOnSUbmitt();
	   
	}
	
	@Then("^Then User can view error  message \"([^\"]*)\"$")
	public void then_User_can_view_error_message(String arg1) throws Throwable {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500"));
	}
	    
	}

	  
	


	


