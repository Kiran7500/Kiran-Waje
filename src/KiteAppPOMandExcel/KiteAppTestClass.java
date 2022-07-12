package KiteAppPOMandExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;

public class KiteAppTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		
		//I dont Want Notification
		opt.addArguments("--disable-notifications");
		//opt.addArguments("--headless");
		opt.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(opt);
		
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File file = new File("C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Book1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(file).getSheet("Sheet3");
		
		String un = mySheet.getRow(6).getCell(0).getStringCellValue();  
		String pwd = mySheet.getRow(6).getCell(1).getStringCellValue();   
		String pinn = mySheet.getRow(6).getCell(2).getStringCellValue(); 
		
		KiteLoginPage login= new KiteLoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		Thread.sleep(1000); 
		KitePinPage pin= new KitePinPage(driver); 
		pin.sendPin();  
		pin.clickOnContinueButton();
		Thread.sleep(1000); 
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserName();
		
		Thread.sleep(1000);
		

	}

}
