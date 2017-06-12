package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaplesFindProduct {
	WebDriver dr;
	
	StaplesFindProduct(WebDriver driver){
		this.dr=driver;
		System.out.println("Constructor is called");
	}
	
	
	public void searchProduct(String sProduct){
		dr.findElement(By.id("searchTerm")).clear();
		dr.findElement(By.id("searchTerm")).sendKeys(sProduct);
		dr.findElement(By.id("ux2SearchBtn")).click();
		String sPrCount=dr.findElement(By.id("all-products")).getText();
		System.out.println("Total count of "+sProduct+" is :" + sPrCount);
		
	}

}
