package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddToCart {
	WebDriver dr;
	
	public AddToCart(WebDriver driver){
		this.dr=driver;
		System.out.println("Constructor is called");
	}
	@Test
	public void addProduct(String sProduct){
		//boolean bVal;
		dr.findElement(By.id("searchTerm")).sendKeys(sProduct);
		dr.findElement(By.id("ux2SearchBtn")).click();
		dr.findElement(By.id("addToCart_451078")).click();
		dr.findElement(By.id("addtocart")).click();
		/*boolean bCheck=false;
		bCheck=dr.findElement(By.id("main")).isDisplayed();
		bVal=bCheck;
		if(bCheck){
			System.out.println("Successfully product added :"+ sProduct);
		}else{
			System.out.println(sProduct + "Product is not added:");
		}
		return bVal;*/
	
		
		
	}

	

}
