package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.Utility;

public class Calc {
	
	WebDriver driver;
	
	public Calc(WebDriver Mdriver)
	{
		this.driver = Mdriver;
	}
	
	@FindBy(xpath = "//input[@id = 'homeval']") WebElement hVal;
	@FindBy(xpath = "//input[@id = 'downpayment']") WebElement downP;
	@FindBy(xpath = "//input[@value = 'money']") WebElement moneyB;
	@FindBy(xpath = "//input[@id = 'loanamt']") WebElement loanAmount;
	@FindBy(xpath = "//input[@id = 'intrstsrate']") WebElement iRate;
	@FindBy(xpath = "//input[@id = 'loanterm']") WebElement lTerm;
	@FindBy(xpath = "//select[@name = 'param[start_month]']") WebElement sMonth;
	@FindBy(xpath = "//input[@id = 'start_year']") WebElement sYear;
	@FindBy(xpath = "//input[@id = 'pptytax']") WebElement pTax;
	@FindBy(xpath = "//input[@id = 'pmi']") WebElement Pmi;
	@FindBy(xpath = "//input[@id = 'hoi']") WebElement homeI;
	@FindBy(xpath = "//input[@id = 'hoa']") WebElement Hoa;
	@FindBy(xpath = "//select[@name = 'param[milserve]']") WebElement loanType;
	@FindBy(xpath = "//select[@name = 'param[refiorbuy]']") WebElement bOrR;
	@FindBy(xpath = "//select[@name = 'param[credit_rating]']") WebElement cR;
	@FindBy(xpath = "//input[@value = 'Calculate']") WebElement cal;
	
	public void EnterHV(String homeV)
	{
		Utility.waitForWebelement(driver,hVal ).sendKeys(homeV);
		System.out.println("LOG: INFO- Username Entered");
	}
	
	public void EnterDP(String dPay)
	{
		Utility.waitForWebelement(driver, downP).sendKeys(dPay);
	}
	
	public void MoneyButton()
	{
		Utility.waitForWebelement(driver, moneyB).click();
	}
	
	public void EnterLoanAMT(String lAmount)
	{
		Utility.waitForWebelement(driver, loanAmount).sendKeys(lAmount);
	}
	public void EnterRate(String rate)
	{
		Utility.waitForWebelement(driver,iRate ).sendKeys(rate);
		System.out.println("LOG: INFO- Username Entered");
	}
	
	public void EnterTerm(String loanTerm)
	{
		Utility.waitForWebelement(driver, lTerm).sendKeys(loanTerm);
	}
	
	public void EnterSM(String sM)
	{
		Utility.waitForWebelement(driver,sMonth ).sendKeys(sM);
		System.out.println("LOG: INFO- Username Entered");
	}
	
	public void EnterSY(String sY)
	{
		Utility.waitForWebelement(driver, sYear).sendKeys(sY);
	}
	
	public void EnterPT(String pptyT)
	{
		Utility.waitForWebelement(driver, pTax ).sendKeys(pptyT);
		System.out.println("LOG: INFO- Username Entered");
	}
	
	public void EnterPMI(String PMI)
	{
		Utility.waitForWebelement(driver, Pmi).sendKeys(PMI);
	}
	
	public void EnterHI(String hI)
	{
		Utility.waitForWebelement(driver,homeI ).sendKeys(hI);
		System.out.println("LOG: INFO- Username Entered");
	}
	
	public void ClickHOA(String HOA)
	{
		Utility.waitForWebelement(driver, Hoa).sendKeys(HOA);
	}
	
	public void EnterLT(String lT)
	{
		Utility.waitForWebelement(driver,loanType ).sendKeys(lT);
		System.out.println("LOG: INFO- Username Entered");
	}
	
	public void ClickBorR(String bor)
	{
		Utility.waitForWebelement(driver, bOrR).sendKeys(bor);
	}
	
	public void EnterCR(String cr)
	{
		Utility.waitForWebelement(driver,cR ).sendKeys(cr);
		System.out.println("LOG: INFO- Username Entered");
	}
	
	public void ClickCalc()
	{
		Utility.waitForWebelement(driver, cal).click();
	}

}
