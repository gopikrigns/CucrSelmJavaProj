package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Calculators {

	public WebDriver ldriver;
	
	
	public Calculators(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	
	By linkmenu = By.xpath("//*[@id=\"secondary\"]/div/ul/li[4]/div/a/span[1]");
	By linkmenu_menuitem = By.xpath("//*[@id=\"secondary\"]/div/ul/li[4]/ul/li[3]/a");
	By application_type = By.xpath("//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[1]/label");

	By propery = By.xpath("//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/div/div[3]/ul/li[1]/label");
	
	By annualincome = By.id("q2q1");
	By otherincome = By.id("q2q2");
	By second_applicant_annualincome = By.id("q2q3");
	By second_applicant_otherlincome = By.id("q2q4");
	
	By monthlyLivingincome = By.id("q3q1");
	By current_home_loan_montly_repayment = By.id("q3q2");
	By other_loans_montly_repayment = By.id("q3q3");
	By other_montly_commitments = By.id("q3q4");
	By total_credit_car_limitss = By.id("q3q5");
	By  clikc_on_borrow_submitt_button = By.id("btnBorrowCalculater");
	By strat_over = By.xpath("//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div/div[1]/div[1]/div[2]/div[1]/div/div[1]/div/button");
	
	
	//Action classess
	
	public void setDropdown(String value)
	{
		
		
		Select drp = new Select(ldriver.findElement(By.id("q1q2")));
		
		drp.selectByValue(value);
		
	}
	
	public void clickOnCustomermenu() throws InterruptedException
	{
		Thread.sleep(3000);
		ldriver.findElement(linkmenu).click();
	
	}
	
	public void clickOnCustomermenu_item() throws InterruptedException
	{
		Thread.sleep(3000);
		ldriver.findElement(linkmenu_menuitem).click();
	}
	
	public void account_type() throws InterruptedException
	{
		
		ldriver.findElement(application_type).click();
	}
	

	
	public void dropdown_noOfDependents(String value) throws InterruptedException
	{
		
		
		Select drp = new Select(ldriver.findElement(By.id("q1q2")));
		
		drp.selectByValue(value);
		
	}
	
	public void property_buy() throws InterruptedException
	{
		
		ldriver.findElement(propery).click();
	}
	
	public void setAnvlIncome(String anvlincome)
	{
		ldriver.findElement(annualincome).sendKeys(anvlincome);
	}
	
	public void setAnvlOtherIncome(String anvlOtherincome)
	{
		ldriver.findElement(otherincome).sendKeys(anvlOtherincome);
	}
	
	public void setMonthlyLivingExpense(String livingincome)
	{
		ldriver.findElement(monthlyLivingincome).sendKeys(livingincome);
	}
	
	
	public void setCurrentHomeLoan(String homeloan)
	{
		ldriver.findElement(current_home_loan_montly_repayment).sendKeys(homeloan);
	}
	
	public void setOtherLoanRepay(String otherloan)
	{
		ldriver.findElement(other_loans_montly_repayment).sendKeys(otherloan);
	}
	
	public void setOtherCommitments(String othercommits)
	{
		ldriver.findElement(other_montly_commitments).sendKeys(othercommits);
	}
	
	public void setTotalCreditCardLimits(String carslimits)
	{
		ldriver.findElement(total_credit_car_limitss).sendKeys(carslimits);
	}
	
	public void setClickOnSUbmitt()
	{
		ldriver.findElement(By.id("clikc_on_borrow_submitt_button")).click();;
	}

	public void setStartOver()
	{
		ldriver.findElement(strat_over).click();;
	}


	
}
	


	

