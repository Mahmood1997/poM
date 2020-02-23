package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataProviderFactory.DataProviderFactory;
import helper.BaseClass;
import pages.Calc;

public class MortCalc extends BaseClass{
	
	Calc calc;
	
	@Test(dataProvider="MortData1")
	public void mort1(String homeV, String dPay, String lAmount, String rate) 
	{
		calc = PageFactory.initElements(driver, Calc.class);
		
		logger = report.createTest("User Profile test initiated");
		
		calc.EnterHV(homeV);
		
		logger.info("Username entered");
		
		calc.EnterDP(dPay);
		
		logger.info("Employee Role Selected");
		
		calc.MoneyButton();
		
		logger.info("Employee Name entered");
		
		calc.EnterLoanAMT(lAmount);
		
		logger.info("Status selected");
		
		calc.EnterRate(rate);
		
		
	}
	
	
		
		@DataProvider(name="MortData1")
		public Object[][] getMortData()
		{
			System.out.println("LOG: INFO- Running Data Provider first to generate the data");
			
			int rows =DataProviderFactory.getExcel().getRows("MortData1");
			
			System.out.println("Total number of rows in excel: "+rows);
			
			Object[][]marr = new Object[rows-1][4];
			
			for (int i=0; i<rows-1;i++)
			{
				marr[i][0]= DataProviderFactory.getExcel().getCellData("MortData1", i+1, 0);
				marr[i][1]= DataProviderFactory.getExcel().getCellData("MortData1", i+1, 1);
				marr[i][2]= DataProviderFactory.getExcel().getCellData("MortData1", i+1, 2);
				marr[i][3]= DataProviderFactory.getExcel().getCellData("MortData1", i+1, 3);
				
			}
			 System.out.println("Data Provider Ready For Use");
			 
			 return marr;
		}
		
		@Test(dataProvider="MortData2")
		public void mort2(String loanTerm, String sM, String sY, String pptyT, String PMI, String hI, String HOA, String lT)
		{
			calc.EnterTerm(loanTerm);
			
			calc.EnterSM(sM);
			
			calc.EnterSY(sY);
			
			calc.EnterPT(pptyT);
			
			calc.EnterPMI(PMI);
			
			calc.EnterHI(hI);
			
			calc.ClickHOA(HOA);
			
			calc.EnterLT(lT);
			
		}
		
		@DataProvider(name="MortData2")
		public Object[][] getMortData2()
		{
			System.out.println("LOG: INFO- Running Data Provider first to generate the data");
			
			int rows =DataProviderFactory.getExcel().getRows("MortData2");
			
			System.out.println("Total number of rows in excel: "+rows);
			
			Object[][]mmarr = new Object[rows-1][8];
			
			for (int i=0; i<rows-1;i++)
			{
				mmarr[i][0]= DataProviderFactory.getExcel().getCellData("MortData2", i+1, 0);
				mmarr[i][1]= DataProviderFactory.getExcel().getCellData("MortData2", i+1, 1);
				mmarr[i][2]= DataProviderFactory.getExcel().getCellData("MortData2", i+1, 2);
				mmarr[i][3]= DataProviderFactory.getExcel().getCellData("MortData2", i+1, 3);
				mmarr[i][4]= DataProviderFactory.getExcel().getCellData("MortData2", i+1, 4);
				mmarr[i][5]= DataProviderFactory.getExcel().getCellData("MortData2", i+1, 5);
				mmarr[i][6]= DataProviderFactory.getExcel().getCellData("MortData2", i+1, 6);
				mmarr[i][7]= DataProviderFactory.getExcel().getCellData("MortData2", i+1, 7);
				
				
			}
			 System.out.println("Data Provider Ready For Use");
			 
			 return mmarr;
		}
		
		@Test(dataProvider="MortData3")
		public void mort3(String bor, String cr) 
		{
			calc.ClickBorR(bor);
			
			calc.EnterCR(cr);
			
			calc.ClickCalc();
		}
		
		@DataProvider(name="MortData3")
		public Object[][] getMortData3()
		{
			System.out.println("LOG: INFO- Running Data Provider first to generate the data");
			
			int rows =DataProviderFactory.getExcel().getRows("MortData3");
			
			System.out.println("Total number of rows in excel: "+rows);
			
			Object[][]mmar = new Object[rows-1][2];
			
			for (int i=0; i<rows-1;i++)
			{
				mmar[i][0]= DataProviderFactory.getExcel().getCellData("MortData3", i+1, 0);
				mmar[i][1]= DataProviderFactory.getExcel().getCellData("MortData3", i+1, 1);
				
				
			}
			 System.out.println("Data Provider Ready For Use");
			 
			 return mmar;
		}
		
}


		
