package org.pages;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class MainClass extends BaseClass {
	
	@BeforeClass
	public static void BrowserDriver() {
		Browsers("Chrome");
		MaximizeWindow();
		ImplicitlyWait(10);
		System.out.println(" ----- [ Browser Successfully Launched ] ----- ");
		System.out.println();
	}
	
	@AfterClass
	public static void CloseBrowser() throws IOException {
		
//		if(driver!=null) {
//			Quit();
//			System.out.println(" ----- [ Browser Successfully Closed ] ----- ");
//		}

	}
	
	@Before
	public void ExecutionStarted() {
		Date D = new Date();
		System.out.println("-----> Execution Started -----> " + D);
		System.out.println();
	}
	
	@After
	public void ExecutionEnded() {
		Date D = new Date();
		System.out.println("-----> Execution Ended -----> " + D);
		System.out.println();
	}
	
	@Test
	public void NewUserPage() {		
		try {	
			System.out.println(" ----- [User Entered into Registration Page] -----");
			
			BrowserURL("https://adactinhotelapp.com/index.php");
			Assert.assertTrue("Verify URL",CurrentTitle().contains("Adactin.com"));
			
			NewUserRegistrationPage E = new NewUserRegistrationPage();
			Click(E.getRegistrationPage());
			
			SendKeys(E.getNewUsername(), "SaranRaghu");
			Assert.assertEquals("Verify Username","SaranRaghu", GetAttribute(E.getNewUsername(), "value"));
		
			SendKeys(E.getNewPassword(), "ABC12345");
			Assert.assertEquals("Verify Password", "ABC12345", GetAttribute(E.getNewPassword(),"value"));
			
			SendKeys(E.getConfirmPassword(), "ABC12345");
			Assert.assertEquals("Verify Password", "ABC12345", GetAttribute(E.getConfirmPassword(),"value"));
			
			SendKeys(E.getFullName(), "SaranRaghu98");
			Assert.assertEquals("Verify Fullname", "SaranRaghu98", GetAttribute(E.getFullName(),"value"));
			
			SendKeys(E.getEmailAddress(), "SaranRaghu98@gmail.com");
			Assert.assertEquals("Verify Fullname", "SaranRaghu98@gmail.com", GetAttribute(E.getEmailAddress(),"value"));
			
			ImplicitlyWait(20000);
			
			Click(E.getTermsConditions());
			
			Click(E.getRegister());
			
			System.out.println(" ----- [Successfully New User Created] ----- ");
			System.out.println();
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("A"+e.getMessage());
		}

	}	
	
	@Test
	public void BookingConfirmation() {		
		
		try {
			System.out.println(" ----- [User Entered into Login Page] ----- ");
			
			BrowserURL("https://adactinhotelapp.com/index.php");
			Assert.assertTrue("Verify URL",CurrentTitle().contains("Adactin.com"));
			
			//-------------------------------
			LoginPage L = new LoginPage();
			
			SendKeys(L.getUserName(), "saranraghu98");
			Assert.assertEquals("Verify Username","saranraghu98", GetAttribute(L.getUserName(), "value"));
		
			SendKeys(L.getPassWord(), "B1T3K4");
			Assert.assertEquals("Verify Password","B1T3K4", GetAttribute(L.getPassWord(), "value"));
			
			Click(L.getLoginButton());
			Assert.assertTrue("Verify Login", CurrentURL().contains("adactinhotelapp.com"));
	
			System.out.println(" ----- [User Successfully Logged in] ----- ");
			System.out.println();
			//-------------------------------
			SearchHotel S = new SearchHotel();
			
			System.out.println(" ----- [User entered into Search Page] ----- ");
			
			SelectIndex(S.getLocation(), 2);
			Assert.assertEquals("Verify Location","Melbourne",GetFirstSelectedOption(S.getLocation()));
			
			SelectIndex(S.getHotels(), 1);
			Assert.assertEquals("Hotel Creek", GetFirstSelectedOption(S.getHotels()));
			
			SelectIndex(S.getRoomType(), 3);
			Assert.assertEquals("Deluxe", GetFirstSelectedOption(S.getRoomType()));	
			
			SelectIndex(S.getNoofRooms(), 5);
			Assert.assertEquals("5 - Five", GetFirstSelectedOption(S.getNoofRooms()));
			
			Clear(S.getCheckInDate());
			SendKeys(S.getCheckInDate(), "24/09/2025");
			Assert.assertEquals("24/09/2025", GetAttribute(S.getCheckInDate(), "value"));
			
			Clear(S.getCheckOutDate());
			SendKeys(S.getCheckOutDate(), "26/09/2025");
			Assert.assertEquals("26/09/2025", GetAttribute(S.getCheckOutDate(), "value"));
			
			SelectIndex(S.getAdultsPerRoom(), 3);
			Assert.assertEquals("3 - Three", GetFirstSelectedOption(S.getAdultsPerRoom()));
			
			SelectIndex(S.getChildPerRoom(), 1);
			Assert.assertEquals("1 - One", GetFirstSelectedOption(S.getChildPerRoom()));
			
			Click(S.getSearch());
			Assert.assertTrue("Clicked Submit", CurrentURL().contains("adactinhotelapp"));
			
			System.out.println(" ----- [User Successfully Selected the Hotel] ----- ");
			System.out.println();
			//---------------------------------
			SelectHotel S1 = new SelectHotel();
			Click(S1.getSelectRadioBtn());
			Click(S1.getContinue());
			Assert.assertTrue("Verify Clicked Continue ", CurrentURL().contains("adactinhotelapp.com"));
			
			//--------------------------------
			BookAHotel B = new BookAHotel();
			System.out.println(" ----- [User entered into Confirmation Page] ----- ");
			SendKeys(B.getFirstName(), "Saran");
			Assert.assertEquals("Saran", GetAttribute(B.getFirstName(), "value"));
			
			SendKeys(B.getLastName(), "Raghu");
			Assert.assertEquals("Raghu", GetAttribute(B.getLastName(), "value"));
			
			SendKeys(B.getBillingAddress(), "No : 1 , ABC Street , Chennai, INDIA");
			Assert.assertEquals("No : 1 , ABC Street , Chennai, INDIA", GetAttribute(B.getBillingAddress(), "value"));
			
			SendKeys(B.getCreditCardNo(), "1234567890123456");
			Assert.assertEquals("Verify Credit Card No : ","1234567890123456",GetAttribute(B.getCreditCardNo(), "value" ));
			
			SelectIndex(B.getCreditCardType(), 2);
			Assert.assertEquals("Verify Credit Card Type : ", "VISA", GetFirstSelectedOption(B.getCreditCardType()));
			
			SelectIndex(B.getExpiryDate(), 5);
			Assert.assertEquals("Verify Expiry Date : ", "May", GetFirstSelectedOption(B.getExpiryDate()));
			
			SelectIndex(B.getExpiryDate1(), 2);
			Assert.assertEquals("Verify Expiry Date : ", "2012", GetFirstSelectedOption(B.getExpiryDate1()));
			
			SendKeys(B.getCVVNumber(), "1234");
			Assert.assertEquals("Verify CVV","1234", GetAttribute(B.getCVVNumber(), "value"));
			
			Click(B.getBookNow());
			
			ImplicitlyWait(20000);
			
			ScreenShot(driver, "D:\\Java Course\\TestingCourse2025\\AdactinWeb\\Screenshot\\Adactin.png");
						
			System.out.println("**----- Booking Confirmation Done -----**");
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Test Failed : " + e.getMessage());
		}
		
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
