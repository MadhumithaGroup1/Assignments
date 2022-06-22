package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement usernameElement=driver.findElement(By.id("username"));
		usernameElement.sendKeys("Demosalesmanager");
		
		WebElement passwordElement=driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys("crmsfa");
		
		WebElement loginButton=driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		WebElement crmsfaElement=driver.findElement(By.id("label"));
		crmsfaElement.click();
		
		WebElement leadsElement=driver.findElement(By.linkText("Leads"));
		leadsElement.click();
		
		WebElement createleadElement=driver.findElement(By.linkText("Create Lead"));
		createleadElement.click();
		
		WebElement companynameElement=driver.findElement(By.id("createLeadForm_companyName"));
		companynameElement.sendKeys("CTS");
		
		WebElement firstnameElement=driver.findElement(By.id("createLeadForm_firstName"));
		firstnameElement.sendKeys("Madhumitha");
		
		WebElement lastnameElement=driver.findElement(By.id("createLeadForm_lastName"));
		lastnameElement.sendKeys("Srikanth");
		
		WebElement firstnamelocalElement=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstnamelocalElement.sendKeys("Madhu");
		
		WebElement departmentnameElement=driver.findElement(By.name("departmentName"));
		departmentnameElement.sendKeys("QA");
		
		WebElement descriptionElement=driver.findElement(By.name("description"));
		descriptionElement.sendKeys("abc xyz");
		
		WebElement emailaddressElement=driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailaddressElement.sendKeys("abc.xyz@gmail.com");
		
		WebElement stateprovinceElement=driver.findElement(By.name("generalStateProvinceGeoId"));
		stateprovinceElement.click();
		Select dd=new Select(stateprovinceElement);
		dd.selectByVisibleText("New York");
		
		WebElement finalcreateElement=driver.findElement(By.name("submitButton"));
		finalcreateElement.click();
		
		System.out.println("The title of the resulting page is "+driver.getTitle());
		
	}
	
}
