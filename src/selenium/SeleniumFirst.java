package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class SeleniumFirst {

	static WebDriver driver;
	
	public static void main(String[] args) {

		SeleniumFirst selFr= new SeleniumFirst();
		selFr.openWebsite();
        AddToCart adtc= new AddToCart(driver);
        adtc.addProduct("Pencil");
		
		/*StaplesFindProduct sfpr = new StaplesFindProduct(driver);
		String [] aProduct={"pencil","hanger","board","notebook","glass"};
		for(String a : aProduct){
			sfpr.searchProduct(a);*/
		}
		//selFr.closing();
	



		//driver.quit();


	@BeforeTest
    public void openWebsite(){
		String sUrl="http://www.staples.com";
    	System.setProperty("webdriver.chrome.driver", "E:/saika_/Java/Tutorial4_While_Loop/driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(sUrl);
		this.setDriver(driver);
    }
	public boolean login(String sUser,String sPassword){
		boolean bValue;
		sUser= "saika.ahmed64@gmail.com";
		sPassword= "sa42041#987";
		System.setProperty("webdriver.chrome.driver", "E:/saika_/Java/Tutorial4_While_Loop/driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https:\\www.linkedin.com");
		driver.findElement(By.id("login-email")).sendKeys(sUser);
		driver.findElement(By.id("login-password")).sendKeys(sPassword);
		driver.findElement(By.id("login-submit")).click();
		boolean bHome=false;
		bHome =driver.findElement(By.id("feed-tab-icon")).isDisplayed();
		bValue=bHome;
		if(bHome){
			System.out.println("successfully login: " + sUser);
		}else{
			System.out.println(sUser + " User failed to login" );
		}
		return bValue;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public void closing(){
		driver.quit();
	}
}




