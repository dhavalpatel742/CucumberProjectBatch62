package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void openLoginPage() {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		driver = new FirefoxDriver(); 		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=8Zw3SczUubA&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiOFp3M1NjelV1YkEiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1ODA3MzI0NiwiaWF0IjoxNjU4MDcyMDQ2LCJqdGkiOiJjMTRmODVkNy02NzU5LTQ4MzYtYTNiZi1kZTU0NzRlZDhhMGQiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.BCM59fJ3l24Nop1Z4pHHtSTdHMp9uRd7hylJhBirwYtBYYbyIKrsMMkfZeZIE57O4IwtH61_7swbAU6Di7P2b3aUDM8E0Xq6AmKIGlwDZX8nmuEa1lW0gvPsCk7vrJK2aBu1pSlPe9AX198HCjyPqLCMV7bH6N_L7xTN2ewxrW7IAoRfLLdeQgH6hro2C518-hJNVtclNFHQCQ1ZseIxNSBQiEvpZpdC0LIEV5Nh2Y--10czGRD38iK7lhnJu13GwCtT9DgtFXDTWPUCzF9NXqjOrNtVHqeC2grB0HGD-HOReCJlrvt-F7L8FZ9JqsXphfKdSCgfFnFLvDsXUkLFUQ&preferred_environment="); 
	}
	
	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void enterEmailAndPassword(String a, String b) {
		driver.findElement(By.id("usernameInput-input")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(By.id("signIn")).click();
	}
	
	public String readErr() {
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		return actualErr;
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
